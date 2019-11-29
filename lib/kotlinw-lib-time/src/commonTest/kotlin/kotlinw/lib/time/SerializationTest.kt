package kotlinw.lib.time

import kotlinx.serialization.Serializable
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class SerializationTest {
    @Serializable
    data class Data(
            @Serializable(with = InstantSerializer::class) val instant: Instant,
            @Serializable(with = LocalDateSerializer::class) val localDate: LocalDate,
            @Serializable(with = LocalTimeSerializer::class) val localTime: LocalTime,
            @Serializable(with = LocalDateTimeSerializer::class) val localDateTime: LocalDateTime,
            @Serializable(with = YearSerializer::class) val year: Year,
            @Serializable(with = YearMonthSerializer::class) val yearMonth: YearMonth,
            @Serializable(with = ZonedDateTimeSerializer::class) val zonedDateTime: ZonedDateTime,
            @Serializable(with = ZoneIdSerializer::class) val zoneIdLocal: ZoneId,
            @Serializable(with = ZoneIdSerializer::class) val zoneId1: ZoneId,
            @Serializable(with = ZoneIdSerializer::class) val zoneId2: ZoneId
    )

    @Test
    fun testSerialization() {
        val o = Data(
                Instants.now(),
                LocalDates.now(),
                LocalDateTimes.now().time,
                LocalDateTimes.now(),
                Years.now(),
                YearMonths.now(),
                ZonedDateTimes.now(),
                ZoneIds.local,
                ZoneIds.of("Europe/Budapest"),
                ZoneIds.of("UTC+6")
        )
        assertEquals(o, Json.parse(Data.serializer(), Json.stringify(Data.serializer(), o)))
    }
}
