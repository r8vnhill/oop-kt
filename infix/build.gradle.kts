plugins {
    id("io.gitlab.arturbosch.detekt")
    kotlin("jvm")
}

val kotlinxDatetimeVersion = extra["kotlinx.datetime.version"] as String

dependencies {
    implementation("org.jetbrains.kotlinx:kotlinx-datetime:$kotlinxDatetimeVersion")
}

kotlin {
    jvmToolchain(17)
}
