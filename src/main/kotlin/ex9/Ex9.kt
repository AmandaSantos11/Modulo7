package ex9

fun main(){
    Empresa().receberQuantidadeDeFuncionarios()
}

class Empresa{

    fun receberQuantidadeDeFuncionarios(){
        println("Digite quantos funcionários você têm:")
        val quantidade= readln().toInt()

        receberInformacoes(quantidade)
    }

    fun receberInformacoes(quantidade:Int){
        var nomeFuncionario:String
        var tempoDeCasa=0
        var ferias=0
        var naoTemFerias=0
        for (i in 1..quantidade){
            println("Digite o nome do ${i}º funcionário:")
            nomeFuncionario = readln()

            println("Digite quanto tempo de serviço em meses ele têm:")
            tempoDeCasa = readln().toInt()

            if (tempoDeCasa>12){
                println("$nomeFuncionario têm direito a férias!")
                ferias++
            }
            else{
                println("$nomeFuncionario não têm direito a férias")
                naoTemFerias++
            }
        }
        exibirFerias(ferias,naoTemFerias)
    }

    fun exibirFerias(ferias:Int,naoTemFerias:Int){
        println("\nTêm direito a férias: $ferias funcionário(s) \nNão têm direito a férias: $naoTemFerias funcionário(s)")
    }
}