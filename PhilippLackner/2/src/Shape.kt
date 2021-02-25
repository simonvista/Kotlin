abstract class Shape(var name:String) {
    constructor(name:String,vararg dimensions:Double):this(name)
    init {
        println("I'm super class")
    }
    abstract fun area(): Double
    abstract fun perimeter(): Double
    fun changeName(name:String){
        this.name=name
    }
}
//  protected means only accessible in the same class and child class
/*
open class Shape(var name:String) {
    init {
        println("I'm super class")
    }
    fun changeName(name:String){
        this.name=name
    }
}*/
