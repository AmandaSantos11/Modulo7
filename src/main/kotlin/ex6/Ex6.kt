package ex6

fun main(){
    Musica().banda()
}

class Musica{

    fun banda(){
        println("Digite o nome da banda:")
        var banda= readln()
        var musicas= arrayOf<String>()

        var contador=0
        var numero=1
        while (contador<3){
            println("Digite o nome da "+numero+"º música:")
            musicas=musicas.plus(readln())
            contador++
            numero++
        }

        var num=1
        println("\nNome da banda: $banda")
        for(musica in musicas){
            println("Música "+num+": "+musica)
            num++
        }
    }
}