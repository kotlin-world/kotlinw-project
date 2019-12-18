import kotlinw.build.NpmVersion

plugins {
    kotlin("js")
}

apply<kotlinw.build.JsWrapperPlugin>()

kotlin {
    sourceSets.main {
        dependencies {
            api(project(":js-wrapper:kotlinw-js-react-web"))
            api(npm("antd", NpmVersion.antd))
        }
    }
}
