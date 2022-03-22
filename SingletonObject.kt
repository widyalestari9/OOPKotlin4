package app

import data.Application
import data.Utilities

fun main(){
    Utilities.name = "Dirubah"
    println(Utilities.toUpper("Mala"))
    a()
    b()

    println(Application.Companion.toUpper("Mala"))
}

fun a(){
    println(Utilities.name)
}

fun b(){
    println(Utilities.name)
}