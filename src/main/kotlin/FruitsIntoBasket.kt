fun fruitIntoBasket(array: IntArray, k: Int): Int {
    var leng = 0

    val map: MutableMap<Int, Int> = mutableMapOf()
    var l = 0
    var r = 0

    while (r < array.size) {

        val element = array[r]
        map[element] = (map[element] ?: 0) + 1

        while (map.size > k) {
            map[array[l]] = (map[array[l]] ?: 0) - 1
            if (map[array[l]] == 0)
                map.remove(array[l])
            l += 1
        }
        leng = maxOf(leng, map.values.reduce { acc, i -> acc + i })


        r++
    }


    return leng
}