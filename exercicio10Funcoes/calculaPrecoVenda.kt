package exercicio10Funcoes

fun calculoVenda(precoDeCusto: Double) : Double {
    println("Qual o percentual a aplicar no valor do produto?")
    val percentual = readln().toDouble()
    val acrescimo = precoDeCusto * percentual / 100
    val precoDeVenda = precoDeCusto + acrescimo

    println("O preço de venda deste produto é de R$$precoDeVenda")
    return precoDeVenda
}