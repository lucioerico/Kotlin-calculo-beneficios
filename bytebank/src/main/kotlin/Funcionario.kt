open class Funcionario(
    val nome: String,
    val cpf: String,
    val salario: Double,
//    val tipo: Int // funcionario, 1, 1 gerente, 2 diretores

) {
    open fun bonificacao(): Double = salario * 0.1

}


