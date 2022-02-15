fun main() {
    println(function(1,5))
}
val function: (Int, Int) -> Float = ::add

//         (Int,  Int) ->Float 这就是 add 函数的类型
//           ↑     ↑      ↑
fun add(a: Int, b: Int): Float { return (a+b).toFloat() }