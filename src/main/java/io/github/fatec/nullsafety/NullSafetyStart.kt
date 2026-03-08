package io.github.fatec.nullsafety

fun main() {
    val pessoa = Pessoa("", 10, null)
    println("Rua: ${pessoa.endereco!!.rua}")
}