package exercicio4Funcoes

fun pegaDadosRetangulo () {
    println("Qual a base do retângulo?")
    val base = readln().toDouble()

    println("Qual a altura do retângulo?")
    val altura = readln().toDouble()

    calculaArea(base, altura)
}