fun main(args: Array<String>) {

//    for (i in 1..10){
//        println(i)
//    }

//    for (i in 1 until 10){
//        println(i)
//    }

//    for (i in 10 downTo 1) {
//        println(i)
//    }

//    for ( i in 1 until 10 step 2){
//        println(i)
//    }

/////////////////////////////////////////////////////
    // while loop
//    var number = 0
//    while (number<10){
//        println(number)
//        number++
//    }
//////////////////////////////////////////////////////
// DO while loop
//    var number = 10
//
//    do {
//        println(number)
//    } while (number < 10)
/////////////////////////////////////////////////////////

//    var number = 0
//    while (number<10){
//        number++
//        if (number == 7){
//            continue
//        }
//        println(number)
//    }

    //////////////////////////
//    var number = 0

//    while( number<10 ){
//        number++
//        if(number ==7){
//            break
//        }
////        if(number in 3..7){
////            continue
////        }
//        println(number)
//    }
//
//    for (i in 0..10){
//        if(i ==7){
//            break
//        }
//        println(i)
//    }

///////////////////////////////////////////////////////
//    while (number < 5){
//        number++
//        println(number)
//
//        var i = 0
//
//        while(i<5){
//            i++
//            println("***$i")
//        }
//    }
////////////////////////////////////
    var number = 1
    val lastNumber = 20
    var evenNumberCounter = 0

//    while (number <= lastNumber) {
//        number++
//
//        if (!isEven(number)) {
//            continue
//        }
//        evenNumberCounter++
//        println(number)
//    }
//
    for (i in 1..20){
        if(i%2!=0){
            continue
        }
        println(i)
        evenNumberCounter++
    }
    println("total number of even numbers found : $evenNumberCounter")
}

fun isEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}