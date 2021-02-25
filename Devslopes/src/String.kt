fun main(args:Array<String>) {
    var str="May\r the\b \t force be \n with \"(Joke)\" you."
    println(str)
//    Multi-line print
    val rawCrawl=
        """|A long time ago,
        |in galaxy
        |far, far, away...
        |Bumm Bumm Bumm""".trimMargin()
    println(rawCrawl)
    /*for (char in str){
        println(char)
    }*/
    str="Hello World"
    println(str.contentEquals("Hello World"))
    println(str.contains("llo w",false))
    println(str.toUpperCase())
    println(str.subSequence(2,7))
    val luke="Luke Skywalker"
//    String template
    println("Hello $luke with ${luke.length}")

}