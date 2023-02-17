plugins {
    id("grind-xyz-conventions")
}


testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
            dependencies {
                implementation("org.junit.jupiter:junit-jupiter:5.8.2")
                implementation("io.quarkus:quarkus-jacoco:2.0.0.Alpha2")
                implementation("org.jacoco:org.jacoco.agent:0.8.8")
                implementation("org.junit.jupiter:junit-jupiter-api:5.8.2")
                implementation("org.junit.jupiter:junit-jupiter-engine:5.8.2")
            }
        }
    }
}
