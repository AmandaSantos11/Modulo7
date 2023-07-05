package ex2

fun main(){
    Vetor().adicionarNumeroNoArray()
}

class Vetor{

    fun adicionarNumeroNoArray(){
        var vetorDeNumeros = IntArray(10)
        println("Digite um número:")
        vetorDeNumeros[0] = readln().toInt()

        for (i in 1 until vetorDeNumeros.size){
            vetorDeNumeros[i] = vetorDeNumeros[i-1]*2
        }

        for (numeros in vetorDeNumeros){
            print("$numeros ")
        }
    }
}