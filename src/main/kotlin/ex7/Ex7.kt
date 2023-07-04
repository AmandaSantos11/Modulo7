package ex7

fun main(){
    Sistema().receberInformacao()
}

class Sistema{

    fun receberInformacao(){
        println("Digite seu nome:")
        val nome = readln()

        println("Digite o seu salário:")
        val salarioFixo = readln().toDouble()

        println("Digite o total de vendas em dinheiro:")
        val vendas = readln().toDouble()

        exibirInformacoes(nome, salarioFixo, vendas)
    }

    fun exibirInformacoes(nome:String, salarioFixo:Double, vendas:Double){
        println("===============")
        println("Nome do vendedor: $nome")
        println("Salário fixo: $salarioFixo")
        println("Salário a receber no fim do mês: ${(vendas*0.15)+salarioFixo}")
    }
}