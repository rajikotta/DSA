fun rotateString(s: String, goal: String): Boolean {
    return if (s.length != goal.length)
        false
    else {
        (s + s).contains(goal)
    }
}