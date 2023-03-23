package oop
class Car {
    var brand = ""
    var model = ""
    var yom = ""


}
class Car2(var brand: String, var model: String, var yom: String, var sound: String = "wroom"){
    fun drive() {
        print(brand + "makes this sound" + sound + "!... ")
    }
        fun speed(maxSpeed: Int){
            println("The car speed is a max of " + maxSpeed)
        }
    }


fun main(){

    val car_one = Car()
    val car_two = Car()

    car_one.brand = "Toyota"
    car_one.model = "Corolla"
    car_one.yom = "2004"

    car_two.brand = "Mercedes"
    println(car_one.brand)
    println(car_two.brand)

    var car_three = Car2(brand = "Volvo", model = "V2", yom = "2000")
    println(car_three.yom)

}