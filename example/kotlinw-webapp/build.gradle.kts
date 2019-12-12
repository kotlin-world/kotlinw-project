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

            implementation("org.jetbrains:kotlin-react:16.9.0-pre.87-kotlin-1.3.50")
            implementation(npm("react", "16.12.0"))
            implementation("org.jetbrains:kotlin-react-dom:16.9.0-pre.87-kotlin-1.3.50")
            implementation(npm("react-dom", "16.12.0"))
            implementation("org.jetbrains:kotlin-react-router-dom:4.3.1-pre.87-kotlin-1.3.50")
            implementation(npm("react-router-dom", "5.1.2"))

            implementation("org.jetbrains:kotlin-css:1.0.0-pre.87-kotlin-1.3.50")
            implementation("org.jetbrains:kotlin-css-js:1.0.0-pre.87-kotlin-1.3.50")

            implementation("org.jetbrains:kotlin-styled:1.0.0-pre.87-kotlin-1.3.50")
            implementation(npm("styled-components", "4.4.1"))
            implementation(npm("inline-style-prefixer", "5.1.0"))
            implementation(npm("css-in-js-utils", "3.0.2"))

            implementation("org.jetbrains:kotlin-extensions:1.0.1-pre.87-kotlin-1.3.50")
            implementation(npm("core-js", "3.4.1"))

//            implementation("io.ktor:ktor-client-js:1.2.5")
//            implementation(npm("text-encoding", "0.7.0"))
//            implementation(npm("utf-8-validate", "5.0.2"))

            implementation(npm("antd", "3.25.1"))
        }
    }
}
