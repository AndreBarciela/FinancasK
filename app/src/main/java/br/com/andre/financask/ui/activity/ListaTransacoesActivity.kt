package br.com.andre.financask.ui.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.ArrayAdapter
import br.com.andre.financask.R
import br.com.andre.financask.model.Transacao
import br.com.andre.financask.ui.adapter.ListaTransacoesAdapter
import kotlinx.android.synthetic.main.activity_lista_transacoes.*
import java.math.BigDecimal
import java.util.*

class ListaTransacoesActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista_transacoes)

        val transacoes = listOf(
                            Transacao(BigDecimal(20.5),"Comida", Calendar.getInstance()),
                            Transacao(BigDecimal(100), "Economia", Calendar.getInstance()))

        lista_transacoes_listview.adapter = ListaTransacoesAdapter(transacoes, this)
    }
}