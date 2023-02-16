plugins {
    id("kotlin-spock-conventions")
}

tasks {
    jacocoTestReport {
        dependsOn(
            ":leetcode:blind75:test",
        )
        val blind75ExecData = file("../blind75/build/jacoco/test.exec")
        executionData.setFrom(listOf(blind75ExecData))
        sourceDirectories.setFrom(
            project(":leetcode:blind75").sourceSets.getByName("main").output
        )
        additionalClassDirs.setFrom(
            project(":leetcode:blind75").sourceSets.getByName("main").output
        )
        additionalSourceDirs.setFrom(
            project(":leetcode:blind75").sourceSets.getByName("main").allSource
        )
        sourceSets(
            project(":leetcode:blind75").sourceSets.getByName("main"),
        )
    }
}
