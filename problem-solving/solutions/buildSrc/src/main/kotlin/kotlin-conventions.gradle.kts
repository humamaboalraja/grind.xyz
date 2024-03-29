import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    id("com.diffplug.spotless")
//    kotlin("jvm")
     kotlin("jvm")
    kotlin("plugin.allopen")
    kotlin("plugin.noarg")
}

allOpen {
    annotation("javax.enterprise.context.ApplicationScoped")
    annotation("javax.enterprise.context.RequestScoped")
    annotation("javax.inject.Singleton")
    annotation("javax.persistence.Entity")
    annotation("javax.ws.rs.Path")
}



configurations {
    all {
        exclude(module = "logback-classic")
    }
}

configure<com.diffplug.gradle.spotless.SpotlessExtension> {
    kotlin {
        ktlint()
    }
    kotlinGradle {
        ktlint()
    }
}

noArg {
    annotation("javax.persistence.Entity")
}

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

tasks {
    withType<JavaCompile> {
        options.encoding = "UTF-8"
        options.compilerArgs.add("-parameters")
        sourceCompatibility = JavaVersion.VERSION_18.toString()
        targetCompatibility = JavaVersion.VERSION_18.toString()
    }
}

tasks {
    withType<KotlinCompile> {
        kotlinOptions {
            javaParameters = true
            freeCompilerArgs = listOf("-Xjsr305=strict")
            jvmTarget = "1.8"
        }
    }
}


val compileTestKotlin: KotlinCompile by tasks
compileTestKotlin.kotlinOptions {
    jvmTarget = "1.8"
}
