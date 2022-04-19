package exercicio6Funcoes

fun calculoComissao (salario: Double, valorVendas: Double, nome: String) : Double{
    var comissao = valorVendas * 0.15
    println("Nome: $nome\n" +
            "Salário fixo: R$$salario\n" +
            "Salário com comissão: R$${salario + comissao}")
    return comissao
}