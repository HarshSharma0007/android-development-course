fun main(args: Array<String>){
//    val car1 = Car("   Tesla ","S Plaid","Red",4)
////    car1.name = "Tesla"
////    car1.model = "S Plaid"
////    car1.color = "Red"
////    car1.doors = 4
//
//    println("Name: ${car1.name}")
//    println("Model: ${car1.model}")
//    println("Color: ${car1.color}")
//    println("Doors: ${car1.doors}")
//
//    car1.move()
//    car1.stop()
//
//    val car2 = Car("Ford","Mustang","Blue",2)
////    car2.name = "Ford"
////    car2.model = "Mustang"
////    car2.color = "Blue"
////    car2.doors = 2
//
//    println("Name: ${car2.name}")
//    println("Model: ${car2.model}")
//    println("Color: ${car2.color}")
//    println("Doors: ${car2.doors}")
//
//    car2.move()
//    car2.stop()

///////////////////////////////////
//    val user = User("Alex", "Dobinca", 23)
//    val friend = User("KAndra", "Smith", 30)
//    println("Name: ${friend.name}")

    val user = User(firstName = "Alex")
    val friend = User(firstName = "John", lastName = "Smith")
    val user2 = User(age = 19, firstName = "Ioana", lastName = "Dobbbi")
    println("${user.firstName}")
    println("${user.lastName}")
    println("${user.age}")
    println("\n")
    println("${friend.firstName}")
    println("${friend.lastName}")
    println("${friend.age}")

}



class User(firstName: String,var lastName: String = "LastName", var age: Int = 0){
//    var name: String
//    var lastName: String
//
//    init {
//        if(name.lowercase().startsWith("a")){
//            this.name = name
//        }else{
//            this.name = "User"
//            println("This name don't Start with 'a' or 'a'")
//        }
//    }
//    init {
//        this.lastName = lastName
//        println("lastname: ${this.lastName}")
//    }
/////////////////// Multiple init is good///////////
/////////////////// Multiple constructor is Not good: use Parameterised Constructors///////////


//    constructor(name: String): this(name, "LastName", 0){
//        println("2nd")
//    }
//
//    constructor(name: String,lastName: String): this(name, lastName, 0){
//        println("3rd")
//    }


////////////getter & setter are implicitely defined in the kotlin //
    var firstName = firstName
//    get() = field
    //or
    get(){
        return "FirstName: $field"
    }
    set(value){
        println("$value was assigned tp first name propety.")
        field = value
    }
}