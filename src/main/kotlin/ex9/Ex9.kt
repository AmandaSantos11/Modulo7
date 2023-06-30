package ex9

fun main(){
    println("Digite um número:")
    val numero1 = readln().toInt()

    println("Digite outro número:")
    val numero2 = readln().toInt()

    Calculadora().menu(numero1,numero2)
}

class Calculadora{

    fun menu(numero1:Int, numero2:Int){
        println("Escolha uma operação: \n1-Somar | 2-Subtrair | 3-Multiplicar | 4-Dividir")
        when(readln().toInt()){
            1 -> somar(numero1,numero2)
            2 -> subtrair(numero1,numero2)
            3 -> multiplicar(numero1,numero2)
            4 -> divisao(numero1,numero2)
            else -> {
                println("Opção inválida")
            }
        }
    }

    fun somar(numero1:Int, numero2:Int){
        val soma= numero1+numero2
        println("A soma dos dois números é: $soma")
    }

    fun subtrair(numero1:Int, numero2:Int){
        val subtrair= numero1-numero2
        println("A subtração dos dois números é: $subtrair")
    }

    fun multiplicar(numero1:Int, numero2:Int){
        val multiplicar= numero1*numero2
        println("A subtração dos dois números é: $multiplicar")
    }

    fun divisao(numero1:Int, numero2:Int){
        val divisao= numero1/numero2
        println("A subtração dos dois números é: $divisao")
    }
}