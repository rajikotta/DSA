fun countSubArray(array: IntArray, k: Int): Int {
    var count = 0

    val map: MutableMap<Int, Int> = mutableMapOf()
    var prefixSum = 0
    map[prefixSum] = 1
    array.forEach { item ->

        prefixSum += item

        if (map.containsKey(prefixSum - k)) {
            count += map[prefixSum - k]!!
        }
        map[prefixSum] = (map[prefixSum] ?: 0) + 1
    }

    return count

}