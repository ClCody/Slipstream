package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperStructurePieceSerializationContext(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.level.levelgen.structure.pieces.StructurePieceSerializationContext") }
        private val lookup = MethodHandles.lookup()

        val resourceManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "resourceManager", MethodType.methodType(Class.forName("net.minecraft.server.packs.resources.ResourceManager")))
        }
        val registryAccessHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "registryAccess", MethodType.methodType(Class.forName("net.minecraft.core.RegistryAccess")))
        }
        val structureTemplateManagerHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "structureTemplateManager", MethodType.methodType(Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager")))
        }
        val constructorHandle: MethodHandle by lazy { 
            lookup.findConstructor(packetClass, MethodType.methodType(Void.TYPE, Class.forName("net.minecraft.server.packs.resources.ResourceManager"), Class.forName("net.minecraft.core.RegistryAccess"), Class.forName("net.minecraft.world.level.levelgen.structure.templatesystem.StructureTemplateManager")))
        }
    }

    val resourceManager: WrapperResourceManager
        get() = WrapperResourceManager(resourceManagerHandle.invoke(handle))

    val registryAccess: WrapperRegistryAccess
        get() = WrapperRegistryAccess(registryAccessHandle.invoke(handle))

    val structureTemplateManager: WrapperStructureTemplateManager
        get() = WrapperStructureTemplateManager(structureTemplateManagerHandle.invoke(handle))

    fun copy(resourceManager: WrapperResourceManager = this.resourceManager, registryAccess: WrapperRegistryAccess = this.registryAccess, structureTemplateManager: WrapperStructureTemplateManager = this.structureTemplateManager): WrapperStructurePieceSerializationContext {
        return WrapperStructurePieceSerializationContext(constructorHandle.invoke(resourceManager.handle, registryAccess.handle, structureTemplateManager.handle))
    }

}
