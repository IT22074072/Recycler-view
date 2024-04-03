package com.example.recycler_view_tute6.models

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view_tute6.R

class MyDataAdapter(private val data:List<Post>):RecyclerView.Adapter<MyDataVH>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyDataVH {
        val layoutInflater = LayoutInflater.from(parent.context)
        val view: View = layoutInflater.inflate(R.layout.list_item_layout, parent,false)
        return MyDataVH(view)

    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onBindViewHolder(holder: MyDataVH, position: Int) {
        val singleData = data[position]
        var toggle = true


        holder.tvUserName.text = singleData.userName
        holder.tvDescription.text = singleData.description
        holder.btnLike.text = "${singleData.likes}👍"


        holder.btnLike.setOnClickListener {
            if (toggle) {
                holder.btnLike.text = "${singleData.likes + 1}👍"
                toggle = false
            }else{
                holder.btnLike.text = "${singleData.likes}👍"
                toggle = true

            }
        }

    }
}