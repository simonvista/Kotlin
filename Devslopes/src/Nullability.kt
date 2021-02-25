fun main(args:Array<String>) {
    var nullableName: String? =null
    nullableName="A sunny day"
//  Null check
    var len=if(nullableName!=null) nullableName.length else -1
    println(len)
//    Safe call operator
    println(nullableName?.length )
//    Elvis operator
    len=nullableName?.length ?: -1
    println(len)
    val noName=nullableName ?: "Null"
    println(noName)
//    !! operator
    println(nullableName!!.length)
    println(nullableName.indexOf("A"))
}