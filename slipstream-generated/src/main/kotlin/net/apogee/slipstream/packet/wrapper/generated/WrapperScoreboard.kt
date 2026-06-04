package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperScoreboard(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.scores.Scoreboard") }
        private val lookup = MethodHandles.lookup()

        val getPlayerTeamsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerTeams", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val addPlayerTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addPlayerTeam", MethodType.methodType(Class.forName("net.minecraft.world.scores.PlayerTeam"), String::class.java))
        }
        val getTeamNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTeamNames", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getPlayersTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayersTeam", MethodType.methodType(Class.forName("net.minecraft.world.scores.PlayerTeam"), String::class.java))
        }
        val getTrackedPlayersHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getTrackedPlayers", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val addPlayerToTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addPlayerToTeam", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java, Class.forName("net.minecraft.world.scores.PlayerTeam")))
        }
        val getPlayerTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerTeam", MethodType.methodType(Class.forName("net.minecraft.world.scores.PlayerTeam"), String::class.java))
        }
        val addObjectiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "addObjective", MethodType.methodType(Class.forName("net.minecraft.world.scores.Objective"), String::class.java, Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria"), Class.forName("net.minecraft.network.chat.Component"), Class.forName("net.minecraft.world.scores.criteria.ObjectiveCriteria\$RenderType"), Boolean::class.javaPrimitiveType!!, Class.forName("net.minecraft.network.chat.numbers.NumberFormat")))
        }
        val getObjectiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObjective", MethodType.methodType(Class.forName("net.minecraft.world.scores.Objective"), String::class.java))
        }
        val getPlayerScoreInfoHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getPlayerScoreInfo", MethodType.methodType(Class.forName("net.minecraft.world.scores.ReadOnlyScoreInfo"), Class.forName("net.minecraft.world.scores.ScoreHolder"), Class.forName("net.minecraft.world.scores.Objective")))
        }
        val listPlayerScoresHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "listPlayerScores", MethodType.methodType(Class.forName("java.util.Collection"), Class.forName("net.minecraft.world.scores.Objective")))
        }
        val getObjectivesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObjectives", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getObjectiveNamesHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getObjectiveNames", MethodType.methodType(Class.forName("java.util.Collection")))
        }
        val getDisplayObjectiveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getDisplayObjective", MethodType.methodType(Class.forName("net.minecraft.world.scores.Objective"), Class.forName("net.minecraft.world.scores.DisplaySlot")))
        }
        val removePlayerFromTeamHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "removePlayerFromTeam", MethodType.methodType(Boolean::class.javaPrimitiveType!!, String::class.java))
        }
        val getOrCreatePlayerScoreHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "getOrCreatePlayerScore", MethodType.methodType(Class.forName("net.minecraft.world.scores.ScoreAccess"), Class.forName("net.minecraft.world.scores.ScoreHolder"), Class.forName("net.minecraft.world.scores.Objective"), Boolean::class.javaPrimitiveType!!))
        }
    }

    val playerTeams: Any
        get() = getPlayerTeamsHandle.invoke(handle) as Any

    fun addPlayerTeam(arg0: String): WrapperPlayerTeam {
        return WrapperPlayerTeam(addPlayerTeamHandle.invoke(handle, arg0))
    }

    val teamNames: Any
        get() = getTeamNamesHandle.invoke(handle) as Any

    fun getPlayersTeam(arg0: String): WrapperPlayerTeam {
        return WrapperPlayerTeam(getPlayersTeamHandle.invoke(handle, arg0))
    }

    val trackedPlayers: Any
        get() = getTrackedPlayersHandle.invoke(handle) as Any

    fun addPlayerToTeam(arg0: String, arg1: WrapperPlayerTeam): Boolean {
        return addPlayerToTeamHandle.invoke(handle, arg0, arg1.handle) as Boolean
    }

    fun getPlayerTeam(arg0: String): WrapperPlayerTeam {
        return WrapperPlayerTeam(getPlayerTeamHandle.invoke(handle, arg0))
    }

    fun addObjective(arg0: String, arg1: WrapperObjectiveCriteria, arg2: WrapperComponent, arg3: Any, arg4: Boolean, arg5: WrapperNumberFormat): WrapperObjective {
        return WrapperObjective(addObjectiveHandle.invoke(handle, arg0, arg1.handle, arg2.handle, arg3, arg4, arg5.handle))
    }

    fun getObjective(arg0: String): WrapperObjective {
        return WrapperObjective(getObjectiveHandle.invoke(handle, arg0))
    }

    fun getPlayerScoreInfo(arg0: WrapperScoreHolder, arg1: WrapperObjective): WrapperReadOnlyScoreInfo {
        return WrapperReadOnlyScoreInfo(getPlayerScoreInfoHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun listPlayerScores(arg0: WrapperObjective): Any {
        return listPlayerScoresHandle.invoke(handle, arg0.handle) as Any
    }

    val objectives: Any
        get() = getObjectivesHandle.invoke(handle) as Any

    val objectiveNames: Any
        get() = getObjectiveNamesHandle.invoke(handle) as Any

    fun getDisplayObjective(arg0: Any): WrapperObjective {
        return WrapperObjective(getDisplayObjectiveHandle.invoke(handle, arg0))
    }

    fun removePlayerFromTeam(arg0: String): Boolean {
        return removePlayerFromTeamHandle.invoke(handle, arg0) as Boolean
    }

    fun getOrCreatePlayerScore(arg0: WrapperScoreHolder, arg1: WrapperObjective, arg2: Boolean): WrapperScoreAccess {
        return WrapperScoreAccess(getOrCreatePlayerScoreHandle.invoke(handle, arg0.handle, arg1.handle, arg2))
    }

}
