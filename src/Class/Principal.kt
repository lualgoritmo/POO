import Class.Funcionario

fun main() {
    var novoFuncionario: Funcionario = Funcionario("Luis", "Silva")
    novoFuncionario.nomeCompleto()
    println("Valor recebido no mês: ${novoFuncionario.calcularSalario()}")
    var valorP: Double = 8.0
    novoFuncionario.incrementarHoras(valorP)
    println("Valor recebido no mês: ${novoFuncionario.calcularSalario()}")
    //FIM PRIMEIRA PARTE

    val funcionario1: Funcionario = Funcionario("Maria", "João")
    val funcionario2: Funcionario = Funcionario("João", "Alarde")
    val funcionario3: Funcionario = Funcionario("Leandrino", "Sevio")
    val funcionario4: Funcionario = Funcionario("Seve", "Ala")
    val funcionario5: Funcionario = Funcionario("Mary", "Seime")
    val funcionario6: Funcionario = Funcionario("Cassia", "Milion")
    val funcionario7: Funcionario = Funcionario("Maria", "João")
    val funcionario8: Funcionario = Funcionario("João", "Alarde")
    val funcionario9: Funcionario = Funcionario("Leandrino", "Sevio")
    val funcionario10: Funcionario = Funcionario("Marioveiz", "Seje")
    val listafuncionarios = ArrayList<Funcionario>()
    listafuncionarios.add(funcionario1)
    listafuncionarios.add(funcionario2)
    listafuncionarios.add(funcionario3)
    listafuncionarios.add(funcionario4)
    listafuncionarios.add(funcionario5)
    listafuncionarios.add(funcionario6)
    listafuncionarios.add(funcionario7)
    listafuncionarios.add(funcionario8)
    listafuncionarios.add(funcionario9)
    listafuncionarios.add(funcionario10)
    listafuncionarios.forEach { funcionario ->
        println("Nome: ${funcionario.nome} ${funcionario.sobreNome}")
        println(funcionario.nomeCompleto())
    }

}