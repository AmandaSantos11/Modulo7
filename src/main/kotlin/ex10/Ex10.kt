package ex10

fun main(){
    Calculo().somarNumeros()
}

class Calculo{

    fun somarNumeros(){

        var numero=1
        var resultado=0

        do{
            resultado+=numero
            numero++
        }while (numero<16)

        println("A soma dos números entre 1 e 15 é: $resultado")
    }
}