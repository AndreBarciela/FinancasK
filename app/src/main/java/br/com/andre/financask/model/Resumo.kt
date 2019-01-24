package br.com.andre.financask.model

import java.math.BigDecimal

class Resumo(private val transacoes: List<Transacao>) {

    fun receita(): BigDecimal {
        return somaPor(Tipo.RECEITA)
    }

    fun despesa(): BigDecimal {
        return somaPor(Tipo.DESPESA)
    }

    private fun somaPor(tipo: Tipo): BigDecimal {
        val somaDeTransacaoPeloTipo = transacoes
            .filter { it.tipo == tipo }
            .sumByDouble { it.valor.toDouble() }

        return BigDecimal(somaDeTransacaoPeloTipo)
    }

    fun total(): BigDecimal {
        return receita().subtract(despesa())
    }
}