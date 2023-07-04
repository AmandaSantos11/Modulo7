package ex4

fun main(){
    Retangulo().receberInformacoesDoUsuario()
}

class Retangulo{

    fun receberInformacoesDoUsuario(){
        println("Digite a base do retângulo:")
        val base = readln().toDouble()

        println("Digite a altura do retângulo:")
        val altura = readln().toDouble()

        calculoDaAreaDoRetangulo(base, altura)
    }

    fun calculoDaAreaDoRetangulo(base:Double,altura:Double){
        val areaDoRetangulo = base*altura
        println("A área do retângulo é: $areaDoRetangulo")
    }
}