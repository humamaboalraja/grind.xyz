rootProject.name = "grind.xyz"

pluginManagement {
    repositories {
        mavenCentral()
        gradlePluginPortal()
    }
}

dependencyResolutionManagement {
    repositories {
        mavenCentral()
    }
}


include (
    "leetcode:blind75",
    "leetcode:test-coverage-report",

    "ctci:main",
    "ctci:test-coverage-report",
)

