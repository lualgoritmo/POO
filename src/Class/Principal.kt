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
    val f1 = ArrayList<Funcionario>()
    f1.add(funcionario1)
    f1.forEach { funcionario ->
        println("Nome: ${funcionario.nome} ${funcionario.sobreNome}")
        println(funcionario.nomeCompleto())
    }
    val funcionario2: Funcionario = Funcionario("Aria", "Stark")
    val f2 = ArrayList<Funcionario>()
    f2.add(funcionario2)
    f2.forEach { funcionario ->
        println("Nome: ${funcionario.nome} ${funcionario.sobreNome}")
    }
    val f3 = ArrayList<Funcionario>()
    val funcionario3: Funcionario = Funcionario("Leoa", "Sa")
    f3.add(funcionario3)
    f3.forEach { funcionario ->
        println("Nome: ${funcionario.nome} ${funcionario.sobreNome}")
    }
}