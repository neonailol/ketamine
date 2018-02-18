import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

buildscript {

    repositories {
        mavenCentral()
        jcenter()
        maven("https://jitpack.io")
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.2.21"))
    }
}

allprojects {

    group = "nnl.rocks.ketamine"
    version = "1.0-SNAPSHOT"

    repositories {
        mavenCentral()
        jcenter()
        maven("https://jitpack.io")
    }
}

plugins {
    base
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            jvmTarget = "1.8"
            javaParameters = true
            verbose = true
            freeCompilerArgs = listOf("-Xjsr305=strict")
        }
    }
}

dependencies {
    subprojects.forEach {
        archives(it)
    }
}
