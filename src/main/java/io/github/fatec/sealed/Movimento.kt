package io.github.fatec.sealed

sealed class Movimento {
    object Cima : Movimento()
    object Baixo : Movimento()
    object Esquerda : Movimento()
    object Direita : Movimento()

    fun mover(mov: Movimento) {
        when(mov) {
            Cima -> println("Movendo para cima")
            Baixo -> println("Movendo para baixo")
            Esquerda -> println("Movendo para esquerda")
            Direita -> println("Movendo para direita")
        }
    }
}