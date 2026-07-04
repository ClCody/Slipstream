# 📖 Руководство по API Slipstream (v2.0.0)

🇬🇧 [English Version](../API_GUIDE.md)

## 🚀 Получение менеджера пакетов
Для начала работы со Slipstream вам необходимо получить экземпляр `SlipstreamManager`. Это делается через плагин-синглтон:

```kotlin
val manager = SlipstreamPlugin.instance.manager
```

## 📡 Перехват пакетов

### Метод расширения `wrapAs<T>()`
В Slipstream 2.0.0 представлен полностью безопасный с точки зрения типов и нулевой по оверхеду способ проверки и приведения типов пакетов с использованием встроенных функций (`inline reified`). Больше нет необходимости засорять глобальную область видимости методами проверки типов.

Просто используйте выражение `packet.wrapAs<WrapperClass>()`. Оно вернет `null`, если пакет не соответствует указанному типу-обертке.

### Синхронный слушатель (Synchronous Listener)
Идеально подходит для быстрых легковесных проверок и триггеров античита.
```kotlin
import net.apogee.slipstream.packet.wrapper.generated.wrapAs

manager.registerListener(object : PacketListener {
    override fun onPacketIn(player: Player, packet: Any): Boolean {
        packet.wrapAs<WrapperServerboundMovePlayerPacket>()?.let { move ->
            println("Игрок переместился в X: ${move.pos.x}") // WrapperBlockPos работает без аллокаций!
        }
        return true 
    }
}, PacketPriority.HIGH)
```

### Асинхронный слушатель (Suspendable Listener)
Идеален для операций, связанных с вводом-выводом (I/O), запросов к базам данных и т.д. Порядок обработки пакетов для каждого игрока строго сохраняется.
```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    // Приостанавливать поток только для чат-пакетов
    override fun interestsInbound(packet: Any): Boolean = packet.wrapAs<WrapperServerboundChatPacket>() != null

    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        return database.checkStatus(player.uniqueId) // Безопасный suspend!
    }
})
```

## 🪄 Модификация пакетов (Сеттеры и копирование)
Изменение полей пакетов теперь типизировано и полностью встроено в сгенерированные обертки.

### Изменяемые пакеты (Сеттеры)
Если пакет NMS имеет изменяемые (mutable) поля, Slipstream генерирует для них эффективные сеттеры на основе `MethodHandles` без создания промежуточных объектов в памяти.
```kotlin
packet.wrapAs<WrapperClientboundSetEntityDataPacket>()?.let { dataPacket ->
    dataPacket.id = 1234 // Быстрая запись через unreflectSetter
}
```

### Неизменяемые пакеты (Java Records)
Для современных пакетов, реализованных в виде Java Records (начиная с 1.20+), Slipstream генерирует метод `copy()`, работающий аналогично методу копирования в Kotlin data-классах.
```kotlin
packet.wrapAs<WrapperServerboundSwingPacket>()?.let { swing ->
    val newPacket = swing.copy(hand = InteractionHand.OFF_HAND)
    // Поскольку исходный пакет неизменяем, вам нужно отправить или обработать именно newPacket
}
```

## 🚉 Слой совместимости с ProtocolLib (Compatibility Layer / Мост миграции)
Если у вас есть существующий плагин, написанный с использованием ProtocolLib, вы можете перенести его на Slipstream практически мгновенно:
1. Замените зависимость в `build.gradle.kts` (с `ProtocolLib` на `slipstream-core`).
2. Измените импорты в ваших классах, заменив `com.comphenix.protocol.*` на `net.apogee.slipstream.api.compat.*`.

После этого код вашего плагина продолжит успешно компилироваться и работать без изменений логики, но получит существенный прирост производительности. Все внутренние компоненты моста миграции (`PacketContainer`, `DoubleModifier` и др.) реализованы с помощью `@JvmInline value class` и `MethodHandles`, что исключает аллокации памяти при доступе к полям в рантайме.

```kotlin
val protocolManager = ProtocolLibrary.getProtocolManager()

protocolManager.addPacketListener(object : PacketAdapter() {
    override fun onPacketReceiving(event: PacketEvent) {
        val container = event.packet
        val x = container.getDoubles().read(0)
        
        println("Перехвачен пакет от ${event.player.name} в координате X: $x")
        
        // Отмена пакета так же, как в ProtocolLib
        event.isCancelled = true
    }
})
```
*Важное примечание о производительности:* Несмотря на то, что мост совместимости работает во много раз быстрее оригинального ProtocolLib, он все же создает небольшой оверхед по сравнению с нативным API `wrapAs<T>()`. Это связано с необходимостью инстанцирования объекта-контейнера `PacketContainer` при обработке событий. Для достижения абсолютного максимума производительности и полной типизации кода мы настоятельно рекомендуем переходить на нативное API `wrapAs<T>()` при проведении планового рефакторинга.


## ⏳ Ожидание пакетов (Packet Awaiter)
Линейный, неблокирующий корутинный механизм ожидания пакетов от конкретного игрока:
```kotlin
val response = manager.awaitPacket<WrapperServerboundPongPacket>(player, consume = true) { pong ->
    pong.packet.id == 1337 
}
```

## ⚖️ Приоритеты событий
Slipstream поддерживает стандартную модель приоритетов событий Bukkit:
`LOWEST` -> `LOW` -> `NORMAL` -> `HIGH` -> `HIGHEST` -> `MONITOR`.

Слушатели выполняются в порядке приоритета. Слушатели с приоритетом `MONITOR` не должны изменять содержимое пакетов.
