package com.cajaproducts.mylittlelist

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup

class PessoaAdapter(private  val myDataset: List<Pessoa> ): RecyclerView.Adapter<PessoaAdapter.MyViewHolder>(){


    private lateinit var contexto: Context
    override fun getItemCount(): Int {
        return myDataset.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewTipe: Int): PessoaAdapter.MyViewHolder {
        contexto = parent.context
        val view = LayoutInflater.from(contexto).inflate(R.layout.listaview, parent, false)
        return MyViewHolder(view)
    }
}
