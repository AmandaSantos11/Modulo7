package ex3

fun main(){
    Mensagem().exibirMensagem()
}

class Mensagem{

    fun exibirMensagem(){
        val mensagem = "Eu gosto de estudar Algoritmos!"
        var contador = 0
        while (contador < 20){
            println(mensagem +" "+contador)
            contador++
        }
    }
}