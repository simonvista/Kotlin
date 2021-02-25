fun main(args:Array<String>) {
    val emps= arrayListOf<String>("Miller","Bob","Jene","Susin")
    val students= hashMapOf("Miller" to "associate","Jane" to "secretary","Ann" to "boss")
    for(emp in emps){
        println(emp)
    }
    for ((k,v) in students){
        println("$k is a $v")
    }
    var x=10
    while(x>5){
        println(x)
        x--
    }
}