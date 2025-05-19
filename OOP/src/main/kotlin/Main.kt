fun main(args: Array<String>) {
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

//    val alexAccount = Account(accountName = "Alex")
//    alexAccount.deposit(1000)
//    alexAccount.withdraw(500)
//    alexAccount.deposit(-20)
//    alexAccount.withdraw(-100)
//    val balance = alexAccount.calculateBalance()
//    println("Balance = $balance")
//

//******************INHERITANCE*********************************//
//    val car = Car("BMW", "red", 1,4)
//    val plane = Plane("Boeing", "White & blue", 4,4)
//
//    car.move()
//    car.stop()
//
//    plane.move()
//    plane.stop()

//******************Sealed Class***********************//


//    val success = Result.Success("Success!")
////    val erroe = Result.Error("Failed!")
//    val progress = Result.Progress("Progress!")
////    success.showMessage()
//    getData(progress)

//******************Abstract Class***********************//
//    val name1 = "Alex"
//    val name2 = "Alex"
//
//    println(name2==name1)// equating operator
//    println(name2===name2) // referential equationg operator
//
//******************Equality Operators********************
//    val user1 = User("Alex", "Dobbin", 5)
//    val user2 = User("Alex", "Dobbin", 5)
//    // println(user1 == user2) // false SINCE
//    println(user1.equals(user2))
//    println(user1)
//    println(user2)
//******************Interface********************


}


interface Engine {
    fun startEngine()

}

class Car(val name:String, val color: String):Engine {
    override fun startEngine(){
        println("The car is starting the end.")

    }
}

class Truck (val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The truck is starting the end.")

    }
}

class Plane(val name: String, val color: String ): Engine{
    override fun startEngine() {
        println("The plane is starting the end.")
    }
}

class Tesla (val name: String, val color: String): Engine{
    override fun startEngine() {
        println("The tesla is starting the engine.")
    }
}