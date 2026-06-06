package net.apogee.slipstream.generator

import io.github.classgraph.ClassGraph
import java.io.File
import java.lang.reflect.Modifier
import java.lang.reflect.Method

val keywords = setOf("is", "in", "object", "as", "typealias", "typeof", "val", "var", "when", "class", "interface", "fun", "for", "while", "if", "else", "try", "catch", "finally", "do", "throw", "return", "break", "continue", "super", "this", "null", "true", "false", "package", "import")

fun sanitize(name: String): String {
    if (name in keywords || name.contains("$")) return "`$name`"
    return name
}

val objectMethods = setOf("equals", "hashCode", "toString", "getClass", "notify", "notifyAll", "wait")

fun main() {
    val outputDir = File("../slipstream-generated/src/main/kotlin/net/apogee/slipstream/packet/wrapper/generated")
    if (outputDir.exists()) {
        outputDir.deleteRecursively()
    }
    outputDir.mkdirs()

    println("Scanning classpath for Packet classes...")
    
    val classesToWrap = mutableSetOf<Class<*>>()
    val wrappersToGenerate = mutableSetOf<Class<*>>()

    ClassGraph()
        .enableAllInfo()
        .acceptPackages("net.minecraft.network.protocol")
        .scan().use { scanResult ->
            val packetInterface = scanResult.getClassInfo("net.minecraft.network.protocol.Packet")
            for (classInfo in packetInterface.classesImplementing) {
                if (!classInfo.isAbstract && !classInfo.isInterface) {
                    classesToWrap.add(classInfo.loadClass())
                }
            }
        }
        
    // Discover nested NMS structures
    val queue = classesToWrap.toMutableList()
    val processed = mutableSetOf<Class<*>>()
    
    while(queue.isNotEmpty()) {
        val clazz = queue.removeFirst()
        if (!processed.add(clazz)) continue
        wrappersToGenerate.add(clazz)
        
        val methods = getValidMethods(clazz)
        for (m in methods) {
            val ret = m.returnType
            if (ret.name.startsWith("net.minecraft.") && !ret.isEnum && !ret.isArray) {
                if (ret !in processed) queue.add(ret)
            }
            for (param in m.parameterTypes) {
                if (param.name.startsWith("net.minecraft.") && !param.isEnum && !param.isArray) {
                    if (param !in processed) queue.add(param)
                }
            }
        }
    }

    val classesWithWrappers = mutableSetOf<Class<*>>()
    for (clazz in wrappersToGenerate) {
        val validMethods = getValidMethods(clazz)
        val fields = clazz.declaredFields.filter { !Modifier.isStatic(it.modifiers) }
        if (validMethods.isNotEmpty() || fields.isNotEmpty()) {
            classesWithWrappers.add(clazz)
        }
    }

    var count = 0
    val generatedWrapperNames = mutableListOf<String>()
    
    for (clazz in classesWithWrappers) {
        val name = generateWrapper(clazz, outputDir, classesWithWrappers)
        if (name != null) {
            generatedWrapperNames.add(name)
            count++
        }
    }
    
    generateExtensionsFile(generatedWrapperNames, outputDir)
    
    println("Successfully generated $count wrappers and PacketExtensions.kt in slipstream-generated!")
}

fun getValidMethods(clazz: Class<*>): List<Method> {
    if (clazz.isRecord) {
        return clazz.recordComponents.map { it.accessor }
    }
    return clazz.declaredMethods.filter {
        Modifier.isPublic(it.modifiers) &&
        !Modifier.isStatic(it.modifiers) &&
        !it.isBridge &&
        !it.isSynthetic &&
        it.name !in objectMethods &&
        it.returnType != Void.TYPE
    }.distinctBy { it.name }
}

fun getKotlinType(javaClass: Class<*>, classesWithWrappers: Set<Class<*>>): String {
    return when (javaClass) {
        Integer.TYPE -> "Int"
        java.lang.Double.TYPE -> "Double"
        java.lang.Float.TYPE -> "Float"
        java.lang.Boolean.TYPE -> "Boolean"
        java.lang.Long.TYPE -> "Long"
        java.lang.Byte.TYPE -> "Byte"
        java.lang.Short.TYPE -> "Short"
        java.lang.Character.TYPE -> "Char"
        ByteArray::class.java -> "ByteArray"
        IntArray::class.java -> "IntArray"
        String::class.java -> "String"
        else -> {
            if (classesWithWrappers.contains(javaClass)) {
                "Wrapper${javaClass.simpleName}"
            } else {
                "Any"
            }
        }
    }
}

fun getJavaClassRef(javaClass: Class<*>): String {
    return when (javaClass) {
        Integer.TYPE -> "Int::class.javaPrimitiveType!!"
        java.lang.Double.TYPE -> "Double::class.javaPrimitiveType!!"
        java.lang.Float.TYPE -> "Float::class.javaPrimitiveType!!"
        java.lang.Boolean.TYPE -> "Boolean::class.javaPrimitiveType!!"
        java.lang.Long.TYPE -> "Long::class.javaPrimitiveType!!"
        java.lang.Byte.TYPE -> "Byte::class.javaPrimitiveType!!"
        java.lang.Short.TYPE -> "Short::class.javaPrimitiveType!!"
        java.lang.Character.TYPE -> "Char::class.javaPrimitiveType!!"
        Void.TYPE -> "Void.TYPE"
        ByteArray::class.java -> "ByteArray::class.java"
        IntArray::class.java -> "IntArray::class.java"
        String::class.java -> "String::class.java"
        else -> "Class.forName(\"" + javaClass.name.replace(36.toChar().toString(), "\\$") + "\")"
    }
}

fun generateWrapper(clazz: Class<*>, outputDir: File, classesWithWrappers: Set<Class<*>>): String? {
    val simpleName = clazz.simpleName
    val wrapperName = "Wrapper$simpleName"
    
    val validMethods = getValidMethods(clazz)
    
    // Also find accessible fields to create setters and mutators
    val fields = clazz.declaredFields.filter { !Modifier.isStatic(it.modifiers) }
    
    if (validMethods.isEmpty() && fields.isEmpty()) return null

    val sb = StringBuilder()
    sb.append("package net.apogee.slipstream.packet.wrapper.generated\n\n")
    sb.append("import java.lang.invoke.MethodHandle\n")
    sb.append("import java.lang.invoke.MethodHandles\n")
    sb.append("import java.lang.invoke.MethodType\n")
    sb.append("import java.lang.reflect.Field\n\n")
    sb.append("@JvmInline\n")
    sb.append("value class $wrapperName(val handle: Any) {\n")
    sb.append("    companion object {\n")
    sb.append("        val packetClass: Class<*> by lazy { Class.forName(\"${clazz.name.replace(36.toChar().toString(), "\\$")}\") }\n")
    sb.append("        private val lookup = MethodHandles.lookup()\n\n")
    
    val existingSetters = validMethods.filter { it.name.startsWith("set") && it.parameterCount == 1 }.map { it.name }.toSet()
    
    for (method in validMethods) {
        val handleName = sanitize("${method.name}Handle")
        val params = method.parameterTypes.joinToString(", ") { getJavaClassRef(it) }
        val returnRef = getJavaClassRef(method.returnType)
        val methodTypeArgs = if (params.isEmpty()) returnRef else "$returnRef, $params"
        
        sb.append("        val $handleName: MethodHandle by lazy { \n")
        sb.append("            lookup.findVirtual(packetClass, \"${method.name.replace("$", "\\$")}\", MethodType.methodType($methodTypeArgs))\n")
        sb.append("        }\n")
    }
    
    for (field in fields) {
        if (!Modifier.isFinal(field.modifiers)) {
            val funcNameUnsanitized = "set${field.name.replaceFirstChar { it.uppercase() }}"
            if (existingSetters.contains(funcNameUnsanitized)) continue
            
            val handleName = sanitize("${field.name}SetterHandle")
            sb.append("        val $handleName: MethodHandle by lazy { \n")
            sb.append("            val f = packetClass.getDeclaredField(\"${field.name.replace("$", "\\$")}\")\n")
            sb.append("            f.isAccessible = true\n")
            sb.append("            lookup.unreflectSetter(f)\n")
            sb.append("        }\n")
        }
    }
    
    if (clazz.isRecord) {
        val constructorParams = clazz.recordComponents.joinToString(", ") { getJavaClassRef(it.type) }
        sb.append("        val constructorHandle: MethodHandle by lazy { \n")
        sb.append("            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, $constructorParams))\n")
        sb.append("        }\n")
    }
    
    sb.append("    }\n\n")
    
    val existingProps = mutableSetOf<String>("handle")
    val zeroArgMethodNames = validMethods.filter { it.parameterCount == 0 }.map { it.name }.toSet()
    
    for (method in validMethods) {
        val handleName = sanitize("${method.name}Handle")
        var propName = if (clazz.isRecord) method.name else method.name.removePrefix("get").removePrefix("is").removePrefix("has")
        if (propName.isEmpty()) propName = method.name
        propName = propName.replaceFirstChar { it.lowercase() }
        
        if (method.parameterCount == 0) {
            if ((propName != method.name && zeroArgMethodNames.contains(propName)) || !existingProps.add(propName)) {
                var fallback = method.name
                var counter = 2
                while (!existingProps.add(fallback)) {
                    fallback = "${method.name}$counter"
                    counter++
                }
                propName = fallback
            }
        }
        
        propName = sanitize(propName)
        val methodName = sanitize(method.name)
        
        val retType = getKotlinType(method.returnType, classesWithWrappers)
        val isWrapper = retType.startsWith("Wrapper")
        
        if (method.parameterCount == 0) {
            sb.append("    val $propName: $retType\n")
            if (isWrapper) {
                sb.append("        get() = $retType($handleName.invoke(handle))\n\n")
            } else {
                sb.append("        get() = $handleName.invoke(handle) as $retType\n\n")
            }
        } else {
            val argsDecl = method.parameters.mapIndexed { i, p -> "arg$i: ${getKotlinType(p.type, classesWithWrappers)}" }.joinToString(", ")
            val argsPass = method.parameters.mapIndexed { i, p -> if (getKotlinType(p.type, classesWithWrappers).startsWith("Wrapper")) "arg$i.handle" else "arg$i" }.joinToString(", ")
            sb.append("    fun $methodName($argsDecl): $retType {\n")
            if (isWrapper) {
                sb.append("        return $retType($handleName.invoke(handle, $argsPass))\n")
            } else {
                sb.append("        return $handleName.invoke(handle, $argsPass) as $retType\n")
            }
            sb.append("    }\n\n")
        }
    }
    
    for (field in fields) {
        if (!Modifier.isFinal(field.modifiers)) {
            val funcNameUnsanitized = "set${field.name.replaceFirstChar { it.uppercase() }}"
            if (existingSetters.contains(funcNameUnsanitized)) continue
            
            val handleName = sanitize("${field.name}SetterHandle")
            val retType = getKotlinType(field.type, classesWithWrappers)
            val isWrapper = retType.startsWith("Wrapper")
            val funcName = sanitize(funcNameUnsanitized)
            sb.append("    fun $funcName(value: $retType) {\n")
            if (isWrapper) {
                sb.append("        $handleName.invoke(handle, value.handle)\n")
            } else {
                sb.append("        $handleName.invoke(handle, value)\n")
            }
            sb.append("    }\n\n")
        }
    }
    
    if (clazz.isRecord) {
        val argsDecl = clazz.recordComponents.joinToString(", ") { 
            "${sanitize(it.name)}: ${getKotlinType(it.type, classesWithWrappers)} = this.${sanitize(it.name)}" 
        }
        val argsPass = clazz.recordComponents.joinToString(", ") { 
            if (getKotlinType(it.type, classesWithWrappers).startsWith("Wrapper")) "${sanitize(it.name)}.handle" else sanitize(it.name) 
        }
        sb.append("    fun copy($argsDecl): $wrapperName {\n")
        sb.append("        return $wrapperName(constructorHandle.invoke($argsPass))\n")
        sb.append("    }\n\n")
    }
    
    sb.append("}\n")
    
    File(outputDir, "$wrapperName.kt").writeText(sb.toString())
    return wrapperName
}

fun generateExtensionsFile(wrapperNames: List<String>, outputDir: File) {
    val sb = StringBuilder()
    sb.append("package net.apogee.slipstream.packet.wrapper.generated\n\n")
    sb.append("import java.lang.ClassValue\n\n")
    sb.append("/**\n")
    sb.append(" * Универсальный extension для type-safe проверки и каста NMS пакетов и структур.\n")
    sb.append(" * Использование: val movePacket = packet.wrapAs<WrapperClientboundMoveEntityPacket>()\n")
    sb.append(" */\n")
    
    sb.append("class WrapperInfo(val packetClass: Class<*>, val constructor: (Any) -> Any)\n\n")
    
    sb.append("val wrapperRegistry = object : ClassValue<WrapperInfo?>() {\n")
    sb.append("    override fun computeValue(type: Class<*>): WrapperInfo? {\n")
    sb.append("        return when (type.name) {\n")
    for (name in wrapperNames) {
        sb.append("            \"net.apogee.slipstream.packet.wrapper.generated.$name\" -> WrapperInfo($name.packetClass) { $name(it) }\n")
    }
    sb.append("            else -> null\n")
    sb.append("        }\n")
    sb.append("    }\n")
    sb.append("}\n\n")

    sb.append("@Suppress(\"UNCHECKED_CAST\")\n")
    sb.append("inline fun <reified T : Any> Any.wrapAs(): T? {\n")
    sb.append("    val info = wrapperRegistry.get(T::class.java)\n")
    sb.append("    if (info != null && info.packetClass.isInstance(this)) {\n")
    sb.append("        return info.constructor(this) as T\n")
    sb.append("    }\n")
    sb.append("    return null\n")
    sb.append("}\n")
    
    File(outputDir, "PacketExtensions.kt").writeText(sb.toString())
}
