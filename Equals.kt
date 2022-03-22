package app

import data.Company

fun main(){
    val company1 = Company("Widya")
    val company2 = Company("Widya")

    println(company1 == company2)
    println(company1 == company1)
    println(company2 == company2)
//    kalau objectnya sama return valuenya akan true , kalau beda udah pasti false
}