package ex1

fun main(){
    Numeros().somaDosNumeros(Numeros().receberNumero())
}

class Numeros{

    fun receberNumero():Int{
        println("Digite um número:")
        val numeroDoUsuario = readln().toInt()
        return numeroDoUsuario
    }

    fun somaDosNumeros(numeroDoUsuario:Int){
        var resultado=0

        for (i in 1..numeroDoUsuario){
            resultado += i
        }
        println("A soma dos números de 1 até $numeroDoUsuario é: $resultado")
    }
}