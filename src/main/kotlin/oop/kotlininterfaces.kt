interface Vehicle {

    fun start(process: String)


    fun StartPrintProcess() {
        println("This is a default method in the interface")

    }
    fun stop()



}

class CarInterface : Vehicle {
    override fun start(process: String) {
        TODO("Not yet implemented")
    }

    override fun stop() {
        TODO("Not yet implemented")
    }

    override fun StartPrintProcess() {
        super.StartPrintProcess()
    }
}

interface InterfaceProperties {
    val a : Int

    val b : String
        get() = "Hello"
}

class PropertiesDemo : InterfaceProperties {
    override val a: Int = 5000
    override val b: String = "property override"

}


// Inheritance in Interfaces
// Interfaces in kotlin can inherit other interfaces
//  can inherit more than one interface
// an interface can add its own properties and methds
interface Measurements {
    val length : Int
    val width : Int


}

interface CalculateAreas : Measurements {
    fun area()

    fun perimeter()

    fun printMeasurements()
}

class ConstructionClass : CalculateAreas, InterfaceProperties {

    override val length: Int = 10
    override val width: Int = 10
    override val a: Int = 20

    override fun area() {
        var area = length * width
        println(area)
    }

    override fun perimeter() {
        TODO("Not yet implemented")
    }

    override fun printMeasurements() {
        TODO("Not yet implemented")

    }
}

fun main(){
    var ab = PropertiesDemo()
    println(ab.a)
    var c = ConstructionClass()
    println(c.area())
}
