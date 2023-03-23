fun main(){
//    Kotlin supports the usual logical conditions from mathematics:
//    Less than: a < b
//            Less than or equal to: a <= b
//    Greater than: a > b
//            Greater than or equal to: a >= b
//    Equal to a == b
//    Not Equal to: a != b
//    You can use these conditions to perform different actions for different decisions.
//    Kotlin has the following conditionals:
//    Use if to specify a block of code to be executed, if a specified condition is true
//    Use else to specify a block of code to be executed, if the same condition is false
//    Use else if to specify a new condition to test, if the first condition is false
//    Use when to specify many alternative blocks of code to be executed
    var age = 10
    var entryage = 10
    // if condition is true
    if(age > entryage){
        //if condition is true this block runs
        println("Age is greater than entryage")
    } else if(age != entryage){
        println("else if")

    } else if(age == entryage){
        println("age is equal to entry age")
    }
    else {
        //else runs if same condition is false
        println("age is not greater than entry age")
    }

//     conditional when
    // instead of having multiple else if's , a cleaner approach is to use the when statement
    val day = 10
    val result = when(day) {
        1 -> "Monday"
        2 -> "Tuesday"
        3 -> "Wednesday"
        4 -> "Thursday"
        5 -> "Friday"
        6 -> "Saturday"
        7 -> "Sunday"
        else -> "Invalid Day"
    }
    println(result)
//   comparing age and entryage as per above if , else if , else statement
    when {
        age > entryage -> {
            println("age is not greater than to entry age")
        }
        age != entryage -> {
            println("age is not equal to entry age")
        }
        age == entryage -> {
            println("age is equal to entry age")
        }
        else -> {
            println("age is not greater than entry age")
        }
    }
}



















