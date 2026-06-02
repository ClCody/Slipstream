package net.apogee.slipstream.physics

/**
 * Мутабельный легковесный вектор для математики Slipstream.
 * Используется в Ring Buffer для достижения абсолютного Zero-Allocation.
 *
 * ## Thread Safety
 *
 * Запись ([update]) и чтение ([copyTo]) синхронизированы для предотвращения
 * torn-reads (состояния, когда читатель видит новые x, но старые y/z).
 * Для zero-allocation чтения используйте [copyTo] с переиспользуемым буфером.
 */
class MutableVec3d(
    var x: Double = 0.0,
    var y: Double = 0.0,
    var z: Double = 0.0
) {

    /**
     * Обновляет все три координаты атомарно.
     * Синхронизирован для исключения torn-reads.
     */
    @Synchronized
    fun update(x: Double, y: Double, z: Double) {
        this.x = x
        this.y = y
        this.z = z
    }

    /**
     * Копирует текущее состояние в целевой вектор атомарно.
     * Используйте с переиспользуемым буфером для zero-allocation reads.
     *
     * Example:
     * ```
     * val temp = MutableVec3d() // создается один раз
     * state.currentPos.copyTo(temp) // читаем снимок
     * // работаем с temp
     * ```
     */
    @Synchronized
    fun copyTo(target: MutableVec3d) {
        target.x = this.x
        target.y = this.y
        target.z = this.z
    }

    fun distanceSquaredTo(other: MutableVec3d): Double {
        val dx = x - other.x
        val dy = y - other.y
        val dz = z - other.z
        return dx * dx + dy * dy + dz * dz
    }
}
