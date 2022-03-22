package app

import data.User

fun main(){
    val user1 = User("Widya", "rahasia")
    val user2 = User("Ayu", "rahasia12")

    user1.username = "Lestari"
    user1.password = "sangatrahasia"

    println(user1.username)
    println(user1.password)

    println(user2.username)
    println(user2.password)

}