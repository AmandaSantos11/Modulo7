package ex10

fun main(){
    println("Digite um número:")
    Verifica().verificaSucessorDoNumero(readln().toInt())
}

class Verifica{
    fun verificaSucessorDoNumero(numero:Int){
        println("O sucessor do número $numero é "+(numero+1))
    }
}
