/**
 * Created by Bill on 2017/8/8.
 * 标准委托：Map映射
 */

class User2(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int by map
}

fun main(args: Array<String>) {
    val user = User2(mapOf(
            "name" to "John Doe",
            "age" to 25
    ))
    println(user.name) // Prints "John Doe"
    println(user.age)  // Prints 25
}
