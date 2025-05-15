//fun main(args: Array<String>) {
//    sayHello("Alex", 22)
//    val hasInternetConnection = false
//    if(hasInternetConnection){
//        getData("Some data")
//    }
//    else{
//    showMessage()
//    }
//}
//
//fun sayHello(name: String, age: Int){
//    var number = age
//
//    println("Hello $name, your age is $age")
//}
//
//fun getData(data: String){
//    println("Your data is: $data")
//}
//
//fun showMessage(){
//    println("there's no Internet conn.")
//}


///////////////////////////////////////////////////
//
//fun main(args: Array<String>) {
//    val max = getMax(5, 7, 10)
//    print(max)
//}
//
//fun getMax(a: Int, b: Int) = if (a > b) a else b
//
//fun getMax(a: Double, b: Double) = if (a > b) a else b
//
//fun getMax(a: Int, b: Int, c: Int): Int {
//    return if (a >= b && a >= c) {
//        a
//    } else if (b >= a && b >= c) {
//        b
//    } else {
//        c
//    }
//}


//fun sendMessage(name: String = "User", message: String = sendText()) {
//    println("Nmae: $name and message is $message")
//
//}
/////////////////////////////////////////////////////////
//fun main(){
//    sendMessage( message = "Hello", name = "Alexa")
//}
//
//fun sendText() = "Some Text."


/////////////////////////////////////////////////////////

fun main(args: Array<String>) {
    sum(5, 6, 7, 10)
}

fun sum(vararg numbers: Int) {
//    var result = 0
//
//    for(number in numbers){
//        result += number
//    }
//    return result
    numbers.forEach { println(it) }
}