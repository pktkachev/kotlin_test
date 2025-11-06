/*
When with Enum subject without default branch.
Focus of this test is no compilation error, not actual returned value
 */
enum class E { A, B, C }

fun box(): String {
    statement(E.A)
    statement(E.B)
    statement(E.C)

    var s: String

    s = expression(E.A)
    s = expression(E.B)
    s = expression(E.C)

    return "OK"
}

fun statement(e: E) {
    var s: String
    when (e) {
        E.A -> s = "A"
        E.B -> s = "B"
        E.C -> s = "C"
    }
}

fun expression(e: E): String {
    return when (e) {
        E.A -> "A"
        E.B -> "B"
        E.C -> "C"
    }
}