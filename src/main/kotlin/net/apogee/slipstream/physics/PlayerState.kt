package net.apogee.slipstream.physics

/**
 * Кадр истории для Ring Buffer. Хранит позицию, хитбокс и данные для синхронизации.
 */
class TrackedFrame {
    val pos = MutableVec3d()
    val boundingBox = MutableAABB()
    @Volatile var timestamp: Long = 0L
    @Volatile var transactionId: Short = 0 // For future ping/transaction binding
}

/**
 * Хранит историю перемещений и текущий хитбокс игрока.
 * Реализует паттерн Круговой Буфер (Ring Buffer) для Zero-Allocation.
 */
class PlayerState {
    
    val currentPos = MutableVec3d()
    val boundingBox = MutableAABB()

    // Пул из 20 объектов (создаются ОДИН раз при входе)
    val history = Array(20) { TrackedFrame() }
    
    @Volatile var historyIndex = 0
        private set

    fun updatePosition(x: Double, y: Double, z: Double) {
        // Обновляем текущее состояние
        currentPos.update(x, y, z)
        boundingBox.updatePlayer(x, y, z)
        
        // Берем готовый объект из пула истории и перезаписываем (Zero-Allocation)
        val frame = history[historyIndex]
        frame.pos.update(x, y, z)
        frame.boundingBox.updatePlayer(x, y, z)
        frame.timestamp = System.currentTimeMillis()
        // frame.transactionId будет обновлен отдельным чеком пинга, если нужно
        
        // Двигаем указатель по кругу
        historyIndex = (historyIndex + 1) % 20
    }
}