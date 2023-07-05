package ex4

fun main(){
    Loja().receberQuantidadeDeAnimais()
}

class Loja{

    fun receberQuantidadeDeAnimais(){
        println("Digite quantos animais têm na loja:")
        val quantidade = readln().toInt()

        tipoDeAnimal(quantidade)
    }

    fun tipoDeAnimal(quantidade:Int){
        var gato=0
        var cachorro=0

        for (i in 1..quantidade){
            println("O $i animal é:\n1-Gato | 2-Cachorro")
            when(readln().toInt()){
                1 -> gato++
                2 -> cachorro++
                else -> {println("Opção inválida")}
            }
        }
        exibirQuantidade(gato,cachorro)
    }

    fun exibirQuantidade(gato:Int,cachorro:Int){
        println("===========\nEm nossa loja temos:\n$gato Gatos\n$cachorro Cachorros")
    }
}