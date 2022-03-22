package app

import data.Person


fun main(){
    val widya = Person()
    widya.firstName = "Widya"
    widya.middleName = "Ayu"
    widya.lastName = "Lestari"

    widya.sayHello("Mala")
    widya.run()

    val fullName = widya.getFullName()
    println(fullName)

}