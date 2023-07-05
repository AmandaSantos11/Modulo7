package ex3

fun main(){
    Supermercado().receberQuantidadeDeProdutos()
}

class Supermercado{

    fun receberQuantidadeDeProdutos(){
        println("Digite quantos produtos você comprou:")
        val quantidade = readln().toInt()

        precoDosProdutos(quantidade)
    }

    fun precoDosProdutos(quantidade:Int){
        var vetorDeProduto = arrayOf<Double>()

        for (i in 1..quantidade){
            println("Digite o preço do $i produto:")
            vetorDeProduto = vetorDeProduto.plus(readln().toDouble())
        }

        informarPreco(vetorDeProduto)
    }

    fun informarPreco(vetorDeProduto:Array<Double>){
        println("O total a ser pago nas compras é: R$"+vetorDeProduto.sum())
    }
}