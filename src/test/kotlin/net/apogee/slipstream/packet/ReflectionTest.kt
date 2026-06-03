package net.apogee.slipstream.packet

import org.junit.jupiter.api.Test
import java.io.File

class ReflectionTest {
    @Test
    fun testReflection() {
        val out = StringBuilder()
        
        val classes = listOf(
            "net.minecraft.network.protocol.game.ServerboundMovePlayerPacket",
            "net.minecraft.network.protocol.game.ServerboundSwingPacket"
        )
        
        for (c in classes) {
            try {
                val clazz = Class.forName(c, false, this::class.java.classLoader)
                out.appendLine("$c fields:")
                clazz.declaredFields.forEach { out.appendLine("  - ${it.type.name} ${it.name}") }
                out.appendLine("$c methods:")
                clazz.declaredMethods.forEach { out.appendLine("  - ${it.returnType.name} ${it.name}(${it.parameterTypes.joinToString { p -> p.name }})") }
            } catch (e: Throwable) {
                out.appendLine("Failed for $c: ${e.message}")
            }
        }

        File("reflection_output.txt").writeText(out.toString())
    }
}