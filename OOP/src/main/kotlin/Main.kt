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
///////////////////////////////////////////////////////
//    val user = User(firstName = "Alex")
//    val friend = User(firstName = "John", lastName = "Smith")
//    val user2 = User(age = 19, firstName = "Ioana", lastName = "Dobbbi")
//    println("${user.firstName}")
//    println("${user.lastName}")
//    println("${user.age}")
//    println("\n")
//    println("${friend.firstName}")
//    println("${friend.lastName}")
//    println("${friend.age}")
////////////////////////////////////////////////
//    val calculator = Calculator()
//    calculator.sum(5,10)
// if we want to create a class.method() instead of classObject.method()
//    val result = Calculator.sum(5,10)
//    Calculator.max
//    println(result)

///////***********************************************//////
//    val instance = Database.getInstance()
//    val instance2 = Database.getInstance()
//    println(instance2)
//    println(instance)

    ////////////////////////////////////
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)
//    println(Database)

//    val user1 = User("Alex", "Dobbin", 23)
////    val user2 = User("User", "lastName", 23)
//    val user2 by lazy{
//        User("User1", "lastname", 23)
//    }
// lazy:(initializer)
// if you run it there will be no output for user2 from
// the class but if you use it (user2 object) in main
// class we will be able to see the user2's output
// from class also.

////********************************************////
    
//    println(Direction.WEST)
//    println(Direction.EAST)
//    println(Direction.NORTH)
//    println(Direction.SOUTH)

//    for (direction in Direction.values()) {
//        println(direction)
//    }

//    println(Direction.NORTH.direction)
//    println(Direction.NORTH.distance)
//    println(Direction.NORTH.name)
//    Direction.WEST.printData()



//    val direction = Direction.EAST
//    val direction = Direction.valueOf("east".uppercase())
//    when(direction){
//        Direction.EAST -> {
//            println("the east")
//        }
//        Direction.WEST -> {
//            println("the west")
//        }
//        Direction.NORTH -> {
//            println("the north")
//        }
//        Direction.SOUTH -> {
//            println("the south")
//        }
//
//    }
////////////////////////////////////////////////////
    // innner class
//    val listView = LiveView(arrayOf("Name 1","Name 2","Name 3","Name 4"))
//
//    listView.ListViewItem().displayItem(2)

//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//////////////---CHALLENGE PROBLEMS---//////////////////
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//
//^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^//

    val alexAccount = Account(accountName = "Alex")
    alexAccount.deposit(1000)
    alexAccount.withdraw(500)
    alexAccount.deposit(-20)
    alexAccount.withdraw(-100)
    val balance = alexAccount.calculateBalance()
    println("Balance = $balance")



}

class Account(val accountName: String){
    // created a class with a default constructor as `accountName`
    private var balance = 0     // initial balance of any object will be = 0
    private var  transactions = mutableListOf<Int>()     // will have a mutable string for the transaction

    fun deposit(amount: Int){
            // we will allow for the positive deposit only
        if(amount>0) {
            transactions.add(amount)    // will append the transaction amount to the list.
            balance += amount   // and update the balance of the given object
            println(
                "$amount Deposited. Balance is now ${this.balance}"
            )
        }else{
                println("Cannot Deposit the negative Sums.")
            }

    }

    fun withdraw(withdrawal: Int){
        // for withdrawal we will allow only for the non-negative value withdrawal only
        // therefore checking for only Negative(here we will take zero as negative)
        if (-withdrawal<0){
            transactions.add(-withdrawal)    // will append the transaction amount to the list.
            this.balance += -withdrawal     // will deduct the withdrawalled amount from the ```balance of that object```.
            println("$withdrawal Withdrawal. balance is now ${this.balance}")
            }
        else{
            println("Cannot withdraw for the negative value.")
        }
    }

    fun calculateBalance(): Int{
        this.balance = 0
        for (transaction in  transactions){
            this.balance += transaction
        }
        return this.balance
    }

}


