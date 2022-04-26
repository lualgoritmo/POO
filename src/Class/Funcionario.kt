package Class

class Funcionario(nome:String, sobreNome:String) {
   var nome: String = nome
   var sobreNome: String = sobreNome
   var horasTrabalhadas:Double = 10.0
   var valorPorHora:Double = 25.50

    fun nomeCompleto() {
        println("O nome do funcionário é: $nome" + " $sobreNome")
    }
    fun calcularSalario(): Double {
        return valorPorHora * horasTrabalhadas
    }
    fun incrementarHoras(valorPassado:Double) {
        valorPorHora += valorPassado
    }
}