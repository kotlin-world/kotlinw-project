import kotlinw.build.Lib
import kotlinw.build.NpmVersion
import kotlinw.build.jsMain

plugins {
    kotlin("multiplatform")
    id("kotlinx-serialization")
}

apply<kotlinw.build.LibPlugin>()

kotlin {
    sourceSets.jsMain {
        dependencies {
            implementation(project(":js-wrapper:kotlinw-js-luxon"))
            implementation(Lib.kotlinExtensions)
            implementation(npm("core-js", NpmVersion.coreJs))
        }
    }
}
