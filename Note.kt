package data

import java.lang.reflect.Array.get

class Note(title: String) {

    var title: String = title
    get() {
        println("Call Getter function")
        return field
    }
    set(value){
        println("Call Getter function")
        if (value.isNotBlank()){
            field = value
        }else{
            println("Invalid title")
        }
    }
}

class BigNote(val title: String){
    val bigTitle: String
        get() = title.toUpperCase()

}