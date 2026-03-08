package io.github.fatec.sealed

import io.github.fatec.sealed.Movimento.Baixo.mover

fun main() {
    val movimentos = listOf(Movimento.Baixo, Movimento.Direita, Movimento.Baixo)
    movimentos.forEach { mover(it) }
}