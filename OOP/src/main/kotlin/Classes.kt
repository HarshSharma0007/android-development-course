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