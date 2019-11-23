package kotlinw.lib.uuid

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class UuidTest {
    @Serializable
    data class A(@Serializable(with = UuidSerializer::class) val uuid: Uuid)

    @Test
    fun testSerialization() {
        val a = A(randomUuid())
        assertEquals(a, Json.parse(A.serializer(), Json.stringify(A.serializer(), a)))
    }
}
