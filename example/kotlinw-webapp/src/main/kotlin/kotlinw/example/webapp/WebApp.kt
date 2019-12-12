package kotlinw.example.webapp

import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import react.*
import react.dom.div
import react.dom.render
import react.dom.span
import kotlin.browser.document
import kotlin.browser.window

fun main() {
    render(document.getElementById("container")) {
        div {
            child(MouseWatcher)
        }
    }
}

data class MousePosition(val x: Int, val y: Int)

fun useMousePosition(): MousePosition {
    val (position, setPosition) = useState(MousePosition(0, 0))

    fun handleMouseMove(e: Event) {
        if (e is MouseEvent) {
            setPosition(MousePosition(e.clientX, e.clientY))
        } else {
            TODO()
        }
    }

    useEffectWithCleanup(emptyList()) {
        window.addEventListener("mousemove", ::handleMouseMove);
        { window.removeEventListener("mousemove", ::handleMouseMove) }
    }

    return position
}

val MouseWatcher = functionalComponent<RProps> {
    val p = useMousePosition()
    span {
        +"${p.x}, ${p.y}"
    }
}
