import data.HandPhone
import data.Laptop

fun printObject(any : Any){
    if(any is Laptop){
        println("Laptop with name ${any.name}")
    }else if(any is HandPhone){
        println("HandPhone with name ${any.name}")
    }else {
        println(any)
    }

}

fun printObjectWithWhen(any : Any){
    when (any) {
        is Laptop -> {
            println("Laptop with name ${any.name}")
        }
        is HandPhone -> {
            println("HandPhone with name ${any.name}")
        }
        else -> {
            println(any)
        }
    }


}
fun printString(any: Any){
    val value = any as String
    println(value)
}

fun printStringSafe(any: Any){
    val value = any as? String
    println(value)
}

fun main(){
    printString("Widya")
//    printString(13) ERROR

    printStringSafe("Widya")
    printStringSafe(13) // null

    printObjectWithWhen("Widya")
    printObjectWithWhen(1)
    printObjectWithWhen(Laptop("Xiomi"))
    printObjectWithWhen(HandPhone("Hp"))



    printObject("Widya")
    printObject(1)
    printObject(Laptop("Asus"))
    printObject(HandPhone("Samsung"))


}