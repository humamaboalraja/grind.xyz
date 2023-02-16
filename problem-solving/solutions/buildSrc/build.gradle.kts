import java.io.FileInputStream
import java.util.Properties

val props = Properties()
FileInputStream(file("../gradle.properties")).use {
    props.load(it)
}

plugins {
    val kotlinVersion = "1.8.10"
    `kotlin-dsl`
    kotlin("jvm") version kotlinVersion apply false

    // Quality metrics using SonarQube
    id("org.sonarqube") version "3.5.0.2730"

}

sonarqube {
    properties {
        property("sonar.projectKey", "humamaboalraja_grind.xyz")
        property("sonar.organization", "humamaboalraja")
        property("sonar.host.url", "https://sonarcloud.io")
    }
}

subprojects {
    apply(plugin = "java")
    repositories {
        mavenCentral()
    }
}

repositories {
    gradlePluginPortal()
}

allprojects {
    group = "xyz.grind.coding"
    version = "1.0-SNAPSHOT"
}

dependencies {
    val kotlinVersion = props.getProperty("kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-allopen:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-noarg:$kotlinVersion")
    implementation("org.jetbrains.kotlin:kotlin-reflect")
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("com.diffplug.spotless:spotless-plugin-gradle:6.2.0")
    implementation("org.jacoco:org.jacoco.core:0.8.7")
}
