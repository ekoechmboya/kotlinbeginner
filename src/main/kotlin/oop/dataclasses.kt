// we use data classes to hold data
// it has some custom inbuilt methods to work with the data
// rules in creating data classes:
// 1. the primary constructor needs to have at least one parameter
// 2. all parameters marked as val or var
// 3. data classes cannot be abstract, open, sealed, inner
// 4. data classes may only implement interfaces

fun main(){
    // declaring a data class
    data class Person(val name: String, val gender: String, var height: String)
    // declare a variable to reference the data held in a data class
    val person1 = Person("Enock", "Male", "5.9")
    // printing details from a data class
    println(person1.toString())

    data class car(val model: String, val make: String ){
        var engineType = "xyz"

    }
    val car1 = car("Corolla", "Toyota")

    val car2 = car1.copy("Carina")
    car1.engineType= "zyx"

    // to print / access one thing
    println(car1.engineType)
    println(car2.toString())

    // hashCode() returns a hash code value for
    // equals() returns true if two objects have the same content
    val person2 = person1.copy(name= "John")
    val person3 = person1.copy()
    // checking for equality : hashcode
    // two hashcodes declared two times on the same object will be equal
    // if two objects are equal , the hash codes are also equal
    val hash1 = person1.hashCode()
    val hash2 = person2.hashCode()
    val hash3 = person3.hashCode()

    println(hash3)
    println(hash1)
    println(hash2)

    // checking for equality of the objects
    println("hash 1 is equal to hash2 ${hash1.equals(hash2)}")
    println("hash 2 is equal to hash3 ${hash2.equals(hash3)}")
    println("hash 1 is equal to hash3 ${hash1.equals(hash3)}")

}