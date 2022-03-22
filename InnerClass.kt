package app

import data.Boss

fun main() {
    val boss1 = Boss("Widya")
    val employee1 = boss1.Employee("Ayu")
    val employee2 = boss1.Employee("Tari")

    val boss2 = Boss("Mala")
    val employee3 = boss1.Employee("Ayu")
    val employee4 = boss1.Employee("Tari")

    employee1.hallo()
    employee2.hallo()
    employee3.hallo()
    employee4.hallo()
}