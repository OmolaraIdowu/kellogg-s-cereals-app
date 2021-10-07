package com.swancodes.kelloggscereals.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.swancodes.kelloggscereals.R
import com.swancodes.kelloggscereals.model.Cereals

class ItemAdapter(private val context: Context, private val dataSet: List<Cereals>)
    : RecyclerView.Adapter<ItemAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val kelloggsTextV : TextView = view.findViewById(R.id.item_title)
        val kelloggsText : TextView = view.findViewById(R.id.item_textView)
        val kelloggsImage : ImageView = view.findViewById(R.id.item_image)
        val kelloggsButton : Button = view.findViewById(R.id.item_button)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
        return ItemViewHolder(layout)

    }
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataSet[position]
        holder.kelloggsTextV.text = context.resources.getString(item.stringResourceId)
        holder.kelloggsText.text = context.resources.getString(item.stringResourceId1)
        holder.kelloggsImage.setImageResource(item.imageResourceId)
        holder.kelloggsButton.setOnClickListener {
            holder.kelloggsImage.visibility = View.VISIBLE
            holder.kelloggsButton.visibility = View.INVISIBLE
        }
    }
    override fun getItemCount() = dataSet.size

}