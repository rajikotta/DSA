fun countSubstringContainingAllThreeCharacters(input: String): Int {
    var count = 0
    val lastSeen: Array<Int> = Array(3) { -1 }
    input.forEachIndexed { index, char ->

        lastSeen[char - 'a'] = index

        if (lastSeen[0] > -1 && lastSeen[1] > -1 && lastSeen[2] > -1) {
            count += minOf(lastSeen[0], minOf(lastSeen[1], lastSeen[2])) + 1
        }
    }


    return count


}