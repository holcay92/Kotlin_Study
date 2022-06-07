fun main(){
    print("enter a grade: ")
    var grade:Int = readLine()?.toInt() ?: 0
    when(grade){
        in 0..59 -> println("F")
        in 60..69 -> println("D")
        in 70..79 -> println("C")
        in 80..89 -> println("B")
        in 90..100 -> println("A")
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
