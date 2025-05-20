fun main(args: Array<String>) {
    // LIST
    //    val names = mutableListOf("Name 1", "Name 2","Name 1",  "Name 3")

    // SET
    // val names = mutableSetOf<String>("Name 1", "Name 2","Name 1",  "Name 3")
    //names.add("Name 4")
    //names.removeAt(0)
    //names.remove("Name 3")
    // names.add("Name 4")

//    val user1 = User("Nama 1")
//    val user2 = User("Nama 2")
//    val user3 = User("Nama 3")
//    val user4 = User("Nama 4")
//    val user5 = User("Nama 5")
//    val user6 = User("Alex")
//    val user7 = User("Alex")
//
//    val names = mutableSetOf<User>(user1, user2, user3, user4, user5, user6, user7)
//    names.forEach { println(it.name) }

    val users = mutableMapOf<Int, String>(1 to "Maria", 2 to "Alex",3 to "John" )
//    println(users[1])
    users[5] ="Vlad"
    users.remove(2)
    users.forEach { t,u ->
        println("$t and $u ")
    }

}


// class User(val name: String)