package ex10

fun main(){
    Numero().verificaSeOsNumerosSaoIguais()
}

class Numero{

    fun verificaSeOsNumerosSaoIguais(){
        println("Informe um número:")
        val numeroUm = readln().toInt()

        println("Informe outro número:")
        val numeroDois = readln().toInt()

        if (numeroUm==numeroDois){
            println("Os números digitados são iguais!")
        }
        else{
            println("Os números digitados não são iguais")
        }
    }
}