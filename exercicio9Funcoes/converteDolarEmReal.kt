package exercicio9Funcoes

fun converteDolarEmReal (cotacao: Double) : Double{
    println("Qual o valor em dólar?")
    val dolar = readln().toDouble()
    val valorEmReal = dolar / 4.00
    println("O valor convertido é de R$$valorEmReal")

    return valorEmReal
}