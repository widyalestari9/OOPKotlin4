package app

import data.Student
import data.sayHello
import data.upperName

fun main(){
    val student: Student? = Student("Widy", 20)
    student?.sayHello("Ayu")
    println(student?.upperName)
}