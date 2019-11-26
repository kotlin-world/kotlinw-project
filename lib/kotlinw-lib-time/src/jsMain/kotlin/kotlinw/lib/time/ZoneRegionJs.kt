package kotlinw.lib.time

import kotlinw.js.luxon.IANAZone

data class ZoneRegion(val name: String) : ZoneId() {
    override val luxonZone by lazy { IANAZone.create(name) }

    override fun getId() = name

    override fun toString() = name
}
