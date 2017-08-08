import kotlin.reflect.KProperty

/**
 * Created by Bill on 2017/8/8.
 *
 * 属性委托
 * 参考：http://www.jianshu.com/p/76bd97249f86
 */

class DelegateProperty {
    var temp = "old"

    operator fun getValue(ref: Any?, p: KProperty<*>): String {
        return "DelegateProperty --> ${p.name} --> $temp"
    }

    operator fun setValue(ref: Any?, p: KProperty<*>, value: String) {
        temp = value
    }

}

class Example {
    var property: String by DelegateProperty() // 这里的String 必须和getValue的返回值和setValue的参数一致
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.property)
    e.property = "new"
    println(e.property)
}
