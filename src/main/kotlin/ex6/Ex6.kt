package ex6

fun main(){
    MenorNumero().receberQuantidade()
}

class MenorNumero{

    fun receberQuantidade(){
        println("Digite quantos números deseja adicionar:")
        val quantidade = readln().toInt()
        exibirMenorNumero(quantidade)
    }

    fun exibirMenorNumero(quantidade:Int){
        var vetor = arrayOf<Int>()

        for(i in 1..quantidade){
            println("Digite o $i número:")
            vetor = vetor.plus(readln().toInt())
        }

        println("O menor número que foi digitado é o: ${vetor.min()}")
    }
}