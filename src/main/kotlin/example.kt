fun main() {
    println("Hello, World!")
    println("enter number between 1..10 : ")
    var number:Int?=null

    do {
        try {
            number = readLine()?.toInt()
            when (number) {
                in 1..10 -> println("number is in range")
                else -> println("number is not in range")
            }
        }
        catch (e: Exception) {
            print("I've just said enter a number, you idiot!\n")
        }

   } while (number !=0)
   print("\nGoodbye!")
}