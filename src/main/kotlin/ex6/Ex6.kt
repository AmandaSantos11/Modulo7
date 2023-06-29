package ex6

fun main(){
    println("Digite quantos dólar você quer converter: ")
    Converter().converter(readln().toDouble())
}

class Converter{
    fun converter(dolar:Double){
        println("Valor digitado: $dolar\nCotação atual: 4.86")
        println("Valor convertido em real: R$ "+(dolar*4.86))
    }
}
