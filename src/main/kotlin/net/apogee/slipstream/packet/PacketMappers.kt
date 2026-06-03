package net.apogee.slipstream.packet

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.reflect.Method

/**
 * Реестр сверхбыстрых указателей на методы NMS пакетов.
 */
object PacketMappers {
    
    // Устанавливается через SlipstreamBootstrap. Тип Any для обхода проблем с импортом.
    @JvmStatic
    var mappingResolver: Any? = null

    lateinit var serverboundMovePlayerPacketClass: Class<*>
    lateinit var serverboundPlayerCommandPacketClass: Class<*>
    lateinit var serverboundPongPacketClass: Class<*>
    lateinit var serverboundPlayerInputPacketClass: Class<*>
    lateinit var serverboundChatPacketClass: Class<*>
    
    lateinit var clientboundUpdateAttributesPacketClass: Class<*>
    lateinit var clientboundSetEntityDataPacketClass: Class<*>
    lateinit var clientboundSystemChatPacketClass: Class<*>
    lateinit var clientboundPlayerInfoUpdatePacketClass: Class<*>
    
    // Visualization / Entity
    lateinit var clientboundAddEntityPacketClass: Class<*>
    lateinit var clientboundRemoveEntitiesPacketClass: Class<*>
    lateinit var clientboundTeleportEntityPacketClass: Class<*>
    lateinit var clientboundLevelEventPacketClass: Class<*>

    // UI
    lateinit var clientboundBossEventPacketClass: Class<*>
    lateinit var clientboundSetTitleTextPacketClass: Class<*>
    lateinit var clientboundSetSubtitleTextPacketClass: Class<*>
    lateinit var clientboundSetTitlesAnimationPacketClass: Class<*>
    
    // Inventory
    lateinit var clientboundContainerSetSlotPacketClass: Class<*>
    lateinit var clientboundContainerSetContentPacketClass: Class<*>
    lateinit var clientboundContainerClosePacketClass: Class<*>

    // Utility
    lateinit var clientboundDisconnectPacketClass: Class<*>
    lateinit var clientboundResourcePackPushPacketClass: Class<*>
    
    lateinit var movePacketGetX: MethodHandle
    lateinit var movePacketGetY: MethodHandle
    lateinit var movePacketGetZ: MethodHandle
    lateinit var movePacketHasPos: MethodHandle

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
        
        serverboundMovePlayerPacketClass = resolveClass("net.minecraft.network.protocol.game.ServerboundMovePlayerPacket")
        serverboundPlayerCommandPacketClass = resolveClass("net.minecraft.network.protocol.game.ServerboundPlayerCommandPacket")
        serverboundPongPacketClass = try {
            resolveClass("net.minecraft.network.protocol.common.ServerboundPongPacket")
        } catch (e: ClassNotFoundException) {
            resolveClass("net.minecraft.network.protocol.game.ServerboundPongPacket")
        }
        serverboundPlayerInputPacketClass = resolveClass("net.minecraft.network.protocol.game.ServerboundPlayerInputPacket")
        serverboundChatPacketClass = resolveClass("net.minecraft.network.protocol.game.ServerboundChatPacket")

        clientboundUpdateAttributesPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundUpdateAttributesPacket")
        clientboundSetEntityDataPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundSetEntityDataPacket")
        clientboundSystemChatPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundSystemChatPacket")
        clientboundPlayerInfoUpdatePacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundPlayerInfoUpdatePacket")

        clientboundAddEntityPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundAddEntityPacket")
        clientboundRemoveEntitiesPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundRemoveEntitiesPacket")
        clientboundTeleportEntityPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundTeleportEntityPacket")
        clientboundLevelEventPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundLevelEventPacket")

        clientboundBossEventPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundBossEventPacket")
        clientboundSetTitleTextPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundSetTitleTextPacket")
        clientboundSetSubtitleTextPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundSetSubtitleTextPacket")
        clientboundSetTitlesAnimationPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundSetTitlesAnimationPacket")

        clientboundContainerSetSlotPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundContainerSetSlotPacket")
        clientboundContainerSetContentPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundContainerSetContentPacket")
        clientboundContainerClosePacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundContainerClosePacket")

        try {
            clientboundDisconnectPacketClass = resolveClass("net.minecraft.network.protocol.common.ClientboundDisconnectPacket")
            clientboundResourcePackPushPacketClass = resolveClass("net.minecraft.network.protocol.common.ClientboundResourcePackPushPacket")
        } catch (e: ClassNotFoundException) {
            clientboundDisconnectPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundDisconnectPacket")
            clientboundResourcePackPushPacketClass = resolveClass("net.minecraft.network.protocol.game.ClientboundResourcePackPushPacket")
        }
        
        // В 1.21.x Mojang: getX(double default), getY(double default), getZ(double default), hasPosition()
        movePacketGetX = resolveMethod(serverboundMovePlayerPacketClass, "getX", "(D)D", Double::class.java, 1)
        movePacketGetY = resolveMethod(serverboundMovePlayerPacketClass, "getY", "(D)D", Double::class.java, 1)
        movePacketGetZ = resolveMethod(serverboundMovePlayerPacketClass, "getZ", "(D)D", Double::class.java, 1)
        movePacketHasPos = resolveMethod(serverboundMovePlayerPacketClass, "hasPosition", "()Z", Boolean::class.java, 0)
    }

    private fun resolveClass(mojangName: String): Class<*> {
        val runtimeName = if (mappingResolver != null) {
            mappingResolver!!.javaClass.getMethod("mapClassName", String::class.java, String::class.java)
                .invoke(mappingResolver, "mojang", mojangName) as String
        } else {
            mojangName
        }
        return Class.forName(runtimeName)
    }

    private fun resolveMethod(clazz: Class<*>, mojangName: String, descriptor: String, returnType: Class<*>, paramCount: Int): MethodHandle {
        val lookup = MethodHandles.lookup()
        val runtimeName = if (mappingResolver != null) {
            mappingResolver!!.javaClass.getMethod("mapMethodName", String::class.java, String::class.java, String::class.java, String::class.java)
                .invoke(mappingResolver, "mojang", clazz.name, mojangName, descriptor) as String
        } else {
            mojangName
        }
        
        val targetReturnType = primitiveMap[returnType] ?: returnType
        
        val method = findMethodRecursive(clazz, runtimeName, targetReturnType, paramCount)
            ?: throw IllegalStateException("Failed to find method $mojangName ($runtimeName) in ${clazz.name}")
            
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
        return if (mappingResolver != null) {
            mappingResolver!!.javaClass.getMethod("mapFieldName", String::class.java, String::class.java, String::class.java, String::class.java)
                .invoke(mappingResolver, "mojang", clazz.name, mojangName, descriptor) as String
        } else {
            mojangName
        }
    }
}