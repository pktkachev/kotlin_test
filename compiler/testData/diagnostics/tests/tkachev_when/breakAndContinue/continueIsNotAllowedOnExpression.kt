// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND

fun foo(x: Int): Int {
    return when (x) {
        0 -> 0
        1 -> <!BREAK_OR_CONTINUE_OUTSIDE_A_LOOP!>continue<!>
        else -> -1
    }
}

/* GENERATED_FIR_TAGS: continue, equalityExpression, functionDeclaration, integerLiteral, whenExpression,
whenWithSubject */
