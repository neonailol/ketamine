import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.utils.addToStdlib.safeAs

//TODO: Move to buildSrc
inline fun <reified T : Any> Project.prop(name: String): T {
    return project.property(name) as T
}

val projectVersion: String = project.prop("project.version")

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
    version = projectVersion

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
