package com.example.disasterapp

import android.recycleview.widget.RecycleView
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.disasterapp.databinding.ItemDisasterBinding

class DisasterAdapter(privat val listDisaster: List<Disaster>):
    RecyclerView.Adapter<DisasterAdapter.ItemDisasterViewHolder>() {

    inner class ItemDisasterViewHolder(private val binding: ItemDisasterBinding):
        RecycleView.ViewHolder(itemView = binding.root) {

            fun bind(data: Disaster) {
                with(receiver = binding) {
                    txtDisasterName.text = data.nameDisaster
                    txtDisasterType.text = data.typeDisaster

                    itemView.setOn
                }
            }
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemDisasterViewHolder {


        val binding = ItemDisasterBinding.inflate(LayoutInflater.from(context = parent.context), parent, false)
        returm ItemDisasterViewHolder(binding)
    }

    override fun onBindViewHolder(holder: ItemDisasterViewHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return 5
    }
}