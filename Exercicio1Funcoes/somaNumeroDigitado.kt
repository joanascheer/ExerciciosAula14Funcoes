package Exercicio1Funcoes

fun somatoriaDoNumeroDigitado(numeroDigitado: Int) : Int {
    var soma = 0
    for (i in 1 .. numeroDigitado) {
        soma += i
    }
    return soma
}