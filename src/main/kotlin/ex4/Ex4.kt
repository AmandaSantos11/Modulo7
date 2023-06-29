package ex4

fun main(){
    println("Digite a temperatura atual: ")
    Verifica().verificaATemperatura(readln().toDouble())
}

class Verifica{
    fun verificaATemperatura(temperatura:Double){
        when {
            temperatura <= 18 -> println("O clima está frio")
            temperatura >= 19 && temperatura <=23 -> println("O clima está agradável")
            temperatura >= 24 && temperatura<=35 -> println("O clima está quente")
            temperatura > 35 -> println("O clima está muito quente")
            else -> { println("Temperatura não identificada") }
        }
    }
}

