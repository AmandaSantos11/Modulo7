package ex3

fun main(){
    Imc().receberInformacoes()
}

class Imc{

    fun receberInformacoes(){
        println("Digite seu peso:")
        val pesoDoUsuario = readln().toDouble()

        println("Digite sua altura:")
        val alturaDoUsuario = readln().toDouble()

        calcularIMC(pesoDoUsuario,alturaDoUsuario)
    }

    fun calcularIMC(pesoDoUsuario:Double,alturaDoUsuario:Double){
        val imc = pesoDoUsuario/(alturaDoUsuario*alturaDoUsuario)

        when{
            imc < 18.5 -> println("Classificação: Magreza")
            imc in 18.5 .. 24.9 -> println("Classificação: Normal")
            imc in 25.0 ..29.9 -> println("Classificação: Sobrepeso")
            imc in 30.0 ..39.9 -> println("Classificação: Obesidade")
            imc > 40.0 -> println("Classificação: Obesidade Grave")
            else -> {
                println("Impossível calcular Imc")
            }
        }
    }
}