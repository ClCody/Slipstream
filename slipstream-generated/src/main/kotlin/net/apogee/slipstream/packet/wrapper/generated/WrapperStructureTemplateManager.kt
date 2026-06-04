package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructureTemplateManager(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager") }
        private val lookup = MethodHandles.lookup()

        val getHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "get", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val saveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "save", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val readStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "readStructure", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate"), Class.forName("java.io.InputStream")))
        }
        val loadFromResourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "loadFromResource", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val loadFromGeneratedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "loadFromGenerated", MethodType.methodType(Class.forName("java.util.Optional"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val listTemplatesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listTemplates", MethodType.methodType(Class.forName("java.util.stream.Stream")))
        }
        val getOrCreateHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreate", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplate"), Class.forName("net.minecraft.resources.ResourceLocation")))
        }
        val createAndValidatePathToGeneratedStructureHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "createAndValidatePathToGeneratedStructure", MethodType.methodType(Class.forName("java.nio.file.Path"), Class.forName("net.minecraft.resources.ResourceLocation"), String::class.java))
        }
        val resourceManagerSetterHandle: MethodHandle by lazy { 
            val f = packetClass.getDeclaredField("resourceManager")
            f.isAccessible = true
            lookup.unreflectSetter(f)
        }
    }

    fun get(arg0: WrapperResourceLocation): Any {
        return getHandle.invoke(handle, arg0.handle) as Any
    }

    fun save(arg0: WrapperResourceLocation): Boolean {
        return saveHandle.invoke(handle, arg0.handle) as Boolean
    }

    fun readStructure(arg0: Any): WrapperStructureTemplate {
        return WrapperStructureTemplate(readStructureHandle.invoke(handle, arg0))
    }

    fun loadFromResource(arg0: WrapperResourceLocation): Any {
        return loadFromResourceHandle.invoke(handle, arg0.handle) as Any
    }

    fun loadFromGenerated(arg0: WrapperResourceLocation): Any {
        return loadFromGeneratedHandle.invoke(handle, arg0.handle) as Any
    }

    val listTemplates: Any
        get() = listTemplatesHandle.invoke(handle) as Any

    fun getOrCreate(arg0: WrapperResourceLocation): WrapperStructureTemplate {
        return WrapperStructureTemplate(getOrCreateHandle.invoke(handle, arg0.handle))
    }

    fun createAndValidatePathToGeneratedStructure(arg0: WrapperResourceLocation, arg1: String): Any {
        return createAndValidatePathToGeneratedStructureHandle.invoke(handle, arg0.handle, arg1) as Any
    }

    fun setResourceManager(value: WrapperResourceManager) {
        resourceManagerSetterHandle.invoke(handle, value.handle)
    }

}
