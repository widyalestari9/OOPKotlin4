package app

import data.MyBase
import data.MyBaseDelegate

fun main(){
    val base = MyBase()
    base.sayHello("Widya")

    val baseDelegate = MyBaseDelegate(base)
    baseDelegate.sayHello("Rey")
    baseDelegate.sayGoodBye("Ayu")
}