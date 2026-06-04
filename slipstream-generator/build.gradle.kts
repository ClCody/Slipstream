plugins {
    kotlin("jvm")
    id("io.papermc.paperweight.userdev")
}

dependencies {
    paperweight.paperDevBundle("1.21.1-R0.1-SNAPSHOT")
    implementation("io.github.classgraph:classgraph:4.8.165")
    implementation(kotlin("stdlib"))
}

// We only need this to run locally
tasks.register<JavaExec>("generateWrappers") {
    group = "slipstream"
    description = "Generates NMS packet wrappers using ClassGraph"
    
    classpath = sourceSets["main"].runtimeClasspath + sourceSets["main"].compileClasspath
    mainClass.set("net.apogee.slipstream.generator.WrapperGeneratorKt")
}
