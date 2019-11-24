package kotlinw.lib.time

actual typealias Year = java.time.Year

actual val Year.value: Int get() = value

actual val Year.isLeap: Boolean get() = isLeap

actual fun Years.of(isoYear: Int): Year = Year.of(isoYear)
