fun main (){
    val text: String? = null

//    if (text != null){
//        println(text.length)
//    }
//    else{
//        println("it is Null")
//    }
    // println(text?.length) // ? operator works for same as above if not Null & for null just displays it



//    println(text!!.length) // works for both null and non-null, for null throws exception

    val text2 = text?: "variable is Null " // if text is null then string is assigned to text2
    println(text2)
}
