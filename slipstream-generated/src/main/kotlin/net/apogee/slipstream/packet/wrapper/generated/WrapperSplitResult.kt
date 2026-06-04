package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperSplitResult(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.core.component.DataComponentPatch\$SplitResult") }
        private val lookup = MethodHandles.lookup()

        val addedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "added", MethodType.methodType(Class.forName("net.minecraft.core.component.DataComponentMap")))
        }
        val removedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removed", MethodType.methodType(Class.forName("java.util.Set")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.core.component.DataComponentMap"), Class.forName("java.util.Set")))
        }
    }

    val added: WrapperDataComponentMap
        get() = WrapperDataComponentMap(addedHandle.invoke(handle))

    val removed: Any
        get() = removedHandle.invoke(handle) as Any

    fun copy(added: WrapperDataComponentMap = this.added, removed: Any = this.removed): WrapperSplitResult {
        return WrapperSplitResult(constructorHandle.invoke(added.handle, removed))
    }

}
