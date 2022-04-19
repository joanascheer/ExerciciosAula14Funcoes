package exercicio5Funcoes

fun preencheVetor () : DoubleArray {
    println("Quantos números você vai inserir?")
    val quantidadeNumeros = readln().toInt()

    val vetorDeNumeros = DoubleArray(quantidadeNumeros)

    for (i in vetorDeNumeros.indices) {
        println("Digite o número ${i + 1} de $quantidadeNumeros:")
        vetorDeNumeros[i] = readln().toDouble()
    }

    return vetorDeNumeros
}