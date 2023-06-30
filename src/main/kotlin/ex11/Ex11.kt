package ex11

fun main(){
    Media().receberEExibirMedia()
}

class Media{

    fun receberEExibirMedia(){
        var numeros = arrayOf<Int>()

        for(i in 0..14){
            println("Digite o "+(i+1)+"º número:")
            numeros = numeros.plus(readln().toInt())
        }

        var media = numeros.sum()/numeros.size
        println("A média dos números digitados é: $media")
    }
}