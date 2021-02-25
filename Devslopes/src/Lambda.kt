fun main(args:Array<String>) {
//    Lambda expression
    val printMsg={msg:String->println(msg)}
    /*fun printMsg (msg: String): Unit {
        println(msg)
    }*/
    printMsg("Hi")
    val sumTwo={x:Int,y:Int->x+y}
//    val sumTwo:(Int,Int)->Int={x,y->x+y}
    println(sumTwo(2,6))
    val hi={println("Hello Lambda")}
    hi()
//    No parameter in completion function
    fun downloadData(url:String,completion:()->Unit){
//     Send download request, got data successfully, call completion function
        completion()
    }
    downloadData("fakeUrl.com", {
        println("Download is done")
    } )
//    One parameter in completion function
    fun downloadCarData(url:String,completion:(Car)->Unit){
//    Send download car request, got data sucessfully, call completion function
        val car=Car("Toyota","Corolla","Black")
        completion(car)
    }
    downloadCarData("fakeUrl.com"){
//        Only one parameter, use it
        it.config()
//        car ->  car.config()
    }
//  Two parameters in completion function
    fun downloadTruckData(url:String,completion:(Truck?,Boolean)->Unit){
//       Send download request, got data successfully, call completion function
        val webReqSuccess:Boolean=false;
        if (webReqSuccess){
            val truck=Truck("Ford","F-250",10000)
            completion(truck,true)
        }else{
            completion(null,false)
        }

    }
    downloadTruckData("fakeUrl.com"){
        truck, success ->if(success) truck?.config() else println("No truck data available")
    }
}