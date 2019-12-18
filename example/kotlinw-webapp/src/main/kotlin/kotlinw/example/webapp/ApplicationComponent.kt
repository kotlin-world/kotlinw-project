package kotlinw.example.webapp

import react.RBuilder
import react.RComponent
import react.RProps
import react.RState
import react.router.dom.browserRouter
import react.router.dom.route
import react.router.dom.switch

class ApplicationComponent : RComponent<RProps, RState>() {
    override fun RBuilder.render() {
        browserRouter {
            switch {
                route("/", true) {
                    child(HomePage::class) {}
                }
                route("/home", false) {
                    child(HomePage::class) {}
                }
            }
        }
    }
}
