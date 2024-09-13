fun main() {
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
}

class Person(
    val name: String,
    val age: Int,
    val hobby: String?,
    val referrer: Person?
) {

    fun showProfile() {
        println("Name: $name")
        println("Age: $age")
        if (hobby != null) {
            println("Likes to $hobby.")
        }
        if (referrer != null) {
            println("Has a referrer name ${referrer.name}")
        } else {
            println(".")
        }
        println("/n/n")
        //
    }
}