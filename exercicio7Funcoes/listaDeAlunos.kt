package exercicio7Funcoes

fun listaDeAlunos () : Array <String> {
    println("Quantos alunos têm na sua sala?")
    val quantidadeDeAlunos = readln().toString()

    val listaDeAlunos = arrayOf (quantidadeDeAlunos)

    listaDeAlunos.forEachIndexed {i, aluno ->
        println("Digite o nome do aluno ${i + 1}:")
        listaDeAlunos[i] = readln()
    }

    return listaDeAlunos

}