package com.vaca.recyclerviewfoot

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Fuck (var context: Context): RecyclerView.Adapter<Fuck.ViewHolder>() {
    private val mInflater: LayoutInflater = LayoutInflater.from(context)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Fuck.ViewHolder {
        val view = mInflater.inflate(R.layout.item_home_member, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: Fuck.ViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 3
    }

    inner class ViewHolder internal  constructor(itemView: View):RecyclerView.ViewHolder(itemView){

    }
}