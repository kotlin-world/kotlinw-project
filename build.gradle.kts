buildscript {
    repositories {
        mavenCentral()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://plugins.gradle.org/m2/") }
    }

    val dokkaVersion: String by project
    val kotlinVersion: String by project
    dependencies {
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:$kotlinVersion")
        classpath("org.jetbrains.kotlin:kotlin-serialization:$kotlinVersion")
        classpath("org.jetbrains.dokka:dokka-gradle-plugin:$dokkaVersion")
    }
}

group = "kotlinw"

tasks.wrapper {
    gradleVersion = "6.0.1"
    distributionType = Wrapper.DistributionType.ALL
}

allprojects {
    repositories {
        mavenCentral()
        jcenter()
        maven { url = uri("https://dl.bintray.com/kotlin/kotlin-eap") }
        maven { url = uri("https://kotlin.bintray.com/ktor") }
        maven { url = uri("https://kotlin.bintray.com/kotlinx") }
        maven { url = uri("https://dl.bintray.com/kotlin/kotlinx.html") }
        maven { url = uri("https://kotlin.bintray.com/kotlin-js-wrappers") }
        maven { url = uri("https://repo.spring.io/milestone") }
        maven { url = uri("https://dl.bintray.com/kotlin/exposed") }
        maven { url = uri("https://jitpack.io") }
    }
}

subprojects {
    apply(plugin = "org.jetbrains.dokka")

    tasks {
        val dokka by getting(org.jetbrains.dokka.gradle.DokkaTask::class) {
            outputFormat = "gfm"
            outputDirectory = "$buildDir/dokka"
        }
    }
}
