package app

import data.ExecutiveCustomer
import data.PremiumCustomer

fun main(){
    val premiumCustomer = PremiumCustomer("Widya")
    println(premiumCustomer.name)

    val executiveCustomer = ExecutiveCustomer("Widya",130000000000)
    println(executiveCustomer.name)
    println(executiveCustomer.balance)
}