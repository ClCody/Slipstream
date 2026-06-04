package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType

@JvmInline
value class WrapperServerboundSetStructureBlockPacket(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.network.protocol.game.ServerboundSetStructureBlockPacket") }
        private val lookup = MethodHandles.lookup()

        val getNameHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getName", MethodType.methodType(String::class.java))
        }
        val getSizeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSize", MethodType.methodType(Class.forName("net.minecraft.core.Vec3i")))
        }
        val getOffsetHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOffset", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getSeedHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getSeed", MethodType.methodType(Long::class.javaPrimitiveType!!))
        }
        val getDataHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getData", MethodType.methodType(String::class.java))
        }
        val getPosHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPos", MethodType.methodType(Class.forName("net.minecraft.core.BlockPos")))
        }
        val getRotationHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getRotation", MethodType.methodType(Class.forName("net.minecraft.world.level.block.Rotation")))
        }
        val isIgnoreEntitiesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isIgnoreEntities", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getIntegrityHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getIntegrity", MethodType.methodType(Float::class.javaPrimitiveType!!))
        }
        val isShowBoundingBoxHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShowBoundingBox", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
        val getUpdateTypeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getUpdateType", MethodType.methodType(Class.forName("net.minecraft.world.level.block.entity.StructureBlockEntity\$UpdateType")))
        }
        val getModeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMode", MethodType.methodType(Class.forName("net.minecraft.world.level.block.state.properties.StructureMode")))
        }
        val getMirrorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getMirror", MethodType.methodType(Class.forName("net.minecraft.world.level.block.Mirror")))
        }
        val isShowAirHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "isShowAir", MethodType.methodType(Boolean::class.javaPrimitiveType!!))
        }
    }

    val name: String
        get() = getNameHandle.invoke(handle) as String

    val size: Any
        get() = getSizeHandle.invoke(handle) as Any

    val offset: Any
        get() = getOffsetHandle.invoke(handle) as Any

    val seed: Long
        get() = getSeedHandle.invoke(handle) as Long

    val data: String
        get() = getDataHandle.invoke(handle) as String

    val pos: Any
        get() = getPosHandle.invoke(handle) as Any

    val rotation: Any
        get() = getRotationHandle.invoke(handle) as Any

    val ignoreEntities: Boolean
        get() = isIgnoreEntitiesHandle.invoke(handle) as Boolean

    val integrity: Float
        get() = getIntegrityHandle.invoke(handle) as Float

    val showBoundingBox: Boolean
        get() = isShowBoundingBoxHandle.invoke(handle) as Boolean

    val updateType: Any
        get() = getUpdateTypeHandle.invoke(handle) as Any

    val mode: Any
        get() = getModeHandle.invoke(handle) as Any

    val mirror: Any
        get() = getMirrorHandle.invoke(handle) as Any

    val showAir: Boolean
        get() = isShowAirHandle.invoke(handle) as Boolean

}

fun Any.isServerboundSetStructureBlockPacket(): Boolean = WrapperServerboundSetStructureBlockPacket.packetClass.isInstance(this)
fun Any.asServerboundSetStructureBlockPacket(): WrapperServerboundSetStructureBlockPacket = WrapperServerboundSetStructureBlockPacket(this)
