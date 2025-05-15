fun main(args: Array<String>) {
//  val names: Array<String> = arrayOf("John", "Stephen", "Megan")
//    val names = arrayOf("John", "Stephen", "Megan")
//    val mixedElements = arrayOf(4,5,6,7,4, "name 1", 'a')
//    names[0] = "Alex"
//    println("First Element : ${names[0]}")
//    println("The size of Array is : ${names.size}")
//
////    for(name in names){
////        println(name)
////    }
//    for(i in mixedElements){
//        if (i is Char){
//            println(i)
//        }
////        if (i is String){
////            println(i)
////        }
//    }


    //////////////CHALLENGE////////////////////
    val max = findMaxAndMin(arrayOf(4,5,6,7,4,3,6), searchMax = true)
//    val min = findMin(arrayOf(4,5,6,7,4,3,6))
    val min = findMaxAndMin(arrayOf(4,5,6,7,4,3,6), searchMax = false)
    println("max: $max, min: $min")
}
fun findMaxAndMin(numbers: Array<Int>, searchMax: Boolean):Int{
    var max = numbers[0]
    var min = max
    if (searchMax){
        for (number in numbers){
            if( number >max){
                max = number
            }
        }
        return max
    }else{
        for(number in numbers){
            if (number< min){
                min = number
            }
        }
        return min
    }



}
//fun findMax(numbers: Array<Int>): Int {
//    var max = numbers[0]
//    for (number in numbers) {
//        if (number > max) {
//            max = number
//        }
//    }
//    return max
//}
//
//fun findMin(numbers: Array<Int>): Int {
//    var min = numbers[0]
//    for (number in numbers) {
//        if (number < min) {
//            min = number
//        }
//    }
//    return min
//}