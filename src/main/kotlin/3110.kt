import kotlin.math.abs

fun scoreOfString(s: String): Int {

    if (s.length <= 1)
        return 0
    var sum = 0
    for (k in 0..<s.length-1) {
        sum += abs(s[k].code - s[k+1].code)
    }
    return sum
}