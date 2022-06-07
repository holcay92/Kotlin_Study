fun main(){
    print("enter a grade: ")
    var grade:Int = readLine()?.toInt() ?: 0
    when(grade){
        in 0..59 -> println("Grade: F")
        in 60..69 -> println("Grade: D")
        in 70..79 -> println("Grade: C")
        in 80..89 -> println("Grade: B")
        in 90..100 -> println("Grade: A")
        else -> println("Invalid grade")
    }
    println("comparing: ${grade.compareTo(50)} ")

    val answer = readLine()!!
    if(answer.contains("Yes",ignoreCase = true)){
        println("its a yes!!")
    }
    else{
        println("its a no!!")
    }

    val result: String = if(answer.lowercase()=="yes") {
        "öğrenci"
    }else{
        "öğrenci değil"
    }
    println(result)
}
