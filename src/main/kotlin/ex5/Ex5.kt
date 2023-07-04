package ex5

fun main(){
    Numero().receberNumeros()
}

class Numero{

    fun receberNumeros(){
        println("Digite o 1º número:")
        val numeroUm = readln().toDouble()
        println("Digite o 2º número:")
        val numeroDois = readln().toDouble()
        exibirContas(numeroUm, numeroDois)
    }

    fun exibirContas(numeroUm:Double, numeroDois: Double){
        println("============")
        println("A soma dos dois números é: ${numeroUm+numeroDois}")
        println("A subtração dos dois números é: ${numeroUm-numeroDois}")
        println("A multiplicação dos dois números é: ${numeroUm*numeroDois}")
        println("A divisão dos dois números é: ${numeroUm/numeroDois}")
    }
}