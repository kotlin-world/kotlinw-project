import kotlinw.build.Lib
import kotlinw.build.NpmVersion

plugins {
    kotlin("js")
}

apply<kotlinw.build.JsWrapperPlugin>()

kotlin {
    sourceSets.main {
        dependencies {
            api(Lib.kotlinReact)
            api(npm("react", NpmVersion.react))

            api(Lib.kotlinReactDom)
            api(npm("react-dom", "16.12.0"))

            api(Lib.kotlinReactRouterDom)
            api(npm("react-router-dom", "5.1.2"))

            api(Lib.kotlinCss)
            api(Lib.kotlinCssJs)

            api(Lib.kotlinStyled)
            api(npm("styled-components", "4.4.1"))
            api(npm("inline-style-prefixer", "5.1.0"))
            api(npm("css-in-js-utils", "3.0.2"))

            api(Lib.kotlinExtensions)
            api(npm("core-js", "3.4.1"))
        }
    }
}
