fun maxConsecutive1s(array: IntArray, k: Int): Int {

    var len = 0

    var zeros = 0
    var l = 0
    var r = 0
    while (r <= array.lastIndex) {

        if (array[r] == 0) zeros++
        if (zeros > k) {
            while (zeros > k) {
                if (array[l] == 0) zeros--
                l++
            }
        } else {
            len = maxOf(len, r - l + 1)
        }

        r++
    }

    return len

}