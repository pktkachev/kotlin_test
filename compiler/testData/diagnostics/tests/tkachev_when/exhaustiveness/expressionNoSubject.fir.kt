// RUN_PIPELINE_TILL: FRONTEND
fun foo(x: Int): String {
    return <!NO_ELSE_IN_WHEN!>when<!> {
        x < 0 -> "Negative"
        x > 0 -> "Positive"
        x == 0 -> "Zero"
    }
}

/* GENERATED_FIR_TAGS: comparisonExpression, functionDeclaration, integerLiteral, stringLiteral, whenExpression */
