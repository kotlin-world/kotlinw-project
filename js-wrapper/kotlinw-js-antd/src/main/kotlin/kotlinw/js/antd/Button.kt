@file:JsModule("antd")

package kotlinw.js.antd

import org.w3c.dom.events.MouseEvent
import react.Component
import react.RProps
import react.RState

external interface ButtonProps : RProps {
    /**
     * disabled state of button
     * default: false
     */
    var disabled: Boolean

    /**
     * make background transparent and invert text and border colors, added in 2.7
     * default: false
     */
    var ghost: Boolean

    /**
     * redirect url of link button
     */
    var href: String

    /**
     * set the original html type of button, see: MDN
     * default: button
     */
    var htmlType: String

    /**
     * set the icon of button, see: Icon component
     */
    var icon: String
    /**
     *set the loading status of button
     */
    @JsName("loading")
    var loadingFlag: Boolean

    /**
     * can be set to circle or omitted
     */
    var shape: String

    /**
     * can be set to small large or omitted
     * default: default
     */
    var size: String

    /**
     * same as target attribute of a, works when href is specified
     */
    var target: String

    /**
     * can be set to primary ghost dashed danger(added in 2.7) or omitted (meaning default)
     */
    var type: String

    /**
     * set the handler to handle click event
     */
    var onClick: (event: MouseEvent) -> Unit

    /**
     * option to fit button width to its parent width
     * default: false
     */
    var block: Boolean

    var style: dynamic
}

@JsName("Button")
external class ButtonComponent : Component<ButtonProps, RState> {
    override fun render(): dynamic
}
