package ex2

fun main(){
    println("Digite um número entre 1 e 7:")
    Dia().diaDaSemana(readln().toInt())
}

class Dia{

    fun diaDaSemana(dia:Int){
        when(dia){
            1 -> println("Segunda-Feira")
            2 -> println("Terça-Feira")
            3 -> println("Quarta-Feira")
            4 -> println("Quinta-Feira")
            5 -> println("Sexta-Feira")
            6 -> println("Sábado")
            7 -> println("Domingo")
            else -> {println("Digite apenas números que estão entre 1 e 7")}
        }

    }
}