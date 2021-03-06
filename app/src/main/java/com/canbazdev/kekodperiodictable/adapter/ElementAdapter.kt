package com.canbazdev.kekodperiodictable.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.canbazdev.kekodperiodictable.databinding.RowItemElementBinding
import com.canbazdev.kekodperiodictable.model.Element

class ElementAdapter(
    val elementList: List<Element>,
    private val listener: OnItemClickedListener
) :
    RecyclerView.Adapter<ElementAdapter.ElementViewHolder>() {

    interface OnItemClickedListener {
        fun onItemClicked(position: Int, element: Element)
    }

    inner class ElementViewHolder(private val binding: RowItemElementBinding) :
        RecyclerView.ViewHolder(binding.root), View.OnClickListener {

        init {
            itemView.setOnClickListener(this)
        }

        fun bind(element: Element) {
            binding.elementInfo = element
        }

        override fun onClick(p0: View?) {
            val position = adapterPosition
            if (position != RecyclerView.NO_POSITION) {
                listener.onItemClicked(position, elementList[position])
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ElementViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        val binding = RowItemElementBinding.inflate(inflater, parent, false)
        return ElementViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ElementViewHolder, position: Int) {

        holder.bind(elementList[position])
        holder.itemView.visibility = View.INVISIBLE;

    }

    override fun getItemCount() = elementList.size
}