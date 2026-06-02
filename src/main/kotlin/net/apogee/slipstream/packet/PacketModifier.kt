package net.apogee.slipstream.packet

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.reflect.Field
import java.util.concurrent.ConcurrentHashMap

/**
 * Кэш метаданных пакетов для обеспечения гибкого доступа по индексам (как в ProtocolLib),
 * но с использованием сверхбыстрых MethodHandles.
 */
object PacketMetadata {
    private val cache = ConcurrentHashMap<Class<*>, ClassData>()
    private val lookup = MethodHandles.lookup()

    fun get(clazz: Class<*>): ClassData {
        return cache.getOrPut(clazz) { scanClass(clazz) }
    }

    private fun scanClass(clazz: Class<*>): ClassData {
        val allFields = mutableListOf<Field>()
        var current: Class<*>? = clazz
        while (current != null && current != Any::class.java) {
            allFields.addAll(current.declaredFields)
            current = current.superclass
        }
        
        // Сортируем поля по имени для стабильности индексов (x, y, z и т.д.)
        allFields.sortBy { it.name }

        val ints = mutableListOf<TypeData>()
        val doubles = mutableListOf<TypeData>()
        val floats = mutableListOf<TypeData>()
        val longs = mutableListOf<TypeData>()
        val booleans = mutableListOf<TypeData>()
        val strings = mutableListOf<TypeData>()
        val objects = mutableListOf<TypeData>()

        for (field in allFields) {
            field.isAccessible = true
            val getter = lookup.unreflectGetter(field)
            val setter = lookup.unreflectSetter(field)
            val typeData = TypeData(getter, setter)

            when (field.type) {
                Int::class.javaPrimitiveType -> ints.add(typeData)
                Double::class.javaPrimitiveType -> doubles.add(typeData)
                Float::class.javaPrimitiveType -> floats.add(typeData)
                Long::class.javaPrimitiveType -> longs.add(typeData)
                Boolean::class.javaPrimitiveType -> booleans.add(typeData)
                String::class.java -> strings.add(typeData)
                else -> objects.add(typeData)
            }
        }

        return ClassData(
            ints.toTypedArray(),
            doubles.toTypedArray(),
            floats.toTypedArray(),
            longs.toTypedArray(),
            booleans.toTypedArray(),
            strings.toTypedArray(),
            objects.toTypedArray()
        )
    }

    class TypeData(val getter: MethodHandle, val setter: MethodHandle)

    class ClassData(
        val ints: Array<TypeData>,
        val doubles: Array<TypeData>,
        val floats: Array<TypeData>,
        val longs: Array<TypeData>,
        val booleans: Array<TypeData>,
        val strings: Array<TypeData>,
        val objects: Array<TypeData>
    )
}

/**
 * Zero-Allocation модификатор пакетов.
 * Позволяет обращаться к полям по индексу, не зная их имен (как в ProtocolLib).
 */
@JvmInline
value class PacketModifier(val handle: Any) {
    private fun data() = PacketMetadata.get(handle.javaClass)

    // Чтение
    fun readInt(index: Int): Int = data().ints[index].getter.invoke(handle) as Int
    fun readDouble(index: Int): Double = data().doubles[index].getter.invoke(handle) as Double
    fun readFloat(index: Int): Float = data().floats[index].getter.invoke(handle) as Float
    fun readLong(index: Int): Long = data().longs[index].getter.invoke(handle) as Long
    fun readBoolean(index: Int): Boolean = data().booleans[index].getter.invoke(handle) as Boolean
    fun readString(index: Int): String = data().strings[index].getter.invoke(handle) as String
    fun readObject(index: Int): Any? = data().objects[index].getter.invoke(handle)

    // Запись
    fun writeInt(index: Int, value: Int) = data().ints[index].setter.invoke(handle, value)
    fun writeDouble(index: Int, value: Double) = data().doubles[index].setter.invoke(handle, value)
    fun writeFloat(index: Int, value: Float) = data().floats[index].setter.invoke(handle, value)
    fun writeLong(index: Int, value: Long) = data().longs[index].setter.invoke(handle, value)
    fun writeBoolean(index: Int, value: Boolean) = data().booleans[index].setter.invoke(handle, value)
    fun writeString(index: Int, value: String) = data().strings[index].setter.invoke(handle, value)
    fun writeObject(index: Int, value: Any?) = data().objects[index].setter.invoke(handle, value)
}

fun Any.modifier() = PacketModifier(this)
