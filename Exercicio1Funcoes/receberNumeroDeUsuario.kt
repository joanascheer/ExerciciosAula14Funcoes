package Exercicio1Funcoes

fun recebeNumeroDeUsuario() : Int {
    println("Digite um número: ")
    val numeroDigitado = readln().toInt()
    return numeroDigitado
}