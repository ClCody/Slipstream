package net.apogee.slipstream.packet

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.reflect.Method

/**
 * Реестр сверхбыстрых указателей на методы NMS пакетов.
 * В 1.20.5+ Paper использует Mojang маппинги в рантайме, поэтому резолвер больше не нужен.
 */
object PacketMappers {
    
    // Больше не используется в 1.21+
    @JvmStatic
    var mappingResolver: Any? = null

    @JvmStatic lateinit var serverboundMovePlayerPacketClass: Class<*>
    @JvmStatic lateinit var serverboundPlayerCommandPacketClass: Class<*>
    @JvmStatic lateinit var serverboundPlayerActionPacketClass: Class<*>
    @JvmStatic lateinit var serverboundPongPacketClass: Class<*>
    @JvmStatic lateinit var serverboundPlayerInputPacketClass: Class<*>
    @JvmStatic lateinit var serverboundChatPacketClass: Class<*>
    @JvmStatic lateinit var serverboundSwingPacketClass: Class<*>
    
    @JvmStatic lateinit var clientboundUpdateAttributesPacketClass: Class<*>
    @JvmStatic lateinit var clientboundSetEntityDataPacketClass: Class<*>
    @JvmStatic lateinit var clientboundSystemChatPacketClass: Class<*>
    @JvmStatic lateinit var clientboundPlayerInfoUpdatePacketClass: Class<*>
    
    // Visualization / Entity
    @JvmStatic lateinit var clientboundAddEntityPacketClass: Class<*>
    @JvmStatic lateinit var clientboundRemoveEntitiesPacketClass: Class<*>
    @JvmStatic lateinit var clientboundTeleportEntityPacketClass: Class<*>
    @JvmStatic lateinit var clientboundLevelEventPacketClass: Class<*>

    // UI
    @JvmStatic lateinit var clientboundBossEventPacketClass: Class<*>
    @JvmStatic lateinit var clientboundSetTitleTextPacketClass: Class<*>
    @JvmStatic lateinit var clientboundSetSubtitleTextPacketClass: Class<*>
    @JvmStatic lateinit var clientboundSetTitlesAnimationPacketClass: Class<*>
    
    // Inventory
    @JvmStatic lateinit var clientboundContainerSetSlotPacketClass: Class<*>
    @JvmStatic lateinit var clientboundContainerSetContentPacketClass: Class<*>
    @JvmStatic lateinit var clientboundContainerClosePacketClass: Class<*>

    // Utility
    @JvmStatic lateinit var clientboundDisconnectPacketClass: Class<*>
    @JvmStatic lateinit var clientboundResourcePackPushPacketClass: Class<*>
    
    @JvmStatic lateinit var clientboundPingPacketClass: Class<*>
    @JvmStatic lateinit var clientboundSetEntityVelocityPacketClass: Class<*>
    @JvmStatic lateinit var serverboundInteractPacketClass: Class<*>
    @JvmStatic lateinit var serverboundUseItemOnPacketClass: Class<*>
    
    lateinit var movePacketGetX: MethodHandle
    lateinit var movePacketGetY: MethodHandle
    lateinit var movePacketGetZ: MethodHandle
    lateinit var movePacketGetYaw: MethodHandle
    lateinit var movePacketGetPitch: MethodHandle
    lateinit var movePacketHasPos: MethodHandle
    lateinit var movePacketHasRot: MethodHandle
    lateinit var movePacketIsOnGround: MethodHandle

    enum class VelocityFormat { 
        /** entityId (int), xa, ya, za (ints, scaled by 8000) */
        LEGACY_INTS, 
        /** id (int), delta (Vec3 object) */
        MOTION_RECORD 
    }
    
    var velocityFormat: VelocityFormat = VelocityFormat.LEGACY_INTS

    // Карта для сопоставления оберток Kotlin с примитивами Java
    private val primitiveMap = mapOf(
        Double::class.javaObjectType to java.lang.Double.TYPE,
        Int::class.javaObjectType to java.lang.Integer.TYPE,
        Boolean::class.javaObjectType to java.lang.Boolean.TYPE,
        Float::class.javaObjectType to java.lang.Float.TYPE,
        Long::class.javaObjectType to java.lang.Long.TYPE,
        Byte::class.javaObjectType to java.lang.Byte.TYPE,
        Short::class.javaObjectType to java.lang.Short.TYPE,
        Char::class.javaObjectType to java.lang.Character.TYPE
    )

    fun init() {
        val lookup = MethodHandles.lookup()
        
        serverboundMovePlayerPacketClass = Class.forName("net.minecraft.network.protocol.game.ServerboundMovePlayerPacket")
        serverboundPlayerCommandPacketClass = Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket")
        serverboundPlayerActionPacketClass = try {
            Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerActionPacket")
        } catch (e: Exception) {
            Class.forName("net.minecraft.network.protocol.game.PacketPlayInBlockDig")
        }
        serverboundPongPacketClass = try {
            Class.forName("net.minecraft.network.protocol.common.ServerboundPongPacket")
        } catch (e: ClassNotFoundException) {
            Class.forName("net.minecraft.network.protocol.game.ServerboundPongPacket")
        }
        serverboundPlayerInputPacketClass = Class.forName("net.minecraft.network.protocol.game.ServerboundPlayerInputPacket")
        serverboundChatPacketClass = Class.forName("net.minecraft.network.protocol.game.ServerboundChatPacket")

        clientboundUpdateAttributesPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket")
        clientboundSetEntityDataPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket")
        clientboundSystemChatPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundSystemChatPacket")
        clientboundPlayerInfoUpdatePacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket")

        clientboundAddEntityPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundAddEntityPacket")
        clientboundRemoveEntitiesPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket")
        clientboundTeleportEntityPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket")
        clientboundLevelEventPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundLevelEventPacket")

        clientboundBossEventPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundBossEventPacket")
        clientboundSetTitleTextPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket")
        clientboundSetSubtitleTextPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket")
        clientboundSetTitlesAnimationPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket")

        clientboundContainerSetSlotPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket")
        clientboundContainerSetContentPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket")
        clientboundContainerClosePacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundContainerClosePacket")

        clientboundSetEntityVelocityPacketClass = try {
            val clazz = Class.forName("net.minecraft.network.protocol.game.ClientboundSetEntityVelocityPacket")
            velocityFormat = VelocityFormat.LEGACY_INTS
            clazz
        } catch (e: ClassNotFoundException) {
            try {
                val clazz = Class.forName("net.minecraft.network.protocol.game.ClientboundSetEntityMotionPacket")
                // Check if it uses legacy ints by checking field types
                if (clazz.declaredFields.count { it.type == Integer.TYPE } >= 4) {
                    velocityFormat = VelocityFormat.LEGACY_INTS
                } else {
                    velocityFormat = VelocityFormat.MOTION_RECORD
                }
                clazz
            } catch (e2: ClassNotFoundException) {
                try {
                    val clazz = Class.forName("net.minecraft.network.protocol.common.ClientboundSetEntityVelocityPacket")
                    velocityFormat = VelocityFormat.LEGACY_INTS
                    clazz
                } catch (e3: ClassNotFoundException) {
                    val clazz = Class.forName("net.minecraft.network.protocol.game.PacketPlayOutEntityVelocity")
                    velocityFormat = VelocityFormat.LEGACY_INTS
                    clazz
                }
            }
        }
        
        serverboundInteractPacketClass = try {
            Class.forName("net.minecraft.network.protocol.game.ServerboundInteractPacket")
        } catch (e: ClassNotFoundException) {
            try {
                Class.forName("net.minecraft.network.protocol.common.ServerboundInteractPacket")
            } catch (e2: ClassNotFoundException) {
                Class.forName("net.minecraft.network.protocol.game.PacketPlayInUseEntity")
            }
        }
        
        serverboundUseItemOnPacketClass = try {
            Class.forName("net.minecraft.network.protocol.game.ServerboundUseItemOnPacket")
        } catch (e: ClassNotFoundException) {
            try {
                Class.forName("net.minecraft.network.protocol.common.ServerboundUseItemOnPacket")
            } catch (e2: ClassNotFoundException) {
                Class.forName("net.minecraft.network.protocol.game.PacketPlayInUseItem")
            }
        }

        try {
            clientboundDisconnectPacketClass = Class.forName("net.minecraft.network.protocol.common.ClientboundDisconnectPacket")
            clientboundResourcePackPushPacketClass = Class.forName("net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket")
        } catch (e: ClassNotFoundException) {
            clientboundDisconnectPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundDisconnectPacket")
            clientboundResourcePackPushPacketClass = Class.forName("net.minecraft.network.protocol.game.ClientboundResourcePackPushPacket")
        }

        clientboundPingPacketClass = try {
            Class.forName("net.minecraft.network.protocol.common.ClientboundPingPacket")
        } catch (e: Exception) {
            Class.forName("net.minecraft.network.protocol.game.ClientboundPingPacket")
        }
        
        // В 1.21.x Mojang: getX(double default), getY(double default), getZ(double default), hasPosition()
        movePacketGetX = resolveMethod(serverboundMovePlayerPacketClass, "getX", "(D)D", Double::class.java, 1)
        movePacketGetY = resolveMethod(serverboundMovePlayerPacketClass, "getY", "(D)D", Double::class.java, 1)
        movePacketGetZ = resolveMethod(serverboundMovePlayerPacketClass, "getZ", "(D)D", Double::class.java, 1)
        movePacketGetYaw = resolveMethod(serverboundMovePlayerPacketClass, "getYRot", "(F)F", Float::class.java, 1)
        movePacketGetPitch = resolveMethod(serverboundMovePlayerPacketClass, "getXRot", "(F)F", Float::class.java, 1)
        movePacketHasPos = resolveMethod(serverboundMovePlayerPacketClass, "hasPosition", "()Z", Boolean::class.java, 0)
        movePacketHasRot = resolveMethod(serverboundMovePlayerPacketClass, "hasRotation", "()Z", Boolean::class.java, 0)
        movePacketIsOnGround = resolveMethod(serverboundMovePlayerPacketClass, "isOnGround", "()Z", Boolean::class.java, 0)
        
        serverboundSwingPacketClass = Class.forName("net.minecraft.network.protocol.game.ServerboundSwingPacket")
    }

    private fun resolveMethod(clazz: Class<*>, mojangName: String, descriptor: String, returnType: Class<*>, paramCount: Int): MethodHandle {
        val lookup = MethodHandles.lookup()
        
        val targetReturnType = primitiveMap[returnType] ?: returnType
        
        val method = findMethodRecursive(clazz, mojangName, targetReturnType, paramCount)
            ?: throw IllegalStateException("Failed to find method $mojangName in ${clazz.name}")
            
        method.isAccessible = true
        return lookup.unreflect(method)
    }

    private fun findMethodRecursive(clazz: Class<*>, name: String, returnType: Class<*>, paramCount: Int): Method? {
        var current: Class<*>? = clazz
        while (current != null && current != Any::class.java) {
            val method = current.declaredMethods.firstOrNull { 
                it.name == name && 
                it.parameterCount == paramCount && 
                targetTypeMatches(it.returnType, returnType)
            }
            if (method != null) return method
            current = current.superclass
        }
        return null
    }

    private fun targetTypeMatches(actual: Class<*>, target: Class<*>): Boolean {
        if (actual == target) return true
        return primitiveMap[actual] == target || primitiveMap[target] == actual
    }

    fun resolveFieldName(clazz: Class<*>, mojangName: String, descriptor: String): String {
        return mojangName
    }
}
