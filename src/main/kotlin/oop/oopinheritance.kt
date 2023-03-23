// ability of oop to allow a child class to inherit properties
// subclass (child class) > class that inherits
// Superclass > class being inherited from
// class is defined as a superclass if it starts with the keywords open then classname
// Superclass
open class MyParentClass{
    val x = 5;

    open fun customFunction(){
        println("here form parent")
    }

}
// subclass
class MyChildClass(var name: String): MyParentClass(){
    fun childfunction(){
        println(x)

    }
    override fun customFunction(){
        println("here from child")
    }
}

fun main(){
    val myObject = MyChildClass("Enock")
    println(myObject.childfunction())
    println(myObject.customFunction())
}