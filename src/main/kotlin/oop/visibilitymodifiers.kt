// 4. protected : restricts control to the containing class and subclasses. (Visibility modifier for inheritance )

// public
class A {

}

public class B{

}

// private
private class C {
    private val numberPrint = 10
    fun display(){
        println(numberPrint)
    }
}

// protected
open class D{
    //protected variable
    open protected val numberPrint = 10
}

class E: D(){
    //changing the value of numberprint
    override val numberPrint = 20

    fun getValue(): Int{
        return numberPrint
    }
}

//constructors can also have a visibility mode
class F(name:String){

}

class G private constructor(name:String){

}



fun main() {
    var c  = C()
    // display has access to number print as the method is defined within the same scope /class
    c.display()
// cannot access numberprint due to its private nature
//    println(c.numberPrint)
    var e = E()
    println(e.getValue())
    var f = F("Joseph")
//    var g = G("Joseph")  # android
}
