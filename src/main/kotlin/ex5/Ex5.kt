package ex5

fun main(){
    Lista().listaDeCompras()
}

class Lista{

    fun listaDeCompras(){
        println("Deseja adicionar quantos itens a sua lista:")
        var quantidadeDeitens:Int = readln().toInt()
        var listaDeCompras = arrayOf<String>()

        for(produto in 1..quantidadeDeitens){
            println("Digite o nome do "+(produto)+"º produto:")
            listaDeCompras= listaDeCompras.plus(readln())
        }

        println("\nSua lista de compras:")
        for (item in listaDeCompras) {
            println("- $item")
        }
    }
}