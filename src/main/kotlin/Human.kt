open class Human(private var name: String, private var age: Int, private var gender: String) {
    fun getGender() = gender
    fun getName() = name
    fun getAge() = age

    fun sayHi() {
        println("Hi, I'm ${this.name}");
    }

    override fun toString(): String {
        return "Name: ${getName()}, Age: ${getAge()}, Gender: ${getGender()}"
    }
}
fun main() {
    val human = Human("Halil", 30, "Male")
    println(human.getGender())
    human.sayHi()
    val halil = Student(
        "Halil Olcay", 30, "Male",
        "Marmara University", 150120056, "Computer Science")
    println(halil.toString())


}