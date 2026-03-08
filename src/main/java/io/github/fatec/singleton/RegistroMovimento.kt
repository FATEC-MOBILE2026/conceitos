package io.github.fatec.singleton

class RegistroMovimento private constructor() {
    private val movimentos = mutableListOf<String>()

    fun registrar(movimento: String) {
        movimentos.add(movimento)
    }

    fun mostrarMovimentos() {
        println("Movimentos registrados: $movimentos")
    }

    companion object {
        private var instancia: RegistroMovimento? = null

        fun getInstance(): RegistroMovimento {
            if (instancia == null) {
                instancia = RegistroMovimento()
            }
            return instancia!!
        }
    }
}