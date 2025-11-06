// FIR_IDENTICAL
// RUN_PIPELINE_TILL: FRONTEND

enum class E { A, B, C }

/*
When is not a loop, so break and continue are not allowed (unlike Java)
 */
fun foo(x: E) {
    when (x) {
        E.A -> {}
        E.B -> <!BREAK_OR_CONTINUE_OUTSIDE_A_LOOP!>break<!>
        E.C -> {}
    }
}

/* GENERATED_FIR_TAGS: break, enumDeclaration, enumEntry, equalityExpression, functionDeclaration, smartcast,
whenExpression, whenWithSubject */
