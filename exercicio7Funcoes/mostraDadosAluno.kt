package exercicio7Funcoes

fun mostraDadosAluno (listaDeAlunos: Array<String>, media: Double) {
    for (i in listaDeAlunos.indices) {

        println("Nome do Aluno: ${listaDeAlunos[i]} \n\n" +
                "Média: %.2f".format(media))
    }

}