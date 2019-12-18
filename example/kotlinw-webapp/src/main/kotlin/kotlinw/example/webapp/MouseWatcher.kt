package kotlinw.example.webapp

import org.w3c.dom.events.Event
import org.w3c.dom.events.MouseEvent
import react.RProps
import react.dom.span
import react.functionalComponent
import react.useEffectWithCleanup
import react.useState
import kotlin.browser.window


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
