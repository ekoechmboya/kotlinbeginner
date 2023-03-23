sealed class MySealedClass {
    class A {
        fun display() {
            println("hello from sealed a")
        }
    }
    class B {
        fun display() {
            println("hello from sealed b")
        }
    }
}

fun main(){
    var myObj = MySealedClass.A()
    println(myObj.display())
}
