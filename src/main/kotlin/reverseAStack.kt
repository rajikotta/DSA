import java.util.Stack

fun reverse(stack: Stack<Int>) {
    if (stack.isEmpty())
        return
    val top = stack.pop()
    reverse(stack)
    insertAtBottom(stack, top)
}

fun insertAtBottom(stack: Stack<Int>, item: Int) {
    if (stack.isEmpty()) {
        stack.push(item)
        return
    }

    val top = stack.pop()
    insertAtBottom(stack, item)
    stack.push(top)
}

fun main() {

    val stack = Stack<Int>()
    stack.push(10)
    stack.push(15)
    stack.push(1)
    stack.push(2)
    reverse(stack)
    println(stack.joinToString(" "))

}