abstract class Employee(val name: String, val experience: String){
    abstract val salary : Double
    abstract fun dateofBirth(date: String)
    fun employeeDetails(){
        println("The employee name is ${name}")
        println("The employee experience is ${experience}")
    }
}

class Accountant(name: String, experience: String) : Employee(name= "Enock", experience= "5") {
    override val salary: Double = 500000.00

    override fun dateofBirth(date: String) {
        println(date)


    }

}
open class LivingThings(){
    open fun breathIn(){
        println("Breath in process")
    }

}
abstract class animal : LivingThings(){
    override abstract fun breathIn()
}

class Cat : animal(){
    override fun breathIn() {
        println("the cat ...........")
    }
}
fun main(){
    var employee1 = Accountant("mary", "3")
    employee1.employeeDetails()
    val lt1 = LivingThings()
    println(lt1.breathIn())
    val cat = Cat()
    println(cat.breathIn())
}