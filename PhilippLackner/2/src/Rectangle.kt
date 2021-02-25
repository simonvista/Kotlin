class Rectangle(val a:Double,val b:Double) : Shape("Rectangle"){
//    Secondary constructor - overload constructor
//    Square
    constructor(a:Double) : this(a,a)
//    Rectangle converts int to double(primary constructor)
    constructor(a:Int,b:Int) : this(a.toDouble(),b.toDouble())
    init {
        println("Rectangle with name=$name a=$a, b=$b, was created")
        println("$name area=${area()}")
        println("$name perimeter=${perimeter()}")
        println("$name isSquare=${isSquare()}")
    }

    override fun area()=a*b
    override fun perimeter()=2*(a+b)
    fun isSquare()=a==b
}