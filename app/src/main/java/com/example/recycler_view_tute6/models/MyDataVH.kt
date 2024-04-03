package com.example.recycler_view_tute6.models

import android.widget.Button
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.recycler_view_tute6.R

class MyDataVH(itemView: View): RecyclerView.ViewHolder(itemView){
    val tvUserName:TextView = itemView.findViewById(R.id.tvUserName)
    val tvDescription:TextView = itemView.findViewById(R.id.tvDescription)
    val btnLike:Button = itemView.findViewById(R.id.btnLike)


}