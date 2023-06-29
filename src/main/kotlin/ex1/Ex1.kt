package ex1

fun main(){
    println("O antecessor do número é : "+Antecessor().verificaAntecessor(5))
}

class Antecessor{
    fun verificaAntecessor(numeroInteiro : Int) : Int{
        return numeroInteiro-1
}
}

