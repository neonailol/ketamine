import com.github.benmanes.gradle.versions.updates.DependencyUpdatesTask
import org.jetbrains.kotlin.gradle.tasks.KotlinCompile
import org.jetbrains.kotlin.utils.addToStdlib.safeAs

val projectVersion: String = project.prop("project.version")

buildscript {

    repositories {
        mavenCentral()
        jcenter()
        maven("https://jitpack.io")
    }

    dependencies {
        classpath(kotlin("gradle-plugin", "1.2.31"))
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
    maven
    id("com.github.ben-manes.versions") version "0.17.0"
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

tasks.withType<Wrapper> {
    distributionType = Wrapper.DistributionType.ALL
    gradleVersion = "4.6"
}
