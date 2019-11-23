package kotlinw.lib.uuid

import kotlinw.js.uuidrandom.uuid

actual class Uuid constructor(private val uuidString: String) {
    actual override fun toString() = uuidString
}

actual fun randomUuid() = uuid().toUuid()

actual fun String.toUuid() = Uuid(this)
