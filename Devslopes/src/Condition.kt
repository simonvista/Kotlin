fun main(args:Array<String>) {
    val a=2
    val b=3
//    &&, ||
    if(a>b){
        println("a is greater than b")
    }else if (a<b){
        println("a is less than b")
    }else{
        println("a is equal to b")
    }
    val isHungry=false
    val isBored=false
    if(isHungry || !isBored ){
        println("Not good")
    }else if(isHungry && !isBored){
        println("Too bad")
    }
//    Switch
    val x=1
    when (x){
        1->println("x==1")
        2->println("x==2")
        else->println("x is not 1 or 2")
    }
}