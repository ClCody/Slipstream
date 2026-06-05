package net.apogee.slipstream.packet.wrapper.generated

import java.lang.invoke.MethodHandle
import java.lang.invoke.MethodHandles
import java.lang.invoke.MethodType
import java.lang.reflect.Field

@JvmInline
value class WrapperDamageSources(val handle: Any) {
    companion object {
        val packetClass: Class<*> by lazy { Class.forName("net.minecraft.world.damagesource.DamageSources") }
        private val lookup = MethodHandles.lookup()

        val genericHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "generic", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val freezeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "freeze", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val thrownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "thrown", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val magicHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "magic", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val onFireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "onFire", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val lavaHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lava", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val anvilHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "anvil", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val crammingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cramming", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val drownHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "drown", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val inWallHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "inWall", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val lightningBoltHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "lightningBolt", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val badRespawnPointExplosionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "badRespawnPointExplosion", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.phys.Vec3"), Class.forName("org.bukkit.block.BlockState")))
        }
        val mobAttackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mobAttack", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val poisonHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "poison", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val meltingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "melting", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val sweetBerryBushHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sweetBerryBush", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val fallingStalactiteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fallingStalactite", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val dragonBreathHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dragonBreath", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val indirectMagicHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "indirectMagic", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val mobProjectileHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "mobProjectile", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val witherSkullHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "witherSkull", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.projectile.WitherSkull"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val noAggroMobAttackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "noAggroMobAttack", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val fallingBlockHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fallingBlock", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val sonicBoomHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sonicBoom", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val fireworksHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fireworks", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.projectile.FireworkRocketEntity"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val thornsHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "thorns", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val hotFloorHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "hotFloor", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val stalagmiteHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "stalagmite", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val cactusHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "cactus", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val spitHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "spit", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val inFireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "inFire", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val dryOutHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "dryOut", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val windChargeHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "windCharge", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val starveHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "starve", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val stingHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "sting", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.LivingEntity")))
        }
        val arrowHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "arrow", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.projectile.AbstractArrow"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val fireballHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fireball", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.projectile.Fireball"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val tridentHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "trident", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val witherHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "wither", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val campfireHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "campfire", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val explosionHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "explosion", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.Entity"), Class.forName("net.minecraft.world.entity.Entity")))
        }
        val fallHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fall", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val playerAttackHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "playerAttack", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource"), Class.forName("net.minecraft.world.entity.player.Player")))
        }
        val outOfBorderHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "outOfBorder", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val genericKillHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "genericKill", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val fellOutOfWorldHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "fellOutOfWorld", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
        val flyIntoWallHandle: MethodHandle by lazy { 
            lookup.findVirtual(packetClass, "flyIntoWall", MethodType.methodType(Class.forName("net.minecraft.world.damagesource.DamageSource")))
        }
    }

    val generic: WrapperDamageSource
        get() = WrapperDamageSource(genericHandle.invoke(handle))

    val freeze: WrapperDamageSource
        get() = WrapperDamageSource(freezeHandle.invoke(handle))

    fun thrown(arg0: WrapperEntity, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(thrownHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val magic: WrapperDamageSource
        get() = WrapperDamageSource(magicHandle.invoke(handle))

    val onFire: WrapperDamageSource
        get() = WrapperDamageSource(onFireHandle.invoke(handle))

    val lava: WrapperDamageSource
        get() = WrapperDamageSource(lavaHandle.invoke(handle))

    fun anvil(arg0: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(anvilHandle.invoke(handle, arg0.handle))
    }

    val cramming: WrapperDamageSource
        get() = WrapperDamageSource(crammingHandle.invoke(handle))

    val drown: WrapperDamageSource
        get() = WrapperDamageSource(drownHandle.invoke(handle))

    val inWall: WrapperDamageSource
        get() = WrapperDamageSource(inWallHandle.invoke(handle))

    val lightningBolt: WrapperDamageSource
        get() = WrapperDamageSource(lightningBoltHandle.invoke(handle))

    fun badRespawnPointExplosion(arg0: WrapperVec3, arg1: Any): WrapperDamageSource {
        return WrapperDamageSource(badRespawnPointExplosionHandle.invoke(handle, arg0.handle, arg1))
    }

    fun mobAttack(arg0: WrapperLivingEntity): WrapperDamageSource {
        return WrapperDamageSource(mobAttackHandle.invoke(handle, arg0.handle))
    }

    val poison: WrapperDamageSource
        get() = WrapperDamageSource(poisonHandle.invoke(handle))

    val melting: WrapperDamageSource
        get() = WrapperDamageSource(meltingHandle.invoke(handle))

    val sweetBerryBush: WrapperDamageSource
        get() = WrapperDamageSource(sweetBerryBushHandle.invoke(handle))

    fun fallingStalactite(arg0: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(fallingStalactiteHandle.invoke(handle, arg0.handle))
    }

    val dragonBreath: WrapperDamageSource
        get() = WrapperDamageSource(dragonBreathHandle.invoke(handle))

    fun indirectMagic(arg0: WrapperEntity, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(indirectMagicHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun mobProjectile(arg0: WrapperEntity, arg1: WrapperLivingEntity): WrapperDamageSource {
        return WrapperDamageSource(mobProjectileHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun witherSkull(arg0: WrapperWitherSkull, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(witherSkullHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun noAggroMobAttack(arg0: WrapperLivingEntity): WrapperDamageSource {
        return WrapperDamageSource(noAggroMobAttackHandle.invoke(handle, arg0.handle))
    }

    fun fallingBlock(arg0: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(fallingBlockHandle.invoke(handle, arg0.handle))
    }

    fun sonicBoom(arg0: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(sonicBoomHandle.invoke(handle, arg0.handle))
    }

    fun fireworks(arg0: WrapperFireworkRocketEntity, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(fireworksHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun thorns(arg0: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(thornsHandle.invoke(handle, arg0.handle))
    }

    val hotFloor: WrapperDamageSource
        get() = WrapperDamageSource(hotFloorHandle.invoke(handle))

    val stalagmite: WrapperDamageSource
        get() = WrapperDamageSource(stalagmiteHandle.invoke(handle))

    val cactus: WrapperDamageSource
        get() = WrapperDamageSource(cactusHandle.invoke(handle))

    fun spit(arg0: WrapperEntity, arg1: WrapperLivingEntity): WrapperDamageSource {
        return WrapperDamageSource(spitHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val inFire: WrapperDamageSource
        get() = WrapperDamageSource(inFireHandle.invoke(handle))

    val dryOut: WrapperDamageSource
        get() = WrapperDamageSource(dryOutHandle.invoke(handle))

    fun windCharge(arg0: WrapperEntity, arg1: WrapperLivingEntity): WrapperDamageSource {
        return WrapperDamageSource(windChargeHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val starve: WrapperDamageSource
        get() = WrapperDamageSource(starveHandle.invoke(handle))

    fun sting(arg0: WrapperLivingEntity): WrapperDamageSource {
        return WrapperDamageSource(stingHandle.invoke(handle, arg0.handle))
    }

    fun arrow(arg0: WrapperAbstractArrow, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(arrowHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun fireball(arg0: WrapperFireball, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(fireballHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    fun trident(arg0: WrapperEntity, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(tridentHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val wither: WrapperDamageSource
        get() = WrapperDamageSource(witherHandle.invoke(handle))

    val campfire: WrapperDamageSource
        get() = WrapperDamageSource(campfireHandle.invoke(handle))

    fun explosion(arg0: WrapperEntity, arg1: WrapperEntity): WrapperDamageSource {
        return WrapperDamageSource(explosionHandle.invoke(handle, arg0.handle, arg1.handle))
    }

    val fall: WrapperDamageSource
        get() = WrapperDamageSource(fallHandle.invoke(handle))

    fun playerAttack(arg0: WrapperPlayer): WrapperDamageSource {
        return WrapperDamageSource(playerAttackHandle.invoke(handle, arg0.handle))
    }

    val outOfBorder: WrapperDamageSource
        get() = WrapperDamageSource(outOfBorderHandle.invoke(handle))

    val genericKill: WrapperDamageSource
        get() = WrapperDamageSource(genericKillHandle.invoke(handle))

    val fellOutOfWorld: WrapperDamageSource
        get() = WrapperDamageSource(fellOutOfWorldHandle.invoke(handle))

    val flyIntoWall: WrapperDamageSource
        get() = WrapperDamageSource(flyIntoWallHandle.invoke(handle))

}
