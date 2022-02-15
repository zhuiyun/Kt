import kotlin.reflect.full.memberProperties

fun main() {
    val student = Student("Tom", 99.5, 170)
    val school = School("PKU", "Beijing...")

    readMembers(student)
    readMembers(school)
}

fun readMembers(obj: Any) {
    // 读取obj的所有成员属性的名称和值
//    obj::class.memberProperties.forEach {
//        if (it.name == "address" && // ①
//            it is KMutableProperty1 && // ②
//            it.setter.parameters.size == 2 && // ③
//            it.getter.returnType.classifier == String::class // ④
//        ) { // ⑤
//            it.setter.call(obj, "China") println ("====Address changed.====")
//        }
//    }
}

data class Student(
    val name: String,
    val score: Double,
    val height: Int
)

data class School(
    val name: String,
    var address: String
)

// 要求readMembers函数能够输出以下内容：
