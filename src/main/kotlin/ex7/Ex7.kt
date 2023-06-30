package ex7

fun main(){
    SalaDeAula().exibirMediaDaTurma(SalaDeAula().receberNotaDosAlunos(SalaDeAula().receberQntdDeAlunos()))
}

class SalaDeAula{

    fun receberQntdDeAlunos():Int{
        println("Digite quantos alunos tem na sua sala:")
        val qntdAluno= readln().toInt()
        return qntdAluno
    }

    fun receberNotaDosAlunos(qntdAluno:Int):Array<Int>{
        var listaDeNotas = arrayOf<Int>()
        var contador=0

        while (contador<qntdAluno){
            println("Digite a nota do "+(contador+1)+"º aluno:")
            listaDeNotas=listaDeNotas.plus(readln().toInt())
            contador++
        }
        return listaDeNotas
    }

    fun exibirMediaDaTurma(listaDeNotas:Array<Int>){
        var resultado = listaDeNotas.sum()/listaDeNotas.size
        println("A nota média da turma é: $resultado")
    }
}