fun longestSubstringWithoutRepeatingWithSet(input: String): String {

    var length = 0
    var l = 0
    var r = 0
    val set: MutableSet<Char> = mutableSetOf()
    var result = ""
    while (r < input.length) {
        val char = input[r]
        if (set.contains(char)) {
            while (input[l] == char) {
                l++
            }

            set.add(char)
        } else {
            set.add(char)
            result += char
        }
        r++
    }




    return result
}