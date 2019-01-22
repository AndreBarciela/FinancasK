package br.com.andre.financask.ui

import android.view.View
import br.com.andre.financask.extension.formataParaBrasileiro
import br.com.andre.financask.model.Resumo
import br.com.andre.financask.model.Tipo
import br.com.andre.financask.model.Transacao
import kotlinx.android.synthetic.main.resumo_card.view.*
import java.math.BigDecimal

class ResumoView(private val view: View,
                 transacoes: List<Transacao>) {

    private val resumo: Resumo = Resumo(transacoes)

    fun adicionaReceita() {
        var totalReceita = resumo.receita()

        view.resumo_card_receita.text = totalReceita.formataParaBrasileiro()
    }

    fun adicionaDespesa() {
        var totalDespesa = resumo.despesa()

        view.resumo_card_despesa.text = totalDespesa.formataParaBrasileiro()
    }

    fun adicionaTotal() {
        val total = resumo.total()

        view.resumo_card_total.text = total.formataParaBrasileiro()
    }
}