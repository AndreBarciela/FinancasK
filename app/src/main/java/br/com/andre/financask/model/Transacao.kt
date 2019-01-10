package br.com.andre.financask.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao(private val valor: BigDecimal,
                private val categoria: String,
                private val data: Calendar) {

    fun getValor() : BigDecimal {
        return valor
    }
}