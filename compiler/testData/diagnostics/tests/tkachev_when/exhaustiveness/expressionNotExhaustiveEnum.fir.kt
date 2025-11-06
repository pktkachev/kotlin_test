// RUN_PIPELINE_TILL: FRONTEND
enum class E {
    A, B, C
}

fun foo(a: E): String {
    return <!NO_ELSE_IN_WHEN!>when<!> (a) {
        E.A -> "A"
        E.B -> "B"
    }
}

/* GENERATED_FIR_TAGS: enumDeclaration, enumEntry, equalityExpression, functionDeclaration, smartcast, stringLiteral,
whenExpression, whenWithSubject */
