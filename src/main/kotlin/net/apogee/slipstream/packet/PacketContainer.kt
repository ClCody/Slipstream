package net.apogee.slipstream.packet

/**
 * Обертка, имитирующая синтаксис ProtocolLib (PacketContainer).
 * Под капотом использует сверхбыстрый PacketModifier без аллокаций.
 */
@JvmInline
value class PacketContainer(val handle: Any) {

    fun getIntegers() = IntModifier(handle)
    fun getDoubles() = DoubleModifier(handle)
    fun getFloats() = FloatModifier(handle)
    fun getLongs() = LongModifier(handle)
    fun getBooleans() = BooleanModifier(handle)
    fun getStrings() = StringModifier(handle)
    fun getObjects() = ObjectModifier(handle)

    // Имитация StructureModifier из ProtocolLib
    @JvmInline
    value class IntModifier(val handle: Any) {
        fun read(index: Int): Int = handle.modifier().readInt(index)
        fun write(index: Int, value: Int) = handle.modifier().writeInt(index, value)
    }

    @JvmInline
    value class DoubleModifier(val handle: Any) {
        fun read(index: Int): Double = handle.modifier().readDouble(index)
        fun write(index: Int, value: Double) = handle.modifier().writeDouble(index, value)
    }

    @JvmInline
    value class FloatModifier(val handle: Any) {
        fun read(index: Int): Float = handle.modifier().readFloat(index)
        fun write(index: Int, value: Float) = handle.modifier().writeFloat(index, value)
    }

    @JvmInline
    value class LongModifier(val handle: Any) {
        fun read(index: Int): Long = handle.modifier().readLong(index)
        fun write(index: Int, value: Long) = handle.modifier().writeLong(index, value)
    }

    @JvmInline
    value class BooleanModifier(val handle: Any) {
        fun read(index: Int): Boolean = handle.modifier().readBoolean(index)
        fun write(index: Int, value: Boolean) = handle.modifier().writeBoolean(index, value)
    }

    @JvmInline
    value class StringModifier(val handle: Any) {
        fun read(index: Int): String = handle.modifier().readString(index)
        fun write(index: Int, value: String) = handle.modifier().writeString(index, value)
    }

    @JvmInline
    value class ObjectModifier(val handle: Any) {
        fun read(index: Int): Any? = handle.modifier().readObject(index)
        fun write(index: Int, value: Any?) = handle.modifier().writeObject(index, value)
    }
}

/**
 * Быстрый перевод любого пакета в формат контейнера.
 */
fun Any.asContainer() = PacketContainer(this)
