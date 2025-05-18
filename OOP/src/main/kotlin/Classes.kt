class Car(name: String, var model: String, var color: String, var doors: Int){
    var name = name.trim()
//    var model = model
//    var color = color
//    var doors = doors

    fun move(){
        println("The car is moving.")
    }
    fun stop(){
        println("Thw car has stopped.")
    }
}




// class User(firstName: String,var lastName: String = "LastName", var age: Int = 0){
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
//    var firstName = firstName
//        //    get() = field
//        //or
//        get(){
//            return "FirstName: $field"
//        }
//        set(value){
//            println("$value was assigned tp first name propety.")
//            field = value
//        }
//}

//class User(firstName: String,var lastName: String = "LastName", var age: Int = 0){
//    var firstName = firstName
//        //    get() = field
//        //or
//        get(){
//            return "FirstName: $field"
//        }
//        set(value){
//            println("$value was assigned tp first name propety.")
//            field = value
//        }
//}


class Calculator() {
    companion object {
        var max = 100
        fun sum(a: Int, b: Int): Int {
            return a+b
        }
    }
}

//
//class Database private constructor(){
//
//    companion object{
//        private var instance: Database? = null
//        fun getInstance(): Database? {
//            if(instance == null){
//                instance = Database()
//            }
//            return instance
//        }
//    }



//}


object Database{
    init{
        println("Database created.")
    }
}

class User(firstName: String,var lastName: String = "LastName", var age: Int = 0) {
    init {
        println("User $firstName was created.")
    }
}
