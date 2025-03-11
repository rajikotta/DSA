import kotlin.math.max

fun findSubArrayWithMaxSum(array: IntArray): Int {
    var maxSum = Int.MIN_VALUE

    var r = 0
    var sum = 0
    while (r < array.size) {
        sum += array[r]
        maxSum = maxOf(maxSum, sum)
        if (sum < 0)
            sum = 0
        r++
    }

    return maxSum
}