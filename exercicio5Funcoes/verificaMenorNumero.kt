package exercicio5Funcoes

fun verificaMenorNumero (vetorDeNumeros: DoubleArray) {
    var variavelTemporaria = vetorDeNumeros[0];

    for (i in vetorDeNumeros.indices) {
        if(vetorDeNumeros[i] < variavelTemporaria) {
            variavelTemporaria = vetorDeNumeros[i];
            println("O menor número é $variavelTemporaria")
        }
    }
}