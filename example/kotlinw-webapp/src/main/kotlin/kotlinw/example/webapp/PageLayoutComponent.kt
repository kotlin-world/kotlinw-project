package kotlinw.example.webapp

import kotlinx.css.*
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import styled.css
import styled.styledDiv

class PageLayoutComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                minWidth = 320.px
                maxWidth = 1200.px
                media("(min-width: 601px) and (max-width: 1200px)") {
                }
                media("(min-width: 1201px)") {
                    margin(0.px, LinearDimension.auto)
                }
            }
            child(NavBarComponent::class) {
            }
            styledDiv {
                children()
            }
            child(FootBarComponent::class) {
            }
        }
    }
}
