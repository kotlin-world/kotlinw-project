package kotlinw.example.webapp

import kotlinx.css.Display
import kotlinx.css.FlexDirection
import kotlinx.css.display
import kotlinx.css.flexDirection
import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.dom.hr
import react.router.dom.routeLink
import styled.css
import styled.styledDiv

class NavBarComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        styledDiv {
            css {
                display = Display.flex
                flexDirection = FlexDirection.row
            }
            styledDiv {
                routeLink("/home") {
                    +"⌂"
                }
            }
        }
        hr {}
    }
}
