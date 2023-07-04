package ex8

fun main(){
    Media().receberQuantidadeDeAlunos()
}

class Media{

    fun receberQuantidadeDeAlunos(){
        println("Deseja digitar a nota de quantos alunos:")
        val quantidade = readln().toInt()

        receberNomeNotaDosAlunos(quantidade)
    }

    fun receberNomeNotaDosAlunos(quantidade:Int){
        var nomeDosAlunos = arrayOf<String>()
        var notaDosAlunos = arrayOf<Double>()

        for (i in 1..quantidade){
            println("Digite o nome do $i aluno(a):")
            nomeDosAlunos = nomeDosAlunos.plus(readln())

            println("Digite a 1º nota:")
            val notaUm = readln().toDouble()

            println("Digite a 2º nota:")
            val notaDois = readln().toDouble()

            println("Digite a 3º nota:")
            val notaTres = readln().toDouble()

            val media = (notaUm+notaDois+notaTres)/3
            notaDosAlunos = notaDosAlunos.plus(media)
        }
        exibirNotaNome(nomeDosAlunos, notaDosAlunos)
    }

    fun exibirNotaNome(nomeDosAlunos:Array<String>, notaDosAlunos:Array<Double>){
        var posicao=0
        println("----------------")
        for (nome in nomeDosAlunos){
            println("Nome do aluno(a): $nome \nMédia: ${notaDosAlunos[posicao]}\n")
            posicao++
        }
    }
}