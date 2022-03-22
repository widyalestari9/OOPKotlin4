package app

import data.SuperTeacher
import data.Teacher

fun main(){
    val teacher = SuperTeacher("Alam")
    println(teacher.name)
    teacher.test()

}