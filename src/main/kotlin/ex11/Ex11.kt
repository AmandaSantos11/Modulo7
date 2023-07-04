package ex11

fun main(){
    VendaDeProduto().receberInformacao()
}

class VendaDeProduto(){

    fun receberInformacao(){
        println("Digite o preço de custo do produto:")
        val precoDeCusto = readln().toDouble()

        println("Informe o percentual do produto:")
        val percentual = readln().toDouble()

        exibirPreco(precoDeCusto, percentual)
    }

    fun exibirPreco(precoDeCusto:Double, percentual:Double){
        println("==========")
        println("Preço de custo do produto: $precoDeCusto")
        println("Percentual: $percentual")
        val valorDeVenda = precoDeCusto + (precoDeCusto * (percentual/100))
        println("O valor de venda: R$%.2f".format(valorDeVenda))
    }
}