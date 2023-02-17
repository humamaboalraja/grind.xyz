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


tasks.register<JacocoReport>("codeCoverageReport") {
    executionData(fileTree(project.rootDir.absolutePath).include("**/build/jacoco/*.exec"))
    dependsOn(allprojects.map { it.tasks.named<Test>("test") })
}
