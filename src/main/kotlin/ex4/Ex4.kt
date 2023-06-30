package ex4

fun main(){
    Numeros().exibirNumerosPares(Numeros().receberNumero())
}

class Numeros{

    fun receberNumero():IntArray{
        var vetor = IntArray(10)
        for(posicao:Int in vetor.indices){
            println("Digite o "+(posicao+1)+ "º número:")
            vetor[posicao] = readln().toInt()
        }
        return vetor
    }

    fun exibirNumerosPares(vetor: IntArray){
        println("\nOs números pares são: ")
        for(numero: Int in vetor){
            if(numero % 2==0){
                print("$numero , ")
            }
        }
    }
}