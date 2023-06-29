package ex5

fun main(){
    println("Digite um número:")
    Verifica().verificaONumero(readln().toInt())
}

class Verifica{
    fun verificaONumero(numero: Int){
        if(numero>0){
            println("O número $numero é positivo")
        }
        else if(numero == 0){
            println("O número $numero é neutro")
        }
        else{
            println("O número $numero é negativo")
        }
    }
}
