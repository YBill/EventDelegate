import kotlin.properties.Delegates

/**
 * Created by Bill on 2017/8/8.
 * 标准委托：可观察属性
 */

class User {
    var name: Int by Delegates.observable(0) {
        prop, old, new ->
        println("$old -> $new")
    }
    var gender: Int by Delegates.vetoable(3) {
        prop, old, new ->
        (old < new)
    }
}

fun main(args: Array<String>) {
    val user = User()
    user.name = 2    // 输出 0 -> 2
    user.name = 1   // 输出 2 -> 1

    user.gender = 2
    println(user.gender.toString()) // 输出 2
    user.gender = 1
    println(user.gender.toString()) // 输出 2
}
