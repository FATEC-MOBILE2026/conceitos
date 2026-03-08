package io.github.fatec.nullsafety

data class Pessoa(
    var nome: String,
    var idade: Int,
    var endereco: EnderecoPessoa?
)
