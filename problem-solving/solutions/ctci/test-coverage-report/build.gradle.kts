plugins {
    id("kotlin-spock-conventions")
}

tasks {
    jacocoTestReport {
        dependsOn(
            ":ctci:main:test",
        )
        val blind75ExecData = file("../main/build/jacoco/test.exec")
        executionData.setFrom(listOf(blind75ExecData))
        sourceDirectories.setFrom(
            project(":ctci:main").sourceSets.getByName("main").output
        )
        additionalClassDirs.setFrom(
            project(":ctci:main").sourceSets.getByName("main").output
        )
        additionalSourceDirs.setFrom(
            project(":ctci:main").sourceSets.getByName("main").allSource
        )
        sourceSets(
            project(":ctci:main").sourceSets.getByName("main"),
        )
    }
}
