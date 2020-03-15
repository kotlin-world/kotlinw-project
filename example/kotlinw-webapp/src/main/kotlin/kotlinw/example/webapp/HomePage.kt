package kotlinw.example.webapp

import kotlinw.js.antd.ButtonComponent
import react.*
import styled.styledDiv

external interface HomePageProps : RProps

external interface HomePageState : RState {
    var clickCount: Int
    var message: String
}

class HomePage(props: HomePageProps) : RComponent<HomePageProps, HomePageState>(props) {
    override fun HomePageState.init(props: HomePageProps) {
        clickCount = 0
        message = "Click the button!"
    }

    override fun RBuilder.render() {
        child(PageLayoutComponent::class) {
            styledDiv {
                child(MouseWatcher)
            }
            styledDiv {
                +state.message
            }
            styledDiv {
                child(ButtonComponent::class) {
                    attrs.onClick = {
                        setState {
                            clickCount++
                            message = "Clicked $clickCount times."
                        }
                    }
                    +"Click me!"
                }
            }
        }
    }
}
