fun main(){
    // use strings to store text / sequence of characters
    var name = "Joseph"
    //Accessing characters in a string
    // we use index positioning 0
    println(name[0])
    println(name[5])
    //get the length of a string
    println(name.length)
    //conversion of string from uppercase to lowercase
    println(name.toUpperCase())
    println(name.toLowerCase())
    //compare two sets of string
    var name2  = "Joseph"
    println(name.compareTo(name2))  // output is either -1: false  or 0 : true
    //find a string within a string
    var helloText = "Please locate where the word locate is"
    println(helloText.indexOf("is")) //looks for the first occurance of the word
    // join/concatenate two strings
    var greeting = "Hello,"
    println(greeting + " " + name2)
    println(greeting.plus(name2))
    //String templating / interpolation
    var lastname = "Mbugua"
    println("My Name is $name $lastname")
}