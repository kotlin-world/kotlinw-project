import kotlinw.build.NpmVersion

plugins {
    kotlin("js")
}

apply<kotlinw.build.JsWrapperPlugin>()

kotlin {
    sourceSets.main {
        dependencies {
            implementation(npm("uuid-random", NpmVersion.uuidRandom))
        }
    }
}
