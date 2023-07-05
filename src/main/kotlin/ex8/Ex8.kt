package ex8

fun main(){
    Nome().receberNome()
}

class Nome{

    fun receberNome(){
        println("Digite seu nome completo:")
        val nome = readln()

        exibirNome(nome)
    }

    fun exibirNome(nome:String){
        var nomeQuebrado = nome.split(" ")
        for (nome in nomeQuebrado){
            println(nome)
        }
    }
}