package one.digitalinnovation.collections

fun main(){
    val joao = Funcionario("Joao",2000.0, "CLT")
    val pedro = Funcionario("Pedro",1500.0,"PJ")
    val maria = Funcionario("Maria",4000.0,"CLT")

    val Funcionarios = listOf(joao, pedro, maria)

    Funcionarios.forEach { println(it) }

    println("--------------------")
    println(Funcionarios.find { it.nome == "Maria" })

    println("--------------------")
    Funcionarios
        .sortedBy { it.salario }
        .forEach{println(it)}

    println("--------------------")
    Funcionarios
        .groupBy { it.tipoContratacao }
        .forEach{println(it)}

}

