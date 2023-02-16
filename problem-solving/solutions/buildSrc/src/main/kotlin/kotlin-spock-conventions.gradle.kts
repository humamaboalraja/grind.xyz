plugins {
    groovy
    kotlin
    id("kotlin-conventions")
    id("jacoco")
}

tasks.jacocoTestReport {
    dependsOn(tasks.test)
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}
