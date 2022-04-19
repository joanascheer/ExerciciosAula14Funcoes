package exercicio7Funcoes

fun calculaMedia (listaDeNotas: DoubleArray) : Double {
    var somaDasNotas = 0.0
    var media = 0.0

    for (i in listaDeNotas.indices) {
        somaDasNotas += listaDeNotas[i]
        media = somaDasNotas / 3
    }

    return media
}