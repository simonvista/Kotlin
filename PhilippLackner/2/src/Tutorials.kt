fun main(): Unit {
    /*println("Hello World")
    var myVariable = 5
    myVariable=1
    println(myVariable)
    println("$myVariable")
//    val variable can't be reassigned
    val myFixed =2
    var a=3
    var b=8
    println("a/b= ${a/b}")
    var a1=2.3f
    println(a1/b)
    println(false||true&&false)
    println(false&&true||false&&(false||true))
    val x=1
    val y=2
    val z=if(x==y) 3 else 0
    println(z)
    val s1="racecar"
    val palindrome=if(s1==s1.reversed()) true else false
    println(palindrome)*/
//    User input
    /*println(3 is kotlin.Number)
    val userInput= readLine()
    println(userInput?.toUpperCase())
    if (userInput != null) {
        println(userInput.toInt()==5)
    }*/
//    println("Your input is: $userInput")
//    val arr= arrayOf(3,2,6,1.19,"Hi")
    /*val arr= arrayOf("Hello","Kotlin")
    println(arr.size)
    for (x in arr ) println(x)
    arr.map { x->println(x) }*/
    /*for (i in 1..5) println(i)
    for (i in 10 downTo 5 step 2) println(i)
    for (i in 'a'..'d' step 2) println(i)*/
//    list element can't be reassigned
    /*val arr= arrayOf(1,2,3)
    arr[0]=2
    val list= listOf(1,2,3)*/
//    array member can be assigned
    /*val list1= mutableListOf(1,2,3)
    list1[0]=4
    list1.remove(2)
    list1.add(0,5)
    println(list1)*/
    /*val list= mutableListOf<Int>()
    for (i in 1..5){
        var x= readLine()?.toInt()
        if (x != null) {
            list.add(x)
        }
    }
    println(list)*/
    /*val list= mutableListOf(0,1)
    var len=list.size
    println("Enter a number >2")
    val x= readLine()?.toInt()
    while (len< x!!){
        list.add(list[len-1]+list[len-2])
        len++
    }
    println(list)*/
    /*val age= readLine()?.toInt()
    when(age){
        0,1->println("You're baby")
        in 2..5->println("You're toddler")
        in 6..9->println("You're child")
        in 10..20->println("You're student")
        else->println("You're adult")
    }*/
//    if(age in 0..5) println("You're toddler")
//    println(addTwo(2,6))
    /*val arr= arrayOf(1,2,3,4,5)
    for (i in 1..arr.size){
        if (arr[i-1]==1){
            println(i-1)
            break
        }
    }*/
    /*println(sum(1,2,3))
    println(sum(1,2,3,4))
    val arr= intArrayOf(1,2,3,4)
    println(sum(1,2,3,*arr,4))*/
    /*say(3)
    say(y=5,x=7)*/
//  Extension function
    /*var x=sqrt(5.0).toInt()
    println(x)*/
    /*println("Enter an integer")
    val input= readLine()?.toInt()
    if(input!=null){
        println(input.isPrime())
    }*/
    /*val r=Rectangle(2.2,3.3)
    println(r.area())
    println(r.perimeter())
    println(r.isSquare())
    val c=Circle(5.0)
    println(c.area())
    println(c.perimeter())*/
    /*val t=Triangle(1.0,2.0,3.0)
    t.changeName("New Triangle")
    println(t.name)
    val c=Circle(2.0)
    val r=Rectangle(2.0,3.0)
    val r1=Rectangle(2.0)
    val r2=Rectangle(1,2)*/
    /*val r=Rectangle(5.0)
    val c=Circle(6f)
    val t=Triangle(7.0,7.0,7.0)
    println("max of rectangle and circle is ${maxArea(r,c)}")
    println("max of rectangle, triangle and circle is ${maxArea(r,t,c)}")*/
//    companion object
//    val c=Circle.randomCircle()
//    Annonymous class
    /*val a=3.0
    val b=4.0
    val height=2.0
    val parallelogram= object : Shape("parallelogram",a,b,height) {
        override fun area(): Double {
            return a*height
        }

        override fun perimeter(): Double {
            return 2*(a+b)
        }
        fun isRectangle(): Boolean {
            return b==height
        }

    }
    println(parallelogram.area())
    println(parallelogram.perimeter())
    println("Is a rectangle: ${parallelogram.isRectangle()}")*/
//    Exception
    /*val input= try {
        readLine()?.toInt()
    }catch (e:NumberFormatException){
//    }catch (e:Exception){
        -1
    }finally {
        println("Final block")
    }
    when(input){
        -1->println("You didn't enter integer")
        else->println("You entered $input")
    }*/
    /*println(divide(51.0,2.0))
    val res=try {
        divide(1.0,0.0)
    }catch (e:DivisorIsZeroException){
        0.0
    }
    println(res)*/
//    Lambda function
    var list=(1..10).toList()
    println(list)
//    it: current number
    list=list.filter { it%2==0 }
    println(list)
    val c1=Circle(5.0)
    val c2=Circle(3.5)
    val t1=Triangle(4.0,4.0,4.0)
    val t2=Triangle(3.0,3.0,3.0)
    val r1=Rectangle(6.0)
    val r2=Rectangle(4.0,3.0)
//    Generic
    var ints=(1..10).toList().customFilter { it%2==0 }
//    Generic class
    var triple=Triple(3,"Hi",true)
    var customTriple=CustomTriple<Int,Double,String>(3,3.3,"Kotlin")
    customTriple.printTypes()

    println(ints)
    var shapes= listOf(c1,c2,t1,t2,r1,r2)
    shapes=shapes.filter { it.area()>20.0 }.sortedBy { it.area() }
    shapes.map { println("Name: ${it.name}, area: ${it.area()}") }
//    Custom filter function
    shapes=shapes.customFilter { it.area()>20.0 }.sortedBy { it.area() }
    shapes.map { println("Name: ${it.name}, area: ${it.area()}") }
}
//fun addTwo(x:Int,y:Int)=x+y
/*
fun addTwo(x: Int, y: Int): Int {
    return x+y
}*/
/*
fun sum(x: List<Int>): Int {
    var sum=0
    for (i in x) sum+=i
    return sum
}*/
/*fun sum(vararg x: Int): Int {
    var sum=0
    for (i in x) sum+=i
    return sum
}*/
/*fun say(x: Int, y: Int=3): Unit {
    println(x+y)
}*/
//  Extension function
/*
fun Int.isPrime():Boolean{
    for(i in 2..this-1){
        if(this%i==0) return false
    }
    return  true
}
*/
/*fun maxArea(s1: Shape, s2: Shape): Double {
    val a1=s1.area()
    val a2=s2.area()
    return if(a1>a2) a1 else a2
}
fun maxArea(s1: Shape, s2: Shape, s3: Shape): Double {
    var max2=maxArea(s1,s2)
    val a3=s3.area()
    return max(max2,a3)
}*/
/*
class DivisorIsZeroException : Exception("Divisor can't be zero!")
fun divide(x: Double, y: Double): Double {
    if(y==0.0){
        throw DivisorIsZeroException()
    }
    return x/y
}*/
//  Turn customfilter to Generic
fun <T> List<T>.customFilter(filterFunction:(T)->(Boolean)):List<T>{
    val resultList= mutableListOf<T>()
    for (item in this){
        if (filterFunction(item)){
            resultList.add(item)
        }
    }
    return resultList
}

//  Turn customfilter to Generic, only number
/*fun <T:Number> List<T>.customFilter(filterFunction:(T)->(Boolean)):List<T>{
    val resultList= mutableListOf<T>()
    for (item in this){
        if (filterFunction(item)){
            resultList.add(item)
        }
    }
    return resultList
}*/

//  Extension function
/*
fun List<Shape>.customFilter(filterFunction:(Shape)->(Boolean)):List<Shape>{
    val resultList= mutableListOf<Shape>()
    for (shape in this){
        if (filterFunction(shape)){
            resultList.add(shape)
        }
    }
    return resultList
}*/
