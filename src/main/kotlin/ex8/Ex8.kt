package ex8

fun main(){
    var x = 4
    var y = 8
    println("Valor inicial: x = $x | y = $y")

    var a = x
    x = y
    y = a
    println("Valor depois da troca: x = $x | y = $y")
}