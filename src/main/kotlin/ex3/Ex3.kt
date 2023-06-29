package ex3

fun main(){
    println("Digite um número:")
    Verifica().verificaSeEMultiploDe5(readln().toInt())
}

class Verifica{
    fun verificaSeEMultiploDe5(numero:Int):Boolean{
        if(numero % 5 == 0){
            println("O número $numero é múltiplo de 5")
            return true
        }
        else{
            println("O número $numero não é múltiplo de 5")
            return false
        }
    }
}
