package ex8

fun main() {
    Fibonacci().exibirNumeroFibonacci(Fibonacci().receberNumero())
}

class Fibonacci{

    fun receberNumero():Int{
        println("Digite um número:")
        var numero = readln().toInt()
        return numero
    }

    fun exibirNumeroFibonacci(numero:Int){
        var elemento0=0
        var elemento1=1
        var fibonacci=0

        for(i in 1..numero){
            fibonacci = elemento0+elemento1
            elemento1 = elemento0
            elemento0 = fibonacci
        }

        println("Fib($numero) = $fibonacci")
    }
}
