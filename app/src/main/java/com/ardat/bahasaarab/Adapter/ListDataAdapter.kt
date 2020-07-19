package com.ardat.bahasaarab.Adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.ardat.bahasaarab.Data.ModelData
import com.ardat.bahasaarab.R
import kotlinx.android.synthetic.main.item_materi.view.*

class ListDataAdapter(val context: Context, val listMateri: ArrayList<ModelData>) : RecyclerView.Adapter<ListDataAdapter.ListViewHolder>() {

    private val bg = arrayListOf(
        R.drawable.gradient_blue,
        R.drawable.gradient_blue_azure,
        R.drawable.gradient_blue_shapire,
        R.drawable.gradient_green,
        R.drawable.gradient_green_kelly,
        R.drawable.gradient_green_old)

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var babText = itemView.item_bab
        var titleText = itemView.item_title
        var content = itemView.item_content
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.item_materi, parent, false)
        return ListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return listMateri.size
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val randoms = (0..5).random()

        val materi = listMateri[position]

        holder.babText.text = materi.bab
        holder.titleText.text = materi.title
        holder.content.background = context.getDrawable(bg[randoms])
    }
}