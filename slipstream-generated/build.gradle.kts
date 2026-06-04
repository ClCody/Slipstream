plugins {
    kotlin("jvm")
    id("io.papermc.paperweight.userdev")
    `maven-publish`
}

dependencies {
    paperweight.paperDevBundle("1.21.1-R0.1-SNAPSHOT")
    implementation(kotlin("stdlib"))
}

paperweight {
    reobfArtifactConfiguration = io.papermc.paperweight.userdev.ReobfArtifactConfiguration.MOJANG_PRODUCTION
}

tasks.named("compileKotlin") {
    dependsOn(":slipstream-generator:generateWrappers")
}

publishing {
    publications {
        create<MavenPublication>("maven") {
            from(components["java"])
        }
    }
}
