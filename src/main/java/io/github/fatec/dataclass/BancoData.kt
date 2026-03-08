package io.github.fatec.dataclass

data class BancoData(
    val nome: String,
    val agencia: String,
    val conta: String
) {
    fun apresentar() {
        println("Banco: $nome Agencia: $agencia Conta: $conta")
    }
}
