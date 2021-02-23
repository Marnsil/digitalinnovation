package one.digitalinnovation.collections

class Funcionario(
    val nome: String,
    val salario: Double,
    val tipoContratacao: String,
) {
    override fun toString(): String =
        """
            nome     $nome
            Salario $salario
        """.trimIndent()

}