fun findContentChildren(g: IntArray, s: IntArray): Int {
    var maxChildren = 0

    g.sort()
    s.sort()

    var i = 0
    var j = 0
    while (i < s.size && j < g.size) {

        if (g[j] <= s[i]) {
            maxChildren++
            j++
        }
        i++
    }

    return maxChildren
}