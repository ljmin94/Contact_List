package com.example.calllist

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.calllist.databinding.ListItemBinding

class CallProAdapter(val callList: ArrayList<CallProfiles>): RecyclerView.Adapter<CallProAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
//        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item, parent, false)
//        return ViewHolder(view)
        val binding = ListItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return callList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
//        holder.photo.setImageResource(callList.get(position).photo)
//        holder.name.text = callList.get(position).name
//        holder.number.text = callList.get(position).number
        val callProfile = callList[position]
        holder.bind(callProfile)
    }

    class ViewHolder(val binding: ListItemBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(callProfile: CallProfiles) {
            binding.circleIv.setImageResource(callProfile.photo)
            binding.tvName.text = callProfile.name
            binding.tvNumber.text = callProfile.number
        }
//        val photo = itemView.findViewById<ImageView>(R.id.iv_photo) //사진
//        val name = itemView.findViewById<TextView>(R.id.tv_name) // 이름
//        val number = itemView.findViewById<TextView>(R.id.tv_number) // 전화번호
    }
}