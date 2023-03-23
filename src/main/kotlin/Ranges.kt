fun main(){
    //create a range
    // using the for in loop
    for(chars in 'a'..'x'){
        println(chars)
    }
    for (num in 1..10){
        println(num)
    }
    //checking if a value exists within a specified range
    val nums = 1..10
    if (2 in nums){
        println("Number does exist.")
    } else {
        println("Number does not exist.")
    }
    println("...................")
    //break or continue a range
    //place the break and continue before the println/return value
    for (digit in 1..10){
        if (digit == 4){
            break
        }
        println(digit)
    }
    println("...................")
    for (digit in 1..10){
        if (digit == 4){
            continue
        }
        println(digit)
    }
}