fun longestSubstringWithoutRepeating(input: String): Int {

    var length = 0
    var l = 0
    val map: MutableMap<Char, Int> = mutableMapOf()
    input.forEachIndexed { index: Int, c: Char ->
        if (map.containsKey(c)) {

            l = maxOf(map[c]?.plus(1) ?: l, l)
        }
        length = maxOf(length, index - l + 1)

        map[c] = index


    }







    return length
}