package ex7

fun main(){
    Escola().receberQuantidadeDeTurmas()
}

class Escola{

    fun receberQuantidadeDeTurmas(){
        println("Digite quantas turmas têm na escola:")
        val quantidadeDeTurma = readln().toInt()

        receberNota(quantidadeDeTurma)
    }

    fun receberNota(quantidadeDeTurma:Int){
        var quantidadeDeAlunos:Int
        var media=0

        for (i in 1..quantidadeDeTurma){
            println("Quantos alunos tem na ${i}º turma:")
            quantidadeDeAlunos = readln().toInt()

            for (aluno in 1..quantidadeDeAlunos){
                println("Digite a media do aluno ${aluno}º:")
                media += readln().toInt()
            }

            val mediaTurma = (media / quantidadeDeAlunos)
            println("Turma: $i\nMedia: $mediaTurma")
            println()
        }
    }
}