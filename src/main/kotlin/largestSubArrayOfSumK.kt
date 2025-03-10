fun largestSubArrayOfSumK(array: IntArray, k: Int): Int {
    var leng = 0

    var i = 0
    var sum = 0
    for (j in 0..array.lastIndex) {

        sum += array[j]

        if (sum == k)
            leng = maxOf(leng, j - i + 1)
        else if (sum > k) {
            while (sum > k && i <= j) {
                sum -=  array[i]
                i++
            }

        }


    }








    return leng

}