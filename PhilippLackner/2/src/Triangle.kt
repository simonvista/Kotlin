import kotlin.math.sqrt

class Triangle(val a:Double, val b:Double, val c:Double) : Shape("Triangle") {
    init {
        println("Triangle with name=$name a=$a, b=$b, c=$c, was created")
        println("Area with name=$name= ${area()}")
        println("Peremeter with name=$name= ${perimeter()}")
    }
    override fun perimeter()=a+b+c
    val halfPerm=perimeter()/2
    override fun area()= sqrt(halfPerm*(halfPerm-a)*(halfPerm-b)*(halfPerm-c))

}