import java.util.*

fun main() {
    val rawPineTree = """
        |          *
        |         ***
        |        *****
        |       *******
        |        *****
        |         ***
        |          *
    """.trimMargin()
    //println(rawPineTree)
    val rawPineTree1 = """
        |          *
        |         ***
        |        *****
        |       *******
        |        *****
        |         ***
        |          *
    """.trimMargin("|")
    //println(rawPineTree1)



    val rawPineTree2 = """
        |          *
        |         ***
        |        *****
        |       *******
        |        *****
        |         ***
        |          *
    """.trimIndent()
    ///trimMargin

    //println(rawPineTree2)
    var name="halil"
    for (char in name){
        //print(char)
    }
    for (i in rawPineTree){
       // println(i)
    }
    var str = "halil"
    println("name: ${name.length}")
    println("name: ${name.reversed()}")
    println("name: ${name.uppercase()}")
    println("name: ${name.lowercase()}")
    var asd = str[str.indices.first]
    println(asd)
    val name1:String = "halil"+2+4+6
    //val name2:String = (2+6+4)+"halil"
    val number = 1..10
    val num1 = 1.rangeTo(100) step 5
    val gradeNum = 20 downTo 0
    for (i in gradeNum){
        print(" i: $i")
    }
    println()
    for (i in num1){
        print(" i :$i")
    }
    println()
    for (i in number){
        print(i)
    }
}