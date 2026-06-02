# ⚡ Slipstream Engine

![Kotlin](https://img.shields.io/badge/Kotlin-2.0+-blue.svg)
![PaperMC](https://img.shields.io/badge/Paper-1.21+-black.svg)
![Performance](https://img.shields.io/badge/Performance-Zero_Overhead-success.svg)

**Slipstream** is a Next-Gen framework for packet interception and physics simulation in Minecraft (Paper).
Built as an ultra-fast, modern alternative to heavy libraries (like ProtocolLib), designed specifically for Kotlin developers with an absolute focus on maximum performance and production stability.

No runtime reflection overhead. Zero Garbage Collector pressure. Native Coroutines support.

## 🔥 Why Slipstream?

* 🚀 **Zero-Reflection Bytecode Bridge:** Uses `MethodHandles` and Kotlin `value classes`. Packets are processed at the speed of compiled JIT bytecode.
* 🧵 **Coroutine-First & Lazy Suspend:** Asynchronous packet processing directly in the Netty thread. Slipstream only launches coroutines when a listener is interested, otherwise, it stays 100% synchronous.
* 📐 **High-Performance Physics:** Independent built-in math (`MutableAABB`, `MutableVec3d`) and ultra-fast RayTracing. Utilizes a **Ring Buffer** for 0-byte allocations during physics updates.
* 🪄 **Full Packet Mutation:** Read and write any packet field by index (ProtocolLib-style) or via specialized zero-allocation wrappers.
* 🗺️ **Cross-Version Mapping Resolver:** Built-in support for Mojang/Paper mappings, ensuring your plugin works across multiple versions (1.21+) without changes.

## 📖 Documentation & Wiki

* [🏗️ Architecture](docs/ARCHITECTURE.md) — Lazy Suspend, Zero-Allocation Queues, and Pipeline internals.
* [📖 API Guide](docs/API_GUIDE.md) — Listeners, Priorities, Awaiters, and Modifiers.
* [⏱️ Performance](docs/PERFORMANCE.md) — JMH Benchmarks and why we are the fastest.

## 🚉 Migration from ProtocolLib

| Feature | ProtocolLib | Slipstream |
| :--- | :--- | :--- |
| **Access** | `StructureModifier` (Reflective) | `PacketModifier` (MethodHandles) |
| **Mutation** | `setField()` (Slow) | `writeField()` (Fast) |
| **Allocation** | `PacketContainer` (Heap) | `@JvmInline value class` (Stack/Zero) |
| **Async** | `AsyncMarker` / Task Chain | Native Coroutines (`Suspendable`) |
| **Ordering** | Complex to manage | Guaranteed (Pipeline Buffering) |

## 🛠️ Status & Version Support

* **Current Status:** 🟢 Production Ready
* **Supported Versions:** 1.21, 1.21.1, 1.21.3, 1.21.4 (Paper/Mojang Mappings)
* **Kotlin Version:** 2.0.0+
* **JDK Version:** 21+

## ⏱️ Benchmarks

Slipstream is built for speed. 

| Operation | ProtocolLib (ns/op) | Slipstream (ns/op) | Improvement |
|-----------|-------------------|--------------------|-------------|
| Field Read | ~18.5             | **~1.1**           | **~16x**     |
| Field Write| ~21.2             | **~1.4**           | **~15x**     |

*Benchmarked using JMH on OpenJDK 21. See [docs/PERFORMANCE.md](docs/PERFORMANCE.md) for details.*

## 📄 License
MIT License.
