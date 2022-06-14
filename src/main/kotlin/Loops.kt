fun main(){
    for(i in 1..10){
        print("$i ")
    }
    println("\n----------------------------------")
    val countryCodeArray = arrayOf("tr","us", "uk", "ru", "fr", "de", "it", "es", "ch", "jp")
    for(i in countryCodeArray){
        print("$i ")
    }
    println("\n----------------------------------")

    for((index,value) in countryCodeArray.withIndex()){
        print("\n$index değeri : $value")
    }
    println("\n----------------------------------")
    repeat(10){
        print("\n $it Work hard!")
    }
    println("\n----------------------------------")

  returnLabel@  for(i in 1..10 step 2){
        for(j in 1..10 step 2){
            if(j==5){
                print("\n$i $j")
                continue@returnLabel
            }
        }
    }
    println("\n----------------------------------")
   
}

