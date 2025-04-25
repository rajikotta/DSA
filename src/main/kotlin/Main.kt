import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import java.util.Stack
import kotlin.system.measureTimeMillis
import kotlin.time.measureTime
import kotlin.time.measureTimedValue

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
var a ="rfwef"
    a= a.substring(0..1)

    a= a.plus("wef")
    println(a)

//println( findAnagrams("cbaebabacd","abc").joinToString(","))
}



