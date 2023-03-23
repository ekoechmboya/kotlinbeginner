sealed class Fruit(var x : String){
    class Mango: Fruit("mango")
    class Orange: Fruit("orange")
}
class Banana: Fruit("banana")

fun display(fruit: Fruit){
    when(fruit){
        is Fruit.Mango -> println("${fruit.x} is good for iron: Mango")
        is Fruit.Orange -> println("${fruit.x} is good for iron: Orange")
        is Banana -> println("${fruit.x} is good for iron: Mango")

        else -> {

        }
    }
}
fun main(){
    var ob1 = Fruit.Mango()
    println(display(ob1))
}