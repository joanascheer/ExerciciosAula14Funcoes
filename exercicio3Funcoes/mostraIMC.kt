package exercicio3Funcoes

fun mostraImc (imc: Double) {

    if (imc < 18.5) {
        println("Seu IMC é $imc - Magreza")
    } else if (imc in 18.5..24.9) {
        println("Seu IMC é $imc - Normal")
    } else if (imc in 25.0..29.9) {
        println("Seu IMC é $imc - Sobrepeso I")
    } else if (imc in 30.0..39.9) {
        println("Seu IMC é $imc - Obesidade II")
    } else {
        println("seu IMC é $imc - Obesidade Grave")
    }

}