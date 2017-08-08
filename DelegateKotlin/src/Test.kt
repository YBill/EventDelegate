/**
 * Created by Bill on 2017/8/8.
 * 类委托
 */
fun main(args: Array<String>) {
    val b = BaseImpl("5")
    Printer(b).print()
}

interface Base {
    fun print()
}

class BaseImpl(val x: String) : Base {
    override fun print() {
        System.out.println("BaseImpl -> $x")
    }
}

class Printer(b: Base) : Base by b