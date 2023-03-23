fun main(){
    val bytee: Byte = 8
    println(bytee)
    var name= "Enock"
    var age: Int? = 18
    age = null
    println("hello $name your age is $age .\n ${name.length}")
    var x = hello()
    println(x)
}

fun hello(): String {
    return "this is the code"
    // you can put functions inside functions which falls under the scope of the function

}