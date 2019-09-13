package com.fajarwz.bestlinux

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class ListDistroAdapter(val listDistro: ArrayList<Distro>) : RecyclerView.Adapter<ListDistroAdapter.ListViewHolder>() {

    override fun onCreateViewHolder(viewGroup: ViewGroup, i: Int): ListViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context).inflate(R.layout.item_row, viewGroup, false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val (name, detail, photo) = listDistro[position]
        Glide.with(holder.itemView.context)
            .load(photo)
            .apply(RequestOptions().override(55, 55))
            .into(holder.imgPhoto)
        holder.tvName.text = name
        holder.tvDetail.text = detail
    }

    override fun getItemCount(): Int {
        return listDistro.size
    }

    inner class ListViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var tvName: TextView = itemView.findViewById(R.id.item_row_name)
        var tvDetail: TextView = itemView.findViewById(R.id.item_row_detail)
        var imgPhoto: ImageView = itemView.findViewById(R.id.item_row_photo)
    }
}