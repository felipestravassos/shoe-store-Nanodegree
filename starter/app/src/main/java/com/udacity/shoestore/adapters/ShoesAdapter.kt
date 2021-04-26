package com.udacity.shoestore.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.udacity.shoestore.databinding.ShoeListItemBinding
import com.udacity.shoestore.models.Shoe

class ShoesAdapter(val listener: IOnClickListener) : RecyclerView.Adapter<ShoesAdapter.ViewHolder>() {

    val list: ArrayList<Shoe> = ArrayList()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val binding = ShoeListItemBinding.inflate(layoutInflater, parent, false)

        return ViewHolder(binding, listener)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(list[position])
    }

    override fun getItemCount(): Int {
        return list.size
    }

    fun update(list: ArrayList<Shoe>) {
        this.list.addAll(list)
        notifyDataSetChanged()
    }

    interface IOnClickListener {
        fun onClick(shoe: Shoe?)
    }

    class ViewHolder : RecyclerView.ViewHolder {
        private val binding: ShoeListItemBinding
        private val listener: IOnClickListener

        constructor(
            binding: ShoeListItemBinding,
            listener: IOnClickListener
        ) : super(binding.root) {
            this.binding = binding
            this.listener = listener
        }

        fun bind(shoe: Shoe) {
            binding.shoe = shoe
            binding.root.setOnClickListener {
                listener.onClick(shoe)
            }
        }
    }
}