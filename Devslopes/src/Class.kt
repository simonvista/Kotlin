//  open for overriding
open class Vehicle(val make:String,val model:String){
    fun speed(){
        println("Speed")
    }
    fun brake(){
        println("Brake")
    }
    fun park(){
        println("Park")
    }
    //  open for overriding
    open fun config(){
        println("$make, $model")
    }
}
class Car(make:String,model:String,var color:String ) : Vehicle(make, model) {
    override fun config() {
        println("$make, $model, $color")
    }
}
class Truck(make: String,model: String,var towingCapacity:Int):Vehicle(make,model){
    override fun config() {
        println("$make, $model, $towingCapacity")
    }
}
/*class Car (val make: String, val model: String){
    fun speed(): Unit {
        println("Car is speeding")
    }
    fun config(){
        println("${make}, ${model}")
    }
}
*//*class Car constructor(make:String,model:String) {
    val make=make
    val model=model
}*//*
class Truck(val make: String, val model: String, val towingCapacity: Int){
    fun tow(): Unit {
        println("Truck has towing capacity of ${towingCapacity}")
    }
    fun config(){
        println("${make}, ${model}, ${towingCapacity}")
    }
}*/
fun main(args:Array<String>) {
    val car1=Car("Tesla","Model-3","Red")
    val truck1=Truck("Ford","F-250",10000)
    car1.config()
    truck1.config()
/*    val car=Car("Toyota","Corolla")
    println(car.make+", "+car.model)
    car.speed()
    car.config()
    val truck=Truck("Ford","F-250",10000)
    truck.tow()
    truck.config()*/
//    val car=CarDemo("a","b")
}