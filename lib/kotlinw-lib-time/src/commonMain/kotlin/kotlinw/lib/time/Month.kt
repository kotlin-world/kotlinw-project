package kotlinw.lib.time

expect enum class Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER
}

val Month.value: Int get() = ordinal + 1

object Months

@Suppress("unused")
fun Months.of(monthValue: Int): Month {
    require(monthValue in 1..12)
    return Month.values()[monthValue - 1]
}
