package ex12

fun main(){
    LinhaDoTempo().linhaDoTempo()
}

class LinhaDoTempo{

    fun linhaDoTempo(){
        println("Digite o ano em que você nasceu:")
        var ano = readln().toInt()
        var idade = 0

        while (ano < 2024){
            println("Em $ano você tinha $idade anos!")
            ano++
            idade++
        }
    }
}