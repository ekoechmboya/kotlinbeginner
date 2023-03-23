fun main() {
    sayhi()
    var age = 23
    var name = "Enock"
    fun doWork() = if (age < 21) println("not eligible") else (println("can do work"))
    doWork()
    declare( age=30, name="Enock")
}
fun sayhi() {
    println("hi")
}
fun declare(age: Int, name: String) {
    println("hey $name you are $age")
}
