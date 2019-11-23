package kotlinw.lib.uuid

import kotlinw.js.uuidrandom.uuid

actual class Uuid constructor(private val uuidString: String) {
    override fun equals(other: Any?) = other is Uuid && uuidString == other.uuidString

    override fun hashCode() = uuidString.hashCode()

    actual override fun toString() = uuidString
}

actual fun randomUuid() = uuid().toUuid()

actual fun String.toUuid() = Uuid(this)
