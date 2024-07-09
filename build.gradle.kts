plugins {
    kotlin("jvm")
}

allprojects {
    group = rootProject.name
    version = extra["$group.version"] as String
}

subprojects {
    repositories {
        mavenCentral()
    }
}
