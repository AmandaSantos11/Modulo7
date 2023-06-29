package ex2

fun main(){
    println("Digite sua idade:")
    println("Você viveu "+CalculoDias().calculoDeQntsDiasViveu(readln().toInt())+" dias!")
}

class CalculoDias{
    fun calculoDeQntsDiasViveu(idade:Int):Int{
        return idade*365
    }
}
