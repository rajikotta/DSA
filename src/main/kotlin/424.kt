import kotlin.math.max

fun longestRepeatingCharReplacement(input: String, k: Int): Int {
    var maxLen = 0
    for (i in 0..input.lastIndex) {

        val freqArray: Array<Int> = Array(26) { 0 }
        var maxFreq = 0

        for (j in i..input.lastIndex) {

            freqArray[input[j] - 'A']++
            maxFreq = maxOf(maxFreq, freqArray[input[j] - 'A'])
            if (j - i + 1 - maxFreq <= k)
                maxLen = maxOf(maxLen, j - i + 1)
            else
                break
        }
    }
    return maxLen
}


fun longestRepeatingCharReplacementOptimal(input: String, k: Int): Int {
    var maxLen = 0
    val freqArray: Array<Int> = Array(26) { 0 }
    var maxFreq = 0

    var l = 0
    var r = 0

    while (r < input.length) {

        freqArray[input[r] - 'A']++
        maxFreq = maxOf(maxFreq, freqArray[input[r] - 'A'])
        if ((r - l + 1) - maxFreq <= k) {
            maxLen = maxOf(maxLen, r - l + 1)
        } else {
            freqArray[input[l] - 'A']--
            l++
        }

        r++
    }
    return maxLen
}

