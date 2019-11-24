package kotlinw.lib.time

import kotlinw.js.luxon.IANAZone

class ZoneRegion(val name: String) : ZoneId() {
    override val luxonZone by lazy { IANAZone.create(name) }

    override fun getId() = name

    override fun equals(other: Any?) = other is ZoneRegion && name == other.name

    override fun hashCode() = name.hashCode()

    override fun toString() = name
}
