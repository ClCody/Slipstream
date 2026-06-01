# ⚡ Slipstream Engine

![Kotlin](https://img.shields.io/badge/Kotlin-2.0+-blue.svg)
![PaperMC](https://img.shields.io/badge/Paper-1.21.4+-black.svg)
![Zero Reflection](https://img.shields.io/badge/Performance-Zero_Reflection-success.svg)
![Zero Allocation](https://img.shields.io/badge/Performance-Zero_Allocation-success.svg)

**Slipstream** — это Next-Gen фреймворк для перехвата пакетов и симуляции физики в Minecraft (Paper).
Создан как сверхбыстрая, современная альтернатива тяжелым библиотекам (вроде ProtocolLib), написанная специально для Kotlin-разработчиков с упором на максимальную производительность.

Никакой рефлексии в рантайме. Никакого мусора для Garbage Collector. Нативная поддержка Coroutines.

## 🔥 Почему Slipstream?

* 🚀 **Zero-Reflection Bytecode Bridge:** Использование `MethodHandles` и магии Kotlin `value classes`. Пакеты обрабатываются со скоростью скомпилированного C2 JIT байткода. Никаких аллокаций оберток в куче.
* 🧵 **Coroutine-First & Packet Ordering:** Асинхронная обработка пакетов прямо в Netty-потоке (`ctx.executor().asCoroutineDispatcher()`). Строгое сохранение порядка пакетов благодаря встроенной хардкорной буферизации.
* 📐 **High-Performance Physics:** Независимая встроенная математика (AABB, Vec3d) и сверхбыстрый RayTracing (Slab method).
* ⏱️ **Time-Travel Ready:** Встроенный `ClientStateTracker` автоматически сохраняет историю позиций игрока (20 тиков) для идеальной лагкомпенсации в ваших анти-читах или комбат-системах.

## 💻 Примеры использования (API)

### 1. Асинхронные слушатели (Suspend Listeners)
Не блокируйте сервер и Netty! Делайте запросы к БД прямо во время обработки пакета. Порядок пакетов не нарушится:

```kotlin
manager.registerSuspendListener(object : SuspendablePacketListener {
    override suspend fun onPacketInSuspend(player: Player, packet: Any): Boolean {
        if (packet.isMovePacket()) {
            val wrapper = packet.asMovePacket() // Zero-Allocation обертка
            
            // Корутина может спать, порядок следующих пакетов сохранится в буфере!
            val isBanned = database.checkPlayerSuspend(player.uniqueId)
            return !isBanned // false = отменить пакет
        }
        return true
    }
})
```

### 2. Линейное ожидание пакетов (Packet Awaiter)
Забудьте про стейт-машины для проверок (например, пинг-спуфа или транзакций). Отправили пакет — подождали ответ в одной корутине:

```kotlin
// Отправляем транзакцию клиенту
player.sendPacket(TransactionPacket(id = 1337))

// Корутина засыпает, пока клиент не пришлет ответ с нужным ID
val response = manager.awaitPacket<ServerboundTransactionPacket>(player) { it.id == 1337 }

player.sendMessage("Ваш пинг проверен!")
```

### 3. Физика и RayTracing
Идеально для анти-читов и кастомных сущностей:

```kotlin
// Получаем историю передвижений игрока
val state = SlipstreamPlugin.instance.stateTracker.getState(player)
val currentHitbox = state.boundingBox

// Быстрый рейтрейсинг (пересечение луча и хитбокса)
val eyePos = Vec3d(player.eyeLocation.x, player.eyeLocation.y, player.eyeLocation.z)
val lookDir = Vec3d(player.location.direction.x, player.location.direction.y, player.location.direction.z)

val hitPoint = RayTrace.intersect(eyePos, lookDir, currentHitbox)
if (hitPoint != null) {
    println("Попадание в точку: $hitPoint")
}
```

## 🛠️ Сборка

Проект использует **Gradle Kotlin DSL** и **Paperweight Userdev**.

```bash
git clone https://github.com/YourName/Slipstream.git
cd Slipstream
./gradlew build
```

## 📄 Лицензия
MIT License.