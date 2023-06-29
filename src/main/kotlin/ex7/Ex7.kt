package ex7

fun main(){
    println("Digite a base do seu retângulo:")
    var base = readln().toDouble()
    println("Digite a altura:")
    var altura = readln().toDouble()
    Calculo().calculoDaAreaDoRetangulo(base,altura)
}

class Calculo{
    fun calculoDaAreaDoRetangulo(base:Double,altura:Double){
        println("A área do retângulo é: "+(base*altura))
    }
}
