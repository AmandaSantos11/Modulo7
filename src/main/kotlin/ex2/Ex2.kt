package ex2

fun main(){
    Nome().exibirNome(Nome().receberNomeDoUsuario())
}

class Nome{

    fun receberNomeDoUsuario():String{
        println("Digite seu nome:")
        val nomeDoUsuario = readln()
        return nomeDoUsuario
    }

    fun exibirNome(nomeDoUsuario:String){
        println("Meu nome é $nomeDoUsuario")
    }
}