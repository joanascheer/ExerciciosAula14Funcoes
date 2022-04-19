package exercicio3Funcoes

fun main() {

    mostraImc(calculaImc(pesoUsuario(), alturaUsuario()))

}

/*
* Faça um algoritmo que contenha uma função que calcule o IMC de um
usuário a partir da inserção do seu peso e de sua altura. Exiba a
classificação do usuário após a verificação do seu IMC.

IMC CLASSIFICAÇÃO OBESIDADE (GRAU)
MENOR QUE 18,5 MAGREZA 0
ENTRE 18,5 E 24,9 NORMAL 0
ENTRE 25,0 E 29,9 SOBREPESO I
ENTRE 30,0 E 39,9 OBESIDADE II
MAIOR QUE 40,0 OBESIDADE GRAVE III
* */