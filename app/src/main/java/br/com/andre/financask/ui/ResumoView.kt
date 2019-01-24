package br.com.andre.financask.ui

import android.content.Context
import android.support.v4.content.ContextCompat
import android.view.View
import br.com.andre.financask.R
import br.com.andre.financask.extension.formataParaBrasileiro
import br.com.andre.financask.model.Resumo
import br.com.andre.financask.model.Tipo
import br.com.andre.financask.model.Transacao
import kotlinx.android.synthetic.main.resumo_card.view.*
import java.math.BigDecimal

class ResumoView(private val context: Context,
                 private val view: View,
                 transacoes: List<Transacao>) {

    private val resumo: Resumo = Resumo(transacoes)

    fun adicionaReceita() {
        var totalReceita = resumo.receita()
        view.resumo_card_receita.setTextColor(ContextCompat.getColor(context, R.color.receita))
        view.resumo_card_receita.text = totalReceita.formataParaBrasileiro()
    }

    fun adicionaDespesa() {
        var totalDespesa = resumo.despesa()
        view.resumo_card_despesa.setTextColor(ContextCompat.getColor(context, R.color.despesa))
        view.resumo_card_despesa.text = totalDespesa.formataParaBrasileiro()
    }

    fun adicionaTotal() {
        val total = resumo.total()



        view.resumo_card_total.text = total.formataParaBrasileiro()
    }
}