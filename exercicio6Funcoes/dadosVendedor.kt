package exercicio6Funcoes

fun dadosVendedor() {
    println("Digite o nome do funcionário")
    val nome = readln()

    println("Digite o salário do vendedor")
    val salario = readln().toDouble()

    println("Qual o valor mensal de vendas?")
    val valorVendas = readln().toDouble()

    calculoComissao(salario, valorVendas, nome)
}