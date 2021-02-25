fun main(args:Array<String>) {
    fun f1(){
        println("Hello World")
    }
    f1()
    fun f2(sentence:String="Cyan Sky"){
        println(sentence)
    }
    f2()
    f2("A joke")
    fun goodGuySum(g1:Int,g2:Int): Int {
        return g1+g2
    }
    println("Total good guy sum is ${goodGuySum(2,33)}")
}