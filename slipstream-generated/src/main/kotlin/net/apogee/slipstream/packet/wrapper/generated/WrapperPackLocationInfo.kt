package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperPackLocationInfo(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.packs.PackLocationInfo") }
        private val lookup = MethodHandles.lookup()

        val idHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "id", MethodType.methodType(String::class.java))
        }
        val titleHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "title", MethodType.methodType(Class.forName("net.minecraft.network.chat.Component")))
        }
        val sourceHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "source", MethodType.methodType(Class.forName("net.minecraft.server.packs.repository.PackSource")))
        }
        val knownPackInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "knownPackInfo", MethodType.methodType(Class.forName("java.util.Optional")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, String::class.java, Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.server.packs.repository.PackSource"), Class.forName("java.util.Optional")))
        }
    }

    val id: String
        get() = idHandle.invoke(handle) as String

    val title: WrapperComponent
        get() = WrapperComponent(titleHandle.invoke(handle))

    val source: WrapperPackSource
        get() = WrapperPackSource(sourceHandle.invoke(handle))

    val knownPackInfo: Any
        get() = knownPackInfoHandle.invoke(handle) as Any

    fun copy(id: String = this.id, title: WrapperComponent = this.title, source: WrapperPackSource = this.source, knownPackInfo: Any = this.knownPackInfo): WrapperPackLocationInfo {
        return WrapperPackLocationInfo(constructorHandle.invoke(id, title.handle, source.handle, knownPackInfo))
    }

}
