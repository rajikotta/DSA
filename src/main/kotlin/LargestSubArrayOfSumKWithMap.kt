fun largestSubArrayOfSumKWithMap(array: IntArray, k: Int): Int {
    var leng = 0  //1,2,1,1,1,4

    var sum = 0
    val map: MutableMap<Int, Int> = mutableMapOf()
    array.forEachIndexed { i, it ->

        sum += it
        if (sum == k)
            leng = maxOf(leng, i+1)
        else {
            if (map.contains(sum-k)) {
                leng = maxOf((i - map[sum-k]!!), leng)
            }
        }
        map[sum] = i

    }


    return leng
}
