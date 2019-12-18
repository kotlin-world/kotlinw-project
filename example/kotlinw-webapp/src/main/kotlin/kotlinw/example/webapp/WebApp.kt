package kotlinw.example.webapp

import react.dom.render
import kotlin.browser.document

fun main() {
    render(document.getElementById("container")) {
        child(ApplicationComponent::class) {}
    }
}
