package io.github.fatec.singleton

fun main() {
    val registro1 = RegistroMovimento.getInstance()
    val registro2 = RegistroMovimento.getInstance()

    registro1.registrar("CIMA")
    registro1.registrar("BAIXO")
    registro1.registrar("ESQUERDA")
    registro2.registrar("BAIXO")

    println(registro1.mostrarMovimentos())
}