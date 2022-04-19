package exercicio3Funcoes

fun calculaImc (peso: Double, altura: Double) : Double {

    val imc = peso / (altura * altura)
    return imc

}