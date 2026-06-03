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

    // Client State Variables
    @Volatile var isSneaking: Boolean = false
    @Volatile var isSprinting: Boolean = false
    @Volatile var isSwimming: Boolean = false
    @Volatile var isFallFlying: Boolean = false
    @Volatile var isSpinAttacking: Boolean = false
    @Volatile var isSitting: Boolean = false
    @Volatile var scale: Double = 1.0

    @Volatile var latestTransactionId: Int = 0

    fun calculateWidthHalf(): Double {
        return MutableAABB.PLAYER_WIDTH_HALF * scale
    }

    fun calculateHeight(): Double {
        var baseHeight = MutableAABB.PLAYER_HEIGHT
        if (isFallFlying || isSwimming || isSpinAttacking) {
            baseHeight = 0.6
        } else if (isSneaking || isSitting) {
            baseHeight = 1.5
        }
        return baseHeight * scale
    }

    fun updatePosition(x: Double, y: Double, z: Double) {
        val widthHalf = calculateWidthHalf()
        val height = calculateHeight()

        // Обновляем текущее состояние
        currentPos.update(x, y, z)
        boundingBox.updatePlayer(x, y, z, widthHalf, height)
        
        // Берем готовый объект из пула истории и перезаписываем (Zero-Allocation)
        val frame = history[historyIndex]
        frame.pos.update(x, y, z)
        frame.boundingBox.updatePlayer(x, y, z, widthHalf, height)
        frame.timestamp = System.currentTimeMillis()
        frame.transactionId = latestTransactionId.toShort()
        
        // Двигаем указатель по кругу
        historyIndex = (historyIndex + 1) % 20
    }
}