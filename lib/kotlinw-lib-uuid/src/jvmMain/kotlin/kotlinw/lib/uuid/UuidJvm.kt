package kotlinw.lib.uuid

import java.util.*

actual typealias Uuid = UUID

actual fun randomUuid(): Uuid = UUID.randomUUID()

actual fun String.toUuid(): Uuid = Uuid.fromString(this)
