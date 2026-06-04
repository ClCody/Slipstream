package net.apogee.slipstream.packet

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field
import java.util.concurrent.ConcurrentHashMap

/**
 * Кэш метаданных пакетов для обеспечения гибкого доступа по индексам (как в ProtocolLib),
 * но с использованием сверхбыстрых MethodHandles.
 */
object PacketMetadata {
    private val cache = ConcurrentHashMap<Class<*>, ClassData>()
    private val lookup = MethodHandles.lookup()

    // Специальный хэндлер для final полей, которые нельзя мутировать через MethodHandles.
    // Он просто ничего не делает (No-Op).
    private val NO_OP_SETTER = lookup.findStatic(
        PacketMetadata::class.java, 
        "noOpSetter", 
        MethodType.methodType(Void.TYPE, Any::class.java, Any::class.java)
    )

    @JvmStatic
    private fun noOpSetter(instance: Any, value: Any?) {
        // Ничего не делаем
    }

    fun get(clazz: Class<*>): ClassData {
        return cache.getOrPut(clazz) { scanClass(clazz) }
    }

    private fun scanClass(clazz: Class<*>): ClassData {
        val allFields = mutableListOf<Field>()
        var current: Class<*>? = clazz
        while (current != null && current != Any::class.java) {
            // Берем только инстанс-поля. Статические поля (типа STREAM_CODEC) нам не нужны.
            allFields.addAll(current.declaredFields.filter { !java.lang.reflect.Modifier.isStatic(it.modifiers) })
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
            
            // MethodHandles не позволяют создавать Setter для final полей через unreflectSetter.
            // Если поле final, мы используем NO_OP_SETTER, приведенный к нужному типу.
            val setter = if (!java.lang.reflect.Modifier.isFinal(field.modifiers)) {
                lookup.unreflectSetter(field)
            } else {
                NO_OP_SETTER.asType(MethodType.methodType(Void.TYPE, clazz, field.type))
            }

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
    fun readInt(index: Int): Int = try { data().ints[index].getter.invoke(handle) as Int } catch (e: Exception) { handleModifierError("readInt", index, e) }
    fun readDouble(index: Int): Double = try { data().doubles[index].getter.invoke(handle) as Double } catch (e: Exception) { handleModifierError("readDouble", index, e) }
    fun readFloat(index: Int): Float = try { data().floats[index].getter.invoke(handle) as Float } catch (e: Exception) { handleModifierError("readFloat", index, e) }
    fun readLong(index: Int): Long = try { data().longs[index].getter.invoke(handle) as Long } catch (e: Exception) { handleModifierError("readLong", index, e) }
    fun readBoolean(index: Int): Boolean = try { data().booleans[index].getter.invoke(handle) as Boolean } catch (e: Exception) { handleModifierError("readBoolean", index, e) }
    fun readString(index: Int): String = try { data().strings[index].getter.invoke(handle) as String } catch (e: Exception) { handleModifierError("readString", index, e) }
    fun readObject(index: Int): Any? = try { data().objects[index].getter.invoke(handle) } catch (e: Exception) { handleModifierError("readObject", index, e) }

    // Запись
    fun writeInt(index: Int, value: Int) = try { data().ints[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeInt", index, e) }
    fun writeDouble(index: Int, value: Double) = try { data().doubles[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeDouble", index, e) }
    fun writeFloat(index: Int, value: Float) = try { data().floats[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeFloat", index, e) }
    fun writeLong(index: Int, value: Long) = try { data().longs[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeLong", index, e) }
    fun writeBoolean(index: Int, value: Boolean) = try { data().booleans[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeBoolean", index, e) }
    fun writeString(index: Int, value: String) = try { data().strings[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeString", index, e) }
    fun writeObject(index: Int, value: Any?) = try { data().objects[index].setter.invoke(handle, value) } catch (e: Exception) { handleModifierError("writeObject", index, e) }

    private fun handleModifierError(op: String, index: Int, e: Exception): Nothing {
        val d = data()
        System.err.println("[Slipstream] PacketModifier Error ($op) on ${handle.javaClass.name} at index $index")
        System.err.println("[Slipstream] Arrays: ints=${d.ints.size}, doubles=${d.doubles.size}, floats=${d.floats.size}, longs=${d.longs.size}, bools=${d.booleans.size}, objs=${d.objects.size}")
        throw e
    }
}

fun Any.modifier() = PacketModifier(this)
