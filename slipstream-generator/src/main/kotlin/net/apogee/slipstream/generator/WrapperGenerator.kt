package net.apogee.slipstream.generator

import io.github.classgraph.ClassGraph
import java.io.File
import java.lang.reflect.Modifier

fun main() {
    val outputDir = File("../slipstream-generated/src/main/kotlin/net/apogee/slipstream/packet/wrapper/generated")
    if (outputDir.exists()) {
        outputDir.deleteRecursively()
    }
    outputDir.mkdirs()

    println("Scanning classpath for Packet classes...")
    var count = 0
    ClassGraph()
        .enableAllInfo()
        .acceptPackages("net.minecraft.network.protocol")
        .scan().use { scanResult ->
            val packetInterface = scanResult.getClassInfo("net.minecraft.network.protocol.Packet")
            val implementations = packetInterface.classesImplementing
            
            for (classInfo in implementations) {
                if (classInfo.isAbstract || classInfo.isInterface) continue
                
                val clazz = classInfo.loadClass()
                if (generateWrapper(clazz, outputDir)) {
                    count++
                }
            }
        }
    println("Successfully generated $count wrappers in slipstream-generated!")
}

fun getKotlinType(javaClass: Class<*>): String {
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
        else -> "Any" // We fallback to Any for NMS objects to avoid importing them
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

fun generateWrapper(clazz: Class<*>, outputDir: File): Boolean {
    val simpleName = clazz.simpleName
    if (!simpleName.endsWith("Packet")) return false
    
    val wrapperName = "Wrapper$simpleName"
    val validMethods = clazz.declaredMethods.filter {
        Modifier.isPublic(it.modifiers) &&
        !Modifier.isStatic(it.modifiers) &&
        (it.name.startsWith("get") || it.name.startsWith("is") || it.name.startsWith("has")) &&
        it.returnType != Void.TYPE &&
        it.name != "getClass"
    }.distinctBy { it.name } // Avoid overloads for simplicity in generated wrappers

    if (validMethods.isEmpty()) return false

    val sb = StringBuilder()
    sb.append("package net.apogee.slipstream.packet.wrapper.generated\n\n")
    sb.append("import java.lang.invoke.MethodHandle\n")
    sb.append("import java.lang.invoke.MethodHandles\n")
    sb.append("import java.lang.invoke.MethodType\n\n")
    sb.append("@JvmInline\n")
    sb.append("value class $wrapperName(val handle: Any) {\n")
    sb.append("    companion object {\n")
    sb.append("        val packetClass: Class<*> by lazy { Class.forName(\"${clazz.name}\") }\n")
    sb.append("        private val lookup = MethodHandles.lookup()\n\n")
    
    for (method in validMethods) {
        val handleName = "${method.name}Handle"
        val params = method.parameterTypes.joinToString(", ") { getJavaClassRef(it) }
        val returnRef = getJavaClassRef(method.returnType)
        val methodTypeArgs = if (params.isEmpty()) returnRef else "$returnRef, $params"
        
        sb.append("        val $handleName: MethodHandle by lazy { \n")
        sb.append("            lookup.findVirtual(packetClass, \"${method.name}\", MethodType.methodType($methodTypeArgs))\n")
        sb.append("        }\n")
    }
    sb.append("    }\n\n")
    
    for (method in validMethods) {
        val handleName = "${method.name}Handle"
        var propName = method.name.removePrefix("get").removePrefix("is").removePrefix("has")
        if (propName.isEmpty()) propName = method.name
        propName = propName.replaceFirstChar { it.lowercase() }
        
        val retType = getKotlinType(method.returnType)
        
        if (method.parameterCount == 0) {
            sb.append("    val $propName: $retType\n")
            sb.append("        get() = $handleName.invoke(handle) as $retType\n\n")
        } else {
            val argsDecl = method.parameters.mapIndexed { i, p -> "arg$i: ${getKotlinType(p.type)}" }.joinToString(", ")
            val argsPass = method.parameters.mapIndexed { i, _ -> "arg$i" }.joinToString(", ")
            sb.append("    fun ${method.name}($argsDecl): $retType {\n")
            sb.append("        return $handleName.invoke(handle, $argsPass) as $retType\n")
            sb.append("    }\n\n")
        }
    }
    
    sb.append("}\n\n")
    
    sb.append("fun Any.is$simpleName(): Boolean = $wrapperName.packetClass.isInstance(this)\n")
    sb.append("fun Any.as$simpleName(): $wrapperName = $wrapperName(this)\n")
    
    File(outputDir, "$wrapperName.kt").writeText(sb.toString())
    return true
}
