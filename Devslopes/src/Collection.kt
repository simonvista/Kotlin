fun main(args:Array<String>) {
//    Immutable list
    /*val imperials= listOf("King","Queen","Prince","Princess")
    println(imperials)
    println(imperials.sorted())
    println(imperials.last())
    println(imperials.contains("King"))*/
//    Mutable arrayList
    /*val students= arrayListOf("Mike","Joe","Jane")
    println(students.size)
    students.add("Karma")
    students.add(0,"Bill")*/
//    Index starts from 1
    /*println(students.indexOf("Jane"))
    students.remove("Bill")
    students.forEach { s-> println(s) }*/
//  Immutable  Map
    /*val employees= mapOf("Mike" to "engineer","Janney" to "secretary","Bill" to "boss")
    println(employees)
    println(employees["Mike"])
    println(employees.get("Mike"))
    println(employees.getOrDefault("Susin","Not found"))
    println(employees.keys)
    println(employees.values)*/
//    Mutable hashMap
    val emps= hashMapOf<String,String>("Mike" to "engineer","Janney" to "secretary","Bill" to "boss")
    println(emps)
    emps["Mike"]="senior"
    emps["Joe"]="assistant"
    emps.put("Hellen","janitor")
    println(emps)
    emps.remove("Hellen")
    println(emps)
    emps.clear()
    println(emps)
}