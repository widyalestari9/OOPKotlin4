package app

import data.Person

fun main(){
    val widya = Person()
    widya.firstName = "Widya"

    widya.sayHello("Ayu")
    widya.sayHello("Lestari","Mala")
}