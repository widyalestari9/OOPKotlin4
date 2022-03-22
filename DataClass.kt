package app

import data.Product

fun main(){
    val product = Product("Indomie", 3500,"Food")


    val product2 = product.copy("Sarimi")


    println(product)
    println(product2)
}