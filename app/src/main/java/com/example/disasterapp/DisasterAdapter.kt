package com.example.disasterapp

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ItemDisasterBinding

class DisasterAdapter(
    private val listDisaster: List<Disaster>,
    private val onItemClick: (Disaster) -> Unit
) : RecyclerView.Adapter<DisasterAdapter.DisasterViewHolder>() {

    inner class DisasterViewHolder(private val binding: ItemDisasterBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Disaster) {
            with(binding) {
                txtDisasterName.text = data.nameDisaster
                txtDisasterType.text = data.disasterType
                itemView.setOnClickListener {
                    onItemClick(data)
                }
            }

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DisasterViewHolder {
        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DisasterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: DisasterViewHolder, position: Int) {
        holder.bind(listDisaster[position])
    }

    override fun getItemCount(): Int = listDisaster.size
}
    