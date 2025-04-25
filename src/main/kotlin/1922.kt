import kotlin.math.floor
import kotlin.math.log10

fun countGoodNumbers(n: Long): Int {
    val evenCount = (n + 1) / 2
    val oddCount = n / 2

    val evenWays = power(5, evenCount, MOD)
    val oddWays = power(4, oddCount, MOD)

    return ((evenWays * oddWays) % MOD).toInt()
}

const val MOD = 1_000_000_007L

fun power(base: Long, exp: Long, mod: Long): Long {
    var result = 1L
    var b = base
    var e = exp

    while (e > 0) {
        if (e % 2 == 1L) result = (result * b) % mod
        b = (b * b) % mod
        e /= 2
    }

    return result
}