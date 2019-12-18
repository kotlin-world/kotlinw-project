import org.jetbrains.kotlin.gradle.targets.js.webpack.KotlinWebpackConfig

plugins {
    kotlin("js")
}

kotlin {
    target {
        browser {
            useCommonJs()
            webpackTask {
                devServer = KotlinWebpackConfig.DevServer(
                        open = false,
                        port = 8081,
                        proxy = mapOf("/" to "http://localhost:8080/"),
                        contentBase = listOf(compilation.output.resourcesDir.canonicalPath)
                )
            }
        }
    }

    sourceSets.main {
        dependencies {
            implementation("org.jetbrains.kotlin:kotlin-stdlib-js")

            implementation(project(":js-wrapper:kotlinw-js-antd"))
            implementation(project(":js-wrapper:kotlinw-js-react-web"))
        }
    }
}
