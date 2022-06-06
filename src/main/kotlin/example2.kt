import kotlin.reflect.typeOf

fun main(){
    val name:String?= null
    val number=null // nothing
    val nothing:Nothing?=null
    println("name is $name")
    println("number is $number")
    println("nothing is $nothing")

    val test:String?=null
    println("type of test is ${typeOf<Any>()}")

}