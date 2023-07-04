package ex10

fun main(){
    Converter().receberInformacao()
}

class Converter{

    fun receberInformacao(){
        println("Digite a cotação atual do dólar:")
        val cotacao = readln().toDouble()

        println("Deseja converter quantos dólares:")
        val valorQueSeraConvertido = readln().toDouble()

        converter(cotacao, valorQueSeraConvertido)
    }

    fun converter(cotacao:Double, valorQueSeraConvertido:Double){
        println("==========")
        println("Cotação do dólar: $cotacao")
        println("Valor que será convertido: $valorQueSeraConvertido")
        println("O valor convertido para reais é: R$%.2f".format(valorQueSeraConvertido/cotacao))
    }
}