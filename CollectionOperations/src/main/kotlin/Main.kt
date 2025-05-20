fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println(numbers.associateWith { it.length })
    println(numbers.associateBy{it.first().uppercase()})
    println(numbers.associateBy({it.first().uppercase()}, {it.length}))
//    val numbersSets = arrayOf(arrayOf(1,2,3),arrayOf(4,5,6),arrayOf(7,8,9))
//    println(numbersSets[2][2])


    val numbersSets = listOf(setOf(1,2,3),setOf(4,5,6),setOf(7,8,9))
//    for (numbers in numbersSets){
//        for (number in numbers){
//            println(number)
//        }
//        println("\n")
//    }

    // flatten it from List(Set(Int)) ==> List(Int)
    val numbersFlatten = numbersSets.flatten()
    for (number in numbersFlatten){
        println(number)

    }
}
