package ex9

fun main(){
    Temperatura().receberTemperatura()
}

class Temperatura{

    fun receberTemperatura(){
        println("Digite a temperatura em ºC:")
        val temperaturaCelsius = readln().toDouble()

        converterTemperatura(temperaturaCelsius)
    }

    fun converterTemperatura(temperaturaCelsius:Double){
        val temperaturaFahrenheit = (9*temperaturaCelsius+160)/5
        println("A temperatura convertida para Fahrenheit é: $temperaturaFahrenheit")
    }
}