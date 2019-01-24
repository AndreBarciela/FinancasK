package br.com.andre.financask.model

import java.math.BigDecimal

class Resumo(private val transacoes: List<Transacao>) {

    fun receita(): BigDecimal {
        val somaDeReceita = somaPor(Tipo.RECEITA)

        return BigDecimal(somaDeReceita)
    }

    fun despesa(): BigDecimal {
        val somaDeDespesa = somaPor(Tipo.DESPESA)

        return BigDecimal(somaDeDespesa)
    }

    private fun somaPor(tipo: Tipo): Double {
        return transacoes
            .filter { transacao -> transacao.tipo == tipo }
            .sumByDouble { transacao -> transacao.valor.toDouble() }
    }

    fun total(): BigDecimal {
        return receita().subtract(despesa())
    }
}