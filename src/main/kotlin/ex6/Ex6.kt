package ex6

fun main(){
    Tabuada().exibirTabuada()
}

class Tabuada{

    fun exibirTabuada(){
        println("   TABUADA   \n")

        for(i in 1..9){
            println("Tabuada do $i:")
            for (j in 0..10){
                println("$i x $j = ${i*j}")
            }
            println()
        }
    }
}