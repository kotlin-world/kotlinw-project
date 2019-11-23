buildscript {
    repositories {
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }

    val kotlinVersion = "1.3.60" // TODO gradle.properties?
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}

plugins {
    `kotlin-dsl`
}

val kotlinVersion = "1.3.60" // TODO gradle.properties?

apply(plugin = "kotlin")

repositories {
    mavenCentral()
    maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
}

kotlin {
    dependencies {
        implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8:$kotlinVersion")
        implementation("org.jetbrains.kotlin:kotlin-reflect:$kotlinVersion")
        implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
    }
}
