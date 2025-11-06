// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND

fun foo(x: Int) {
    when {
        x == 0 -> {}
        x > 1 -> <!BREAK_OR_CONTINUE_OUTSIDE_A_LOOP!>continue<!>
        else -> {}
    }
}

/* GENERATED_FIR_TAGS: comparisonExpression, continue, equalityExpression, functionDeclaration, integerLiteral,
whenExpression */
