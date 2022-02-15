
interface A {
    fun funA()
}

interface B {
    fun funB()
}

abstract class Man {
    abstract fun findMan()
}

fun main() {
    // 这个匿名内部类，在继承了Man类的同时，还实现了A、B两个接口
    val item = object : Man(), A, B{
        override fun funA() {
            // do something
            println("A")
        }
        override fun funB() {
            // do something
            println("B")
        }
        override fun findMan() {
            // do something
            println("Man")
        }
    }
    item.findMan()
}