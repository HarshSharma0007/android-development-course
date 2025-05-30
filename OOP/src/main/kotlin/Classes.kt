class Cars(name: String, var model: String, var color: String, var doors: Int) {
    var name = name.trim()
//    var model = model
//    var color = color
//    var doors = doors

    fun move() {
        println("The car is moving.")
    }

    fun stop() {
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
            return a + b
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


object Database {
    init {
        println("Database created.")
    }
}

//class User(firstName: String,var lastName: String = "LastName", var age: Int = 0) {
//    init {
//        println("User $firstName was created.")
//    }
//}


enum class Direction(var direction: String, var distance: Int) {
    NORTH("north", 10),
    SOUTH("south", 20),
    EAST("east", 15),
    WEST("west", 40);

    fun printData() {
        println("Direction $direction and distance : $distance")
    }
}

class LiveView(val items: Array<String>) {
    inner class ListViewItem() {
        fun displayItem(position: Int) {
            println(items[position])
        }
    }
}

class Account(val accountName: String) {
    // created a class with a default constructor as `accountName`
    private var balance = 0     // initial balance of any object will be = 0
    private var transactions = mutableListOf<Int>()     // will have a mutable string for the transaction

    fun deposit(amount: Int) {
        // we will allow for the positive deposit only
        if (amount > 0) {
            transactions.add(amount)    // will append the transaction amount to the list.
            balance += amount   // and update the balance of the given object
            println(
                "$amount Deposited. Balance is now ${this.balance}"
            )
        } else {
            println("Cannot Deposit the negative Sums.")
        }

    }

    fun withdraw(withdrawal: Int) {
        // for withdrawal we will allow only for the non-negative value withdrawal only
        // therefore checking for only Negative(here we will take zero as negative)
        if (-withdrawal < 0) {
            transactions.add(-withdrawal)    // will append the transaction amount to the list.
            this.balance += -withdrawal     // will deduct the withdrawalled amount from the ```balance of that object```.
            println("$withdrawal Withdrawal. balance is now ${this.balance}")
        } else {
            println("Cannot withdraw for the negative value.")
        }
    }

    fun calculateBalance(): Int {
        this.balance = 0
        for (transaction in transactions) {
            this.balance += transaction
        }
        return this.balance
    }

}

//open class Vehicle(val name: String, val color: String){
//    open fun move(){
//        println("$name is moving.")
//    }
//
//    open fun stop(){
//        println("$name has stopped.")
//    }
//}
//class Car(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//
//}
//
//class Plane(name: String, color: String, val engines: Int, val doors: Int): Vehicle(name, color) {
//    override fun move() {
//        super.move()
//        flying()
//
//
//    }
//
//    fun flying(){
//        println("The plane is Flying")
//    }
//}
////////////////////////////////////////////////////
//fun getData(result: Result){
//    when(result) {
//        is Result.Success -> result.showMessage()
//        is Result.Progress -> result.showMessage()
//        is Result.Error.NonRecoverableError -> result.showMessage()
//        is Result.Error.RecoverableError -> result.showMessage()
//    }
//}
///////////////////////////////////////////////////
// we do not used enum as it do not have
// the properties for the following variables
sealed class Result(val message: String) {
    fun showMessage() {
        println("Result : $message")
    }

    class Success(message: String) : Result(message)
    sealed class Error(message: String) : Result(message) {
        class RecoverableError(exception: Exception, message: String) : Error(message)
        class NonRecoverableError(exception: Exception, message: String) : Error(message)
    }

    class Progress(message: String) : Result(message)
}

abstract class Vehicle() {


    abstract fun move()
    abstract fun stop()
}

class Car(name: String, color: String, val engines: Int, val doors: Int) : Vehicle() {
    override fun move() {

    }

    override fun stop() {

    }
}


//class User(var firstName: String, var lastName: String, var age: Int)
//
//{
//    override fun equals(other: Any?): Boolean {
////        return super.equals(other)
//        if (this === other) {
//            return true
//        }
//        if (other is User) {
//            return this.firstName == other.firstName
//                    && this.lastName == other.lastName
//                    && this.age == other.age
//
//        }
//        return false
//    }
//// if you override the .equals than you have to override the .hashcode also.
//    override fun hashCode(): Int {
//        return 0
//    }
//
//    override fun toString(): String {
//        return "User(Fname='$firstName', lastname= '$lastName', age='$age'"
//    }
//}
// ???????????????OR?????????????????
data class User2(var firstName: String, var lastName: String, var age: Int)


//interface Engine {
//    fun startEngine()
//
//}
//
//class Car(val name:String, val color: String):Engine {
//    override fun startEngine(){
//        println("The car is starting the end.")
//
//    }
//}
//
//class Truck (val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("The truck is starting the end.")
//
//    }
//}
//
//class Plane(val name: String, val color: String ): Engine{
//    override fun startEngine() {
//        println("The plane is starting the end.")
//    }
//}
//
//class Tesla (val name: String, val color: String): Engine{
//    override fun startEngine() {
//        println("The tesla is starting the engine.")
//    }
//}



class Button(val text: String, val id:Int, onClickListener:OnClickListener)

class ClickListener(): OnClickListener{
    override fun onClick() {

    }
}
interface OnClickListener{
    fun onClick()
}

//class App : A by FirstDelegate, B by SecondDelegate() P {
//    override fun print() {
//
//    }
//
//    override fun print2() {
//
//    }
//}
//
//interface A {
//    fun print()
//}
//
//interface B {
//    fun print2()
//}
//
//open class FirstDelegate : A {
//    override fun print() {
//
//    }
//}
//
//open class SecondDelegate : B {
//    override fun print2() {
//
//    }
//}
