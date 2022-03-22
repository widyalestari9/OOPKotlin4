package data

interface Interaction {
    val name: String
    fun sayHello(name: String)  {
        println("Hello $name, my name is ${this.name}")
    }
}
interface Go : Interaction{
    fun go(){
        println("Go!")
    }
}

interface moveA{
    fun move() = println("moveA")
}
interface moveB{
    fun move() = println("moveB")
}

class Human(override val name:String): Go, moveA, moveB{
    override fun move(){
        super<moveA>.move()
        super<moveB>.move()
        println("move Human ")
    }
}