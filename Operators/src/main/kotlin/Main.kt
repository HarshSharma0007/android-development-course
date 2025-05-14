fun main() {

    var x = 5
    var y = 3

    println("x + y = ${x + y}")
    println("x - y = ${x - y}")
    println("x * y = ${x * y}")
    println("x / y = ${x / y}")
    println("x % y = ${x % y}")

    println(" 3 + 3 * 4 = ${3 + 3 * 4}")

    var result = x + y

    result += 2
    println("result = $result")

    result -= 2
    println("result = $result")

    result *= 2
    println("result = $result")

    result /= 2
    println("result = $result")

    result %= 2
    println("result = $result")

    x = 0
    println("x++ : ${x++}")
    println("++x : ${++x}")


    val myNumber = 100

    if (myNumber != 150) {
        println("not equal to 150.")
    } else if (myNumber <= 150) {
        println("less than or equal to 150.")
    } else {
        println("All the Conditions Failed.")
    }

//    val isActive = true
//    val score = 100
//    val internetSpeed = 4000
//    if (isActive && score == 100 && internetSpeed == 5000){
//        println("You are at the next Level.")
//    }
//    else{
//        println("You are at the same Level.")
//    }

    val num1 = 5
    val num2 = 4
    val text =  if (num1 > 0 || num2 > 0) {
        println("Condition is true")
        "this is text 1"
    }
    else{
        println("Condition is False")
        "this is text 2"
    }
    println(text)
}