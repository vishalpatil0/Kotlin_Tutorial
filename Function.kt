fun show(name:Int){
    println("showing something here $name")
}
fun sum(num1 : Int, num2: Int) : Int {
    return num1+num2
}
fun operation(a : Int, b : Int, opearate : (Int,Int)-> Int): Int{
    return opearate(a,b)
}
fun main(){
    show(123)
    println(sum(2,3))
    var output = operation(2,4, {a,b->
        println("Adding these two numbers")
        a+b
    })
    println(output)
}