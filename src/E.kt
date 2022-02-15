@Deprecated(
    message = "Use CalculatorV3 instead.",
    replaceWith=ReplaceWith("CalculatorV3"),
    level = DeprecationLevel.HIDDEN
)
class Calculator{
    fun add(a:Int,b:Int):Int=a-b
}

class CalculatorV3{
    fun add(a:Int,b:Int)=a+b
}

fun main() {
    val calc= CalculatorV3()
}