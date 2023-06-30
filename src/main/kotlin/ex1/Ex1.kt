package ex1

fun main(){
    Valores().somaDosValoresDoVetor(Valores().receberValor())
}

class Valores{

    fun receberValor():IntArray{
        var vetor = IntArray(5)
        for(posicao:Int in vetor.indices){
            println("Digite o "+(posicao+1)+ "º valor:")
            vetor[posicao] = readln().toInt()
        }
        return vetor
    }

    fun somaDosValoresDoVetor(vetor:IntArray){
        var resultado = vetor.sum()
        println("\nA soma dos números digitados é: $resultado")
    }
}