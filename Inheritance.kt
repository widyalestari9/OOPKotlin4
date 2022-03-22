package app

import data.Manager
import data.VicePresident

fun main(){
    val manager = Manager("Widya")
    manager.sayHello("Bagus")

    val vicePresident = VicePresident("Bagus")
    vicePresident.sayHello("Ayu")
}