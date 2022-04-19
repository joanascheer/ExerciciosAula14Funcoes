package exercicio8Funcoes

fun converteCelsiusemFarenheit (temperaturaC: Double) : Double {
    val temperaturaF = (9 * temperaturaC + 160) / 5
    println("Temperatura convertida: $temperaturaF graus Farenheit")

    return temperaturaF
}