package net.apogee.slipstream.physics

/**
 * Мутабельный легковесный вектор для математики Slipstream.
 * Используется в Ring Buffer для достижения абсолютного Zero-Allocation.
 */
class MutableVec3d(var x: Double = 0.0, var y: Double = 0.0, var z: Double = 0.0) {
    
    fun update(x: Double, y: Double, z: Double) {
        this.x = x
        this.y = y
        this.z = z
    }
    
    fun distanceSquaredTo(other: MutableVec3d): Double {
        val dx = x - other.x
        val dy = y - other.y
        val dz = z - other.z
        return dx * dx + dy * dy + dz * dz
    }
}