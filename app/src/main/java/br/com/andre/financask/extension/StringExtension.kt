package br.com.andre.financask.extension

fun String.limitaEmAte(caracteres: Int): String{
    if (this.length > caracteres) {
        val primeiroCaractere = 0
        return "${this.substring(primeiroCaractere, caracteres)}..."
    } else {
        return this
    }
}