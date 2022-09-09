fun main(){
    //Immutable list
    var names = listOf("vishal","namrata","asim")
    println(names[1])

    //Mutale List
    var names1 = mutableListOf("a","b","c")
    /*
    explicitly declaring the type of the list
    var names1 = mutableListOf<String>("a","b","c")
    */
    names1.add("d")
    names1.add(80)
    // println(names1)

    //Array
    val arr = arrayOf(1,2,3,4,5)
    for(ar in arr){
        println(ar)
    }
}