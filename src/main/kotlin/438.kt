//fun findAnagrams(s: String, p: String): List<Int> {
//
//    val wordHash = Array(26) { 0 }
//    val subwordHash = Array(26) { 0 }
//
//    val result = mutableListOf<Int>()
//
//    fillIndex(p, subwordHash)
//
//    val len = p.length
//
//    for (i in s.indices) {
//        if (i + len > s.length)
//            break
//        wordHash.fill(0)
//        val subString = s.substring(i..<i + len)
//        fillIndex(subString, wordHash)
//        if (wordHash.contentEquals(subwordHash))
//            result.add(i)
//
//    }
//    return result
//}
//abab
fun findAnagrams(s: String, p: String): List<Int> {

    var l = 0
    var r = p.length - 1
    val result = mutableListOf<Int>()

    val wordHash = Array(26) { 0 }
    val subwordHash = Array(26) { 0 }
    fillIndex(p, subwordHash)
    fillIndex(s.substring(l..r), wordHash)

    while (r <= s.length) {

        if (wordHash.contentEquals(subwordHash))
            result.add(l)
        wordHash[s[l] - 'a']--
        l++
        r++
        if (r < s.length)
            wordHash[s[r] - 'a']++

    }


    return result

}


fun fillIndex(str: String, hash: Array<Int>) {
    for (char in str) {
        hash[char - 'a'] = hash[char - 'a'] + 1
    }
}