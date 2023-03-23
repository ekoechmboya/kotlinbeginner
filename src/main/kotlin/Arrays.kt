// used to store multiple values in a single variable
fun main(){
    // to create an array
    var cars = arrayOf("BMW","TOYOTA","MERCEDES")
    //access the items/elements
    //reference the index position
    // to get toyota
    println(cars[1])
    println(cars[0])
    println(cars[2])
    //change the content in an existing array
    cars[1] = "JEEP"
    println(cars[1])
    //array length or size
    println(cars.size)
    //check whether an item exists inside an array
    // say i want to check whether volvo is present
    if ("VOLVO" in cars){
        println("It exists")
    } else {
        println("This does not exist.")
    }
    // to iterate/loop/transverse an array , loops (for in)
    println("..........................................................")
    for(x in cars){
        println(x)
//        allows you to perform a logic on the elements in the array
        if (x == "JEEP"){
            println("I have reached jeep")
        }
    }
}