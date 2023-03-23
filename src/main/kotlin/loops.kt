fun main(){
    // for in arrays , while loop
//    while loop executes a block of a code as long as the specified condition is true
    // print out 1 to 5
    // steps
    // 1. an intializing counter
    var index = 1;
    while(index < 6){
        println(index)
        index++  //the increment or the decrement operator works on the condition to bring the loop to an end
    }
    println("...............")
    // do...while loop
    // will execute the code block once before checking the condition and then proceed to check the condition on the second execution
    var i = 1;
    do {
        println(i)
        i++
    }
    while (i < 6)

    // for in loop to work on arrays
    var cars = arrayOf("BMW","TOYOTA")
    for(x in cars){
        println(x)
    }

    // BREAK and CONTINUE
    // break statement is used to jump out/ terminate a loop
    //place break after println/return and increment/decrement
    var example_break = 0
    while (example_break < 10){
        println(example_break)
        example_break++
        // break will jump out of the loop based on condition stipulated
        if (example_break == 4){
            break
        }
    }
    println(".................................................................................")
    //continue skips the loop for the condition stipulated but does not terminate the loop
    //place continue before println/return and increment/decrement
    var example_continue = 0

    while (example_continue < 10){
        if (example_continue == 4){
            example_continue++
            continue
        }
        println(example_continue)
        example_continue++

    }
}




