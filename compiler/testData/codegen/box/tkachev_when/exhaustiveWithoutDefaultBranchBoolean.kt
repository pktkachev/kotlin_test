/*
When with boolean subject without default branch.
Focus of this test is no compilation error, not actual returned value
 */
fun box(): String {
    statement(true)
    statement(false)

    var s: String

    s = expression(true)
    s = expression(false)

    branchesReverseOrder(true)
    branchesReverseOrder(false)

    return "OK"
}

fun statement(b: Boolean) {
    var s: String
    when (b) {
        true -> s = "true"
        false -> s = "false"
    }
}

fun expression(b: Boolean): String {
    return when (b) {
        true -> "true"
        false -> "false"
    }
}

fun branchesReverseOrder(b: Boolean) {
    var s: String
    when (b) {
        false -> s = "false"
        true -> s = "true"
    }
}