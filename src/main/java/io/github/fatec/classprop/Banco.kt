package io.github.fatec.classprop

class Banco(
    var nome: String,
    val agencia: String,
    val conta: String
) {
    fun apresentar() {
        println("Banco: $nome Agencia: $agencia Conta: $conta")
    }
}