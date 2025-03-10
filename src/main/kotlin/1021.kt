fun removeOuterParentheses(s: String): String {
    val res = StringBuilder()
    var count = 0
    s.forEach { it ->
        if (it == '(') {
            if (count > 0)
                res.append(it)
            count++
        } else if (it == ')') {
            if (count > 1)
                res.append(it)
            count--
        }
    }
    return res.toString()
}
