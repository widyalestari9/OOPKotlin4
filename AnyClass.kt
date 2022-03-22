package app

import data.SmartPhone

fun main(){
    val smartPhone = SmartPhone("Redmi Note 10 Pro","Android")

    println(smartPhone.toString())
    println(smartPhone.hashCode())
}