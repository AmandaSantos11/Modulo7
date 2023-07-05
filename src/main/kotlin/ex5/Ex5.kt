package ex5

fun main(){
   Saudacao().receberNome()
}

class Saudacao{

    fun receberNome(){
        println("Digite seu nome:")
        val nome = readln()

        println(saudacao(nome))
    }

    fun saudacao(nome:String):String{
        return "Bem-Vindo(a) $nome ao nosso hotel!"
    }
}