package io.github.fatec.classprop

fun main() {
    val banco = Banco("NUBANK", "1234", "123456789")
    banco.nome = "ITAU"
    println(banco.toString())
    println(banco.apresentar())
}