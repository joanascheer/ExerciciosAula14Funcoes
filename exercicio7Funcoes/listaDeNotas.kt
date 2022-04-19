package exercicio7Funcoes

fun listaDeNotas () : DoubleArray{
    val listaDeNotas = DoubleArray(3)


    for (i in listaDeNotas.indices) {
        println("Digite a nota ${i+1}:")
        listaDeNotas[i] = readln().toDouble()
    }

    return listaDeNotas
}