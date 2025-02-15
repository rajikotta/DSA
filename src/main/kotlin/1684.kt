fun countConsistentStrings(allowed: String, words: Array<String>): Int {
    return words.count {
        it.all {char->
            allowed.contains(char)
        }
    }
}