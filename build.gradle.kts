plugins {
    kotlin("jvm") version "2.0.0" apply false
    id("io.papermc.paperweight.userdev") version "1.7.5" apply false
    id("com.gradleup.shadow") version "8.3.0" apply false
    `maven-publish`
}

allprojects {
    group = "net.apogee.slipstream"
    version = "2.0.0"

    repositories {
        mavenCentral()
        maven("https://repo.papermc.io/repository/maven-public/")
    }
}

subprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    tasks.withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
        kotlinOptions.jvmTarget = "21"
    }
}
