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

object Months {
    fun of(month: Int): Month {
        require(month in 1..12)
        return Month.values()[month - 1]
    }
}
