plugins {
    id("kotlin-spock-conventions")
}

tasks {
    jacocoTestReport {
        dependsOn(
            ":fundamentals:data-structures:test",
            ":fundamentals:algorithms:test",
        )
        val dataStructures = file("../data-structures/build/jacoco/test.exec")
        val algorithms = file("../algorithms/build/jacoco/test.exec")
        executionData.setFrom(listOf(dataStructures, algorithms))
        sourceDirectories.setFrom(
            project(":fundamentals:data-structures").sourceSets.getByName("main").output,
            project(":fundamentals:algorithms").sourceSets.getByName("main").output
        )
        additionalClassDirs.setFrom(
            project(":fundamentals:data-structures").sourceSets.getByName("main").output,
            project(":fundamentals:algorithms").sourceSets.getByName("main").output,
        )
        additionalSourceDirs.setFrom(
            project(":fundamentals:data-structures").sourceSets.getByName("main").allSource,
            project(":fundamentals:algorithms").sourceSets.getByName("main").allSource,
        )
        sourceSets(
            project(":fundamentals:data-structures").sourceSets.getByName("main"),
            project(":fundamentals:algorithms").sourceSets.getByName("main"),
        )
    }
}
