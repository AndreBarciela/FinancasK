package br.com.andre.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.andre.financask.R
import br.com.andre.financask.model.Tipo
import br.com.andre.financask.model.Transacao
import br.com.andre.financask.ui.ResumoView
import br.com.andre.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes: List<Transacao> = transacoesDeExemplo()

        configuraResumo(transacoes)

        configuraLista(transacoes)
    }

    private fun configuraResumo(transacoes: List<Transacao>) {
        val view = window.decorView
        val resumoView = ResumoView(this, view, transacoes)
        resumoView.atualiza()
    }

    private fun configuraLista(transacoes: List<Transacao>) {
        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }

    private fun transacoesDeExemplo(): List<Transacao> {
        return listOf(
            Transacao(valor = BigDecimal(620.5), tipo = Tipo.DESPESA),
            Transacao(valor = BigDecimal(100), categoria = "Economia", tipo = Tipo.RECEITA),
            Transacao(valor = BigDecimal(200.0), tipo = Tipo.DESPESA),
            Transacao(valor = BigDecimal(500.0), categoria = "Prêmio", tipo = Tipo.RECEITA)
        )
    }
}