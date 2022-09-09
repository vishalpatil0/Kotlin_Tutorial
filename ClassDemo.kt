fun main(){
    var P1 = Person("vishal")
    println(P1.name)
}
class Person(_name : String){
    val name : String
    init{
        name = _name
    }
}