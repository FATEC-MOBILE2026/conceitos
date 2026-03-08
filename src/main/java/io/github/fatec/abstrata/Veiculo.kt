package io.github.fatec.abstrata

abstract class Veiculo {
    fun ligar() {
        println("Veículo ligado")
    }

    abstract fun combustivel()
}