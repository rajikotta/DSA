fun myPow(x: Double, n: Int): Double {


    var base = x
    var exponent = n.toLong() // To handle edge cases like Int.MIN_VALUE
    var result = 1.0

    if (exponent < 0) {
        base = 1 / base
        exponent = -exponent
    }
    while (exponent > 0) {

        result *= base
        exponent --
    }
     val MOD = 100000009


    return result
}