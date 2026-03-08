package io.github.fatec.encapsulamento

class Conta {
    private var saldo: Double = 0.0

    fun deposito(valor: Double) {
        saldo += valor
    }

    fun saque(valor: Double) {
        saldo -= valor
    }

    fun saldo(): Double {
        return saldo
    }
}