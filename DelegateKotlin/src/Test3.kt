/**
 * Created by Bill on 2017/8/8.
 * 标准委托：延迟属性
 */

val lazyValue: String by lazy {
    println("Just run when first being used")
    "value"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println("+++++++++++")
    println(lazyValue)
}
