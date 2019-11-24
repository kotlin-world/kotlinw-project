package kotlinw.lib.time

expect class Year : Comparable<Year>

expect val Year.value: Int
expect val Year.isLeap: Boolean

object Years

expect fun Years.of(isoYear: Int): Year

@Suppress("unused")
fun Years.isLeap(isoYear: Int) = Years.of(isoYear).isLeap
