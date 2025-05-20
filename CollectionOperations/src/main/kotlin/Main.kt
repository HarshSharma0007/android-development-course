fun main() {
//    val numbers = listOf("one", "two", "three", "four")
//    println(numbers.associateWith { it.length })
//    println(numbers.associateBy{it.first().uppercase()})
//    println(numbers.associateBy({it.first().uppercase()}, {it.length}))
////    val numbersSets = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
////    println(numbersSets[2][2])
//
//
//    val numbersSets = listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
////    for (numbers in numbersSets){
////        for (number in numbers){
////            println(number)
////        }
////        println("\n")
////    }
//
//    // flatten it from List(Set(Int)) ==> List(Int)
//    val numbersFlatten = numbersSets.flatten()
//    for (number in numbersFlatten){
//        println(number)
//
//    }
/////////////////////////Strings Conversions??????/////
//    val numbersStrings = listOf("one", "two","three", "four")
//    println(numbersStrings)
//    println(numbersStrings.joinToString ())
//
//    val listString = StringBuffer("The list of numbers: ")
//    println(numbersStrings.joinTo(listString))
//
//    println(numbersStrings.joinToString(" | ",  prefix = "start: ", " end."))
//
//    val numbers = (1..100).toList()
//    println(numbers.joinToString (limit = 25, truncated = "<..>" ))
//    println(numbersStrings.joinToString { "Element: ${it.uppercase()}" })
//

///////////////////////////Filtering///////
    val numbers = listOf("one", "two", "three","four")
    val longerThan3 = numbers.filter{it.length > 3}
    println(longerThan3)

    val numbersMap = mapOf("Key1" to 1,"Key2" to 2,"Key3" to 3,"Key101" to 101)
    val filteredMap = numbersMap.filter{ it.key.endsWith("1")&& it.value>100  }
    println(filteredMap)


    val filteredIndx = numbers.filterIndexed { index, value -> (index != 0) && (value.length < 5) }
    val filteredNot = numbers.filterNot { it.length<=3 }
    println(filteredIndx)
    println(filteredNot)

    val mixedList = listOf(1,2,3,'a','B','C',"Hello World", "Alex", false)
    mixedList.filterIsInstance<String>().forEach {
        println(it)
    }
    // Partition
    println("\n")
    val (match , rest) = numbers.partition { it.length > 3}

    println(match)
    println(rest)
    println(numbers.any{it.endsWith("e")})
    println(numbers.none{it.endsWith("w")})
    println(numbers.all{it.length > 1})
}
