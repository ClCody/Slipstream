package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperServerScoreboard(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.server.ServerScoreboard") }
        private val lookup = MethodHandles.lookup()

        val dataFactoryHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dataFactory", MethodType.methodType(Class.forName("net.minecraft.world.level.saveddata.SavedData\$Factory")))
        }
        val getStartTrackingPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStartTrackingPackets", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.scores.Objective")))
        }
        val getStopTrackingPacketsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getStopTrackingPackets", MethodType.methodType(Class.forName("java.util.List"), Class.forName("net.minecraft.world.scores.Objective")))
        }
        val addPlayersToTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addPlayersToTeam", MethodType.methodType(Boolean::class.javaPrimitiveType!!, Class.forName("java.util.Collection"), Class.forName("net.minecraft.world.scores.PlayerTeam")))
        }
        val getObjectiveDisplaySlotCountHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObjectiveDisplaySlotCount", MethodType.methodType(Int::class.javaPrimitiveType!!, Class.forName("net.minecraft.world.scores.Objective")))
        }
        val addPlayerToTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addPlayerToTeam", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java, Class.forName("net.minecraft.world.scores.PlayerTeam")))
        }
    }

    val dataFactory: WrapperFactory
        get() = WrapperFactory(dataFactoryHandle.invoke(handle))

    fun getStartTrackingPackets(arg0: WrapperObjective): Any {
        return getStartTrackingPacketsHandle.invoke(handle, arg0.handle) as Any
    }

    fun getStopTrackingPackets(arg0: WrapperObjective): Any {
        return getStopTrackingPacketsHandle.invoke(handle, arg0.handle) as Any
    }

    fun addPlayersToTeam(arg0: Any, arg1: WrapperPlayerTeam): Boolean {
        return addPlayersToTeamHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun getObjectiveDisplaySlotCount(arg0: WrapperObjective): Int {
        return getObjectiveDisplaySlotCountHandle.invoke(handle, arg0.handle) as Int
    }

    fun addPlayerToTeam(arg0: String, arg1: WrapperPlayerTeam): Boolean {
        return addPlayerToTeamHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

}
