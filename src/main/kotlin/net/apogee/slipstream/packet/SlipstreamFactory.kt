package net.apogee.slipstream.packet

import net.apogee.slipstream.packet.wrapper.*
import sun.misc.Unsafe
import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.util.concurrent.ConcurrentHashMap

/**
 * Фабрика для сверхбыстрого создания NMS-пакетов.
 * Позволяет инстанциировать пакеты без накладных расходов (как new PacketContainer в ProtocolLib).
 */
object SlipstreamFactory {

    private val unsafe: Unsafe
    private val lookup = MethodHandles.lookup()
    private val constructorCache = ConcurrentHashMap<Class<*>, MethodHandle?>()

    init {
        val field = Unsafe::class.java.getDeclaredField("theUnsafe")
        field.isAccessible = true
        unsafe = field.get(null) as Unsafe
    }

    /**
     * Создает пустой инстанс пакета.
     * Сначала пытается использовать пустой конструктор через MethodHandles (для инициализации default значений).
     * Если его нет (как во многих новых пакетах MC), использует sun.misc.Unsafe.allocateInstance() (0 overhead).
     */
    fun create(clazz: Class<*>): Any {
        val constructor = constructorCache.computeIfAbsent(clazz) {
            try {
                lookup.findConstructor(it, MethodType.methodType(Void.TYPE))
            } catch (e: NoSuchMethodException) {
                null
            } catch (e: IllegalAccessException) {
                null
            }
        }

        return if (constructor != null) {
            constructor.invoke()
        } else {
            // allocateInstance создает объект без вызова конструктора.
            // Для пакетов это идеально, так как мы всё равно будем заполнять поля через PacketModifier.
            unsafe.allocateInstance(clazz)
        }
    }

    // --- Удобные фабричные методы, сразу возвращающие Wrapper ---

    fun createUpdateAttributesPacket(): WrapperUpdateAttributesPacket {
        return WrapperUpdateAttributesPacket(create(PacketMappers.clientboundUpdateAttributesPacketClass))
    }

    fun createSetEntityDataPacket(): WrapperSetEntityDataPacket {
        return WrapperSetEntityDataPacket(create(PacketMappers.clientboundSetEntityDataPacketClass))
    }

    fun createSystemChatPacket(): WrapperSystemChatPacket {
        return WrapperSystemChatPacket(create(PacketMappers.clientboundSystemChatPacketClass))
    }

    fun createPlayerInfoUpdatePacket(): WrapperPlayerInfoUpdatePacket {
        return WrapperPlayerInfoUpdatePacket(create(PacketMappers.clientboundPlayerInfoUpdatePacketClass))
    }

    fun createMovePlayerPacket(): WrapperMovePacket {
        return WrapperMovePacket(create(PacketMappers.serverboundMovePlayerPacketClass))
    }
    
    fun createPongPacket(): WrapperPongPacket {
        return WrapperPongPacket(create(PacketMappers.serverboundPongPacketClass))
    }
}
