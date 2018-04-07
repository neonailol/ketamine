import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    base
    kotlin("jvm")
}

dependencies {
    compile(kotlin("stdlib-jdk8"))
    compile(kotlin("reflect"))
    compile("io.arrow-kt:arrow-core:0.6.1")
    compile("com.fasterxml.jackson.core:jackson-core:2.9.5")
    compile("com.fasterxml.jackson.core:jackson-annotations:2.9.5")
    compile("com.fasterxml.jackson.core:jackson-databind:2.9.5")
    compile("com.fasterxml.jackson.module:jackson-module-kotlin:2.9.5")
    compile("com.fasterxml.jackson.module:jackson-module-parameter-names:2.9.5")
    compile("com.fasterxml.jackson.datatype:jackson-datatype-jsr310:2.9.5")
    compile("org.slf4j:slf4j-api:1.7.25")
    compile("ch.qos.logback:logback-core:1.2.3")
    compile("ch.qos.logback:logback-classic:1.2.3")
}
