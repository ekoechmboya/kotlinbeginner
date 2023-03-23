fun main() {
    var user = User()
    user.firstName = "Joan"
    user.lastname = "Chepkoech"
    user.Printname()

    var brother = User()
    brother.firstName = "Enock"
    brother.lastname = "Koech"
    brother.Printname()
}
class User {
    var firstName: String = ""
    var lastname: String = ""
    fun Printname(){
        println("$firstName $lastname")

    }
}