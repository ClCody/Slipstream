# ⚡ Slipstream Engine (v2.0.0)

🇬🇧 [English Version](README.md)

![Kotlin](https://img.shields.io/badge/Kotlin-2.0+-blue.svg)
![PaperMC](https://img.shields.io/badge/Paper-1.21+-black.svg)
![Performance](https://img.shields.io/badge/Performance-Zero_Overhead-success.svg)
![JitPack](https://jitpack.io/v/ClCody/Slipstream.svg)

**Slipstream** — это высокопроизводительный фреймворк нового поколения для перехвата сетевых пакетов и физической симуляции в Minecraft (Paper).
Создан как сверхбыстрая и современная альтернатива «тяжелым» библиотекам (таким как ProtocolLib), спроектированная специально для Kotlin-разработчиков с фокусом на максимальную производительность и стабильность в продакшене.

Начиная с версии **v2.0.0**, Slipstream использует **мультимодульную архитектуру** с автоматической генерацией оберток `@JvmInline value class` напрямую из NMS. Это обеспечивает **100% типизацию**, **поддержку Java Records** и **нулевые аллокации (Zero-Allocation)** при доступе к полям пакетов, не загрязняя глобальное пространство имен.

## 🔥 Почему Slipstream?

* 🚀 **Мост байткода без рефлексии (Zero-Reflection):** Использует `MethodHandles` и корутины Kotlin. Пакеты обрабатываются со скоростью JIT-компилированного байткода.
* 🛡️ **Безопасное и чистое API:** Забудьте о вызовах вида `packet.isMovePacket()`. Используйте изящное приведение `packet.wrapAs<WrapperMovePacket>()`, которое благодаря `inline reified` магии гарантирует отсутствие накладных расходов в рантайме.
* 📦 **Вложенные структуры без аллокаций:** Автоматически сгенерированные обертки для внутренних типов NMS (таких как `BlockPos`, `Vec3`, `ItemStack`) гарантируют, что в куче не будут создаваться лишние объекты.
* 🧵 **Сначала корутины (Coroutine-First) и ленивый Suspend:** Асинхронная обработка пакетов прямо в потоке Netty. Slipstream запускает корутины только тогда, когда слушатель явно заинтересован в асинхронной обработке, в остальных случаях работа идет на 100% синхронно.
* 🪄 **Полная мутация пакетов:** Легко изменяйте пакеты с помощью сгенерированных сеттеров для изменяемых полей или через метод `.copy()` для неизменяемых Java Records.
* 🗺️ **Нативная интеграция с маппингами Mojang:** Глубокая интеграция со средой Paper на официальных маппингах Mojang (1.21+).

## 📖 Документация и Wiki

* [🏗️ Архитектура](docs/ru/ARCHITECTURE_RU.md) — Мультимодульный дизайн, генерация кода и внутреннее устройство конвейера (pipeline).
* [📖 Руководство по API](docs/ru/API_GUIDE_RU.md) — Слушатели, ожидания пакетов (Awaiters), метод `wrapAs` и модификаторы.
* [⏱️ Производительность](docs/ru/PERFORMANCE_RU.md) — JMH бенчмарки, оптимизация `inline reified` и `MethodHandles`.

## 🚉 Быстрый старт

**Gradle (JitPack)**
```kotlin
repositories {
    maven("https://jitpack.io")
}

dependencies {
    // Вам нужно подключить только модуль core, сгенерированные обертки подтянутся автоматически!
    implementation("com.github.ClCody.Slipstream:slipstream-core:2.0.0")
}
```

## 💻 Примеры использования (API)

### 1. Безопасное приведение типов (wrapAs) и синхронные слушатели
Основа DX (Developer Experience) в Slipstream. Проверяйте и приводите тип пакета в одну строчку с нулевым оверхедом:

```kotlin
val manager = SlipstreamPlugin.instance.manager

manager.registerListener(object : PacketListener {
    override fun onPacketIn(player: Player, packet: Any): Boolean {
        // wrapAs<T>() возвращает null, если это пакет другого типа.
        // Благодаря inline reified, оверхед равен 0!
        packet.wrapAs<WrapperServerboundMovePlayerPacket>()?.let { movePacket ->
            val pos = movePacket.pos // Возвращает WrapperBlockPos (без аллокаций)
            println("Игрок переместился в X: ${pos.x}, Y: ${pos.y}")
        }
        return true
    }
})
```

### 2. Асинхронные слушатели (Suspend Listeners)
Не блокируйте сервер и поток Netty! Выполняйте запросы к базе данных прямо во время обработки пакетов:

```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    override fun interestsInbound(packet: Any): Boolean = packet.wrapAs<WrapperServerboundChatPacket>() != null

    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        // Корутина может приостанавливаться (suspend), при этом порядок следующих пакетов строго сохраняется!
        val isMuted = database.checkPlayerMute(player.uniqueId)
        return !isMuted // false = отменить пакет
    }
})
```

### 3. Ожидание пакетов (Packet Awaiter)
Линейное, неблокирующее ожидание пакетов от клиента (например, подтверждения транзакции):

```kotlin
// Отправляем транзакцию клиенту
player.sendPacket(TransactionPacket(id = 1337))

// Корутина приостанавливается, пока клиент не пришлет ответ с нужным ID
val response = manager.awaitPacket<WrapperServerboundPongPacket>(player) { 
    it.packet.id == 1337 
}
```

### 4. Изменение пакетов (Сеттеры и копирование Records)
```kotlin
packet.wrapAs<WrapperClientboundSetEntityDataPacket>()?.let { dataPacket ->
    // Изменение изменяемого пакета с использованием сгенерированных сеттеров MethodHandle
    dataPacket.id = 999 
}

packet.wrapAs<WrapperServerboundSwingPacket>()?.let { swingPacket ->
    // Для неизменяемых Java Records генерируется метод copy() (как в Kotlin data-классах)
    val modified = swingPacket.copy(hand = InteractionHand.OFF_HAND)
}
```

## 📄 Лицензия
MIT License.
