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
    println("--------------------------------------------\n enter country code: ")

    val countryCode=readLine()!!
    when(countryCode.lowercase()){
        "tr","az"-> println("Turk Vatandas")
        "ar"->println("Arab Vatandası")
        "us" -> println("United States")
        "fr"->println("France Vatandası")
        "ru"->println("Russian Vatandası")
        "uk"->println("United Kingdom Vatandası")
        else -> println("Invalid country code")
    }
    println("--------------------------------------------\nyes or no")

    val answer = readLine()!!
    if(answer.contains("Yes",ignoreCase = true)){
        println("its a yes!!")
    }
    else{
        println("its a no!!")
    }
    println("--------------------------------------------")

    val result: String = if(answer.lowercase()=="yes") {
        "öğrenci"
    }else{
        "öğrenci değil"
    }
    println(result)
    println("--------------------------------------------")

    // state kullanimi
    if(answer.contains("Evet",ignoreCase=true)){
        println("Öğrenci")
    }else{
        println("Öğrenci Değil")
    }
    println("--------------------------------------------")

// expression kullanimi.{icerisindeki son satir,deger olarak degiskene atanir.
    val result1:String=if(answer =="Evet"){
        "Öğrenci"


    }else{"Öğrenci Değil"
    }
}
