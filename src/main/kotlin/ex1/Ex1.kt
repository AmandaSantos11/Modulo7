package ex1

fun main(){
    Numeros().receberNumeros()
}

class Numeros {

    fun receberNumeros() {
        println("Digite um número:")
        val numeroX = readln().toInt()
        println("Digite outro número:")
        val numeroY = readln().toInt()

        calculoDosNumeros(numeroX, numeroY)
    }

    fun calculoDosNumeros(numeroX: Int, numeroY: Int) {
        var soma = 0
        if (numeroX < numeroY) {
            for (i in numeroX..numeroY) {
                if (!(i % 13 == 0)){
                    soma+=i
                }
            }
        }
        else{
            for (i in numeroY..numeroX) {
                if (!(i % 13 == 0)){
                    soma+=i
                }
            }
        }
        exibirASoma(numeroX,numeroY,soma)
        }

    fun exibirASoma(numeroX:Int,numeroY:Int,soma:Int){
        println("A soma dos números entre $numeroX e $numeroY é: $soma")
    }
}


