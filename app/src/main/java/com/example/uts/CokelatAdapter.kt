package com.example.uts

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class CokelatAdapter (private val context: Context, private val cokelat: List<CokelatClass>, val listener: (CokelatClass) -> Unit)
    : RecyclerView.Adapter<CokelatAdapter.cokelatViewHolder>(){
    class cokelatViewHolder(view: View): RecyclerView.ViewHolder(view) {

        val cokelatimg = view.findViewById<ImageView>(R.id.image)
        val cokelatname = view.findViewById<TextView>(R.id.tv_name)
        val cokelatrate = view.findViewById<TextView>(R.id.tv_rating)
        val ratingbar = view.findViewById<RatingBar>(R.id.ratingbar)

        fun bindView(cokelat: CokelatClass, listener: (CokelatClass) -> Unit){
            cokelatimg.setImageResource(cokelat.cokelatimg)
            cokelatname.text = cokelat.cokelatname
            cokelatrate.text = cokelat.cokelatrate
            ratingbar.rating = cokelat.ratingbar.toFloat()
            itemView.setOnClickListener{
                (listener(cokelat))
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): cokelatViewHolder {
        return cokelatViewHolder(
            LayoutInflater.from(context).inflate(R.layout.item_view, parent, false)
        )
    }

    override fun onBindViewHolder(holder: cokelatViewHolder, position: Int) {
        holder.bindView(cokelat[position], listener)
    }

    override fun getItemCount(): Int = cokelat.size

}