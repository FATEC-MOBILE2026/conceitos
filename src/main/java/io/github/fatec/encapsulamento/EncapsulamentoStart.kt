package io.github.fatec.encapsulamento

fun main() {
    val conta = Conta()
    conta.deposito(100.0)
    conta.saque(30.0)
    println(conta.saldo())
}