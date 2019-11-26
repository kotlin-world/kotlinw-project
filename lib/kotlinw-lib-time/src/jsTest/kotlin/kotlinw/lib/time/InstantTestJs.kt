package kotlinw.lib.time

import kotlin.test.Test
import kotlin.test.assertEquals

class InstantTestJs {
    @Test
    fun test() {
        with(Instants.ofEpochSecond(1574532489, 999_999_999)) {
            assertEquals(this, dateTime.toInstant(nanoOfSecond.rem(1_000_000)))
        }
    }
}
