fun main() {
    println("Bem vindo ao Bytebank")

    val lucio = Funcionario(
        nome = "Lucio",
        cpf = "111.111.111 - 11",
        salario = 1000.0,
    )
    println("nome ${lucio.nome}")
    println("cpf ${lucio.cpf}")
    println("salario ${lucio.salario}")

    println("---------------------------------------------------------")

    val erico = Gerente(
        nome = "Erico",
        cpf = "222.222.222 - 22",
        salario = 2000.0,
        senha = 1234,
    )
    println("nome ${erico.nome}")
    println("cpf ${erico.cpf}")
    println("salario ${erico.salario}")
    println("bonificação ${erico.getBonificacao()}")


    if (erico.autentica(1234)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }
    println("---------------------------------------------------------")

    val americo = Diretor(
        nome = "Americo",
        cpf = "33.333.333.33",
        salario = 4000.0,
        senha = 4000,
        plr = 200.0
    )
    println("nome ${americo.nome}")
    println("cpf ${americo.cpf}")
    println("salario ${americo.salario}")


    if (americo.autentica(4000)) {
        println("Autenticou com sucesso")
    } else {
        println("Falha na autenticação")
    }

    println("---------------------------------------------------------")

}