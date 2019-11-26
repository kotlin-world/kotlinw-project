package kotlinw.lib.time

//
// Year
//

actual typealias Year = java.time.Year

actual val Year.value: Int get() = value

actual val Year.isLeap: Boolean get() = isLeap

//
// Years
//

actual fun Years.of(isoYear: Int): Year = Year.of(isoYear)
