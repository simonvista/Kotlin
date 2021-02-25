//  Any in Kotlin means non-nullable types
class CustomTriple <A:Any,B:Any,C:Any>(
    var first:A,var second:B,var third:C
) {
    fun printTypes(): Unit {
        println("Types list:${first::class}, ${second::class}, ${third::class}")
    }
}