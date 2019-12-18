package kotlinw.js.react

import org.w3c.dom.events.Event

var kotlinx.html.CommonAttributeGroupFacade.onMouseEnterFunction: (Event) -> Unit
    get() = throw UnsupportedOperationException("You can't read variable onMouseEnter")
    set(newValue) {
        consumer.onTagEvent(this, "onmouseenter", newValue)
    }

var kotlinx.html.CommonAttributeGroupFacade.onMouseLeaveFunction: (Event) -> Unit
    get() = throw UnsupportedOperationException("You can't read variable onMouseLeave")
    set(newValue) {
        consumer.onTagEvent(this, "onmouseleave", newValue)
    }
