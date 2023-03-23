// variable : container for storing data
// use var or val and assing value using the = sign.
// var variablename = value
// val variablename = value

//differences between var and val
// variables declared with var can be changed : variable is mutable
// variables declared with val : cannot be changed : variable is immutable

fun main(){
    var name  = "Joseph" //string
    println(name)
    name = "mary"
    println(name)
    val name2 = "John"  //this is immutable.
    println(name2)
    // data types :
    val myNum : Int= 5  // Int (Integer)
    val myDouble : Double = 5.99 // double or float
    val myLetter: Char = 'D' // Char
    val myString: String = "Da" // strings
    val my_Boolean = true //boolean (true or false)
// Data types in kotlin
//Number, Characters , Boolean , Strings , Array.
// Number is divided into two groups
// Integer(byte, short, int, long) types : store whole number , positive or negative without decimal
// Floating point types (represents numbers with fractional parts : containing one or more decimals)

    // Integer Types:
    //byte : can be used to store a whole number from -128 to 127
    val byteNum: Byte = 126
    //short : can be used to store whole numbers from -32768 to 32767
    val shortNum: Short = 5000
    // Int : whole number from -2147483648 to 2147483647
    val intNum: Int = 1000000
    // long: whole numbers from -9223372036854775807 to 9223372036854775807
    // the use is when Int is not large enough to store the value
    val longNum: Long = 150000000000L


    //Type Conversion
    // kotlin has a number of in built methods to handle type conversion
//    toByte() : changes a number to a byte type
//    toShort() : changes a number to a short type
//    toInt() : changes a number to a int type
//    toLong() : changes a number to a long type
//    toFloat() : changes a number to a float type
//    toDouble() : changes a number to a float type
//    toChar() : changes a number to a char type
//    toString() : string type;

    val x: Int = 5
    val y: Long = x.toLong()
    println(y)

    //arithmetic operation using the following
    val price = "5000"
    val discount = 50
    println(price.toInt() - discount.toInt())

    //Arithmetic Operators.

//    +	Addition	Adds together two values	x + y
//    -	Subtraction	Subtracts one value from another	x - y
//    *	Multiplication	Multiplies two values	x * y
//    /	Division	Divides one value from another	x / y
//    %	Modulus	Returns the division remainder	x % y
//    ++	Increment	Increases the value by 1	++x
//    --	Decrement	Decreases the value by 1	--x

    // Assignment Operators
//  symbol   use     same as
//    =  	x = 5	 x = 5
//    +=	x += 3	x = x + 3
//    -=	x -= 3	x = x - 3
//    *=	x *= 3	x = x * 3
//    /=	x /= 3	x = x / 3
//    %=	x %= 3	x = x % 3

    var xy = 5
    println(xy)
    xy += 5
    println(xy)

    // Comparison operators in kotlin
//    operator name    example
//    ==	    Equal to	  x == y
//    !=	    Not equal	x != y
//    >	    Greater than	x > y
//    <	    Less than	x < y
//    >=	    Greater than or equal to	x >= y
//    <=	    Less than or equal to	x <= y

    var age  = 10
    var entryage = "10"
    //question : how do i make the two variables comparable ?
    println( age == entryage.toInt())  //expected output is a boolean result

    //logical operators : boolean outputs
//          operator        name       description                                        example
//           && 	    Logical and	  Returns true if both statements are true	         x < 5 &&  x < 10
//            || 	    Logical or	  Returns true if one of the statements is true      x < 5 || x < 4
//            !	        Logical not	  Reverse the result, returns false if the result is true

    println(age == 10 && entryage.toInt() == 10)
    println(age == 9 || entryage.toInt() == 10)
    var result = age != 10 || entryage.toInt() !== 10 // false
    println(!result) //this checks if result is not equal to true thus the println is true because result is false.

}





