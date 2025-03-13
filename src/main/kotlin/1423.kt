fun  maxPointsFromKCards(array: IntArray, k: Int): Int {

    var lsum = 0
    var rsum = 0

    for (i in 0..<k)
        lsum += array[i]

    var l = k - 1
    var r = array.lastIndex
    var maxSum = lsum
    while (l >= 0) {

        rsum += array[r]
        lsum -= array[l]

        r--
        maxSum = maxOf(maxSum,lsum+ rsum)
        l--
    }

    return maxSum
}