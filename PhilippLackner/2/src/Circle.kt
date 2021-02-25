import kotlin.random.Random

class Circle(val r:Double) : Shape("Circle") {
//    private val pi=3.1415926
    //  Secondary constructor - overload constructor
    constructor(d:Float):this(d/2.0)

//    Companion Obj -> belongs to local class. Unlike object is used globally
    companion object{
        fun randomCircle(): Circle {
            val radius=Random.nextDouble(1.0,10.0)
            return Circle(radius)
        }
    }

    init {
        println("Circle with name=$name r=$r is created")
        println("Area with name=$name =${area()}")
        println("Perimeter with name=$name =${perimeter()}")
    }
    override fun area()=ImportantNumbers.PI*r*r
//    override fun area()=pi*r*r
    override fun perimeter()=2*ImportantNumbers.PI*r
//    override fun perimeter()=2*pi*r
}

