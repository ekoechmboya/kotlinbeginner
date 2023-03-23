class Car (var make: String, var model: String, var year: String){

    // nested class
    // use the keyword inner class Classname
    inner class Engine{
        // access to make model year and methods of Car
        var horspower: Int = 0
        var cylinders: Int = 0

        fun getEngineInfo(): String {
            return "$horspower engine horspower, $cylinders engine cylinders $make $model"
        }
    }
}

fun main(){
    val myCar = Car(model = "toyota", make = "corolla", year = "2004")

    val engine = myCar.Engine()
    println(engine.getEngineInfo())

}