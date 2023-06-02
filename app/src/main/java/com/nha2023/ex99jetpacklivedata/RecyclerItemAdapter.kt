package com.nha2023.ex99jetpacklivedata

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.nha2023.ex99jetpacklivedata.databinding.RecyclerItemBinding

class RecyclerItemAdapter(val items:List<Item>) : Adapter<RecyclerItemAdapter.VH>() {
    //여기서 root는 뷰에대한 최상위, layout이 아니라 cardview이다.
    inner class VH(val binding : RecyclerItemBinding) : ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {

        //parent.context : parent는 부모 뷰이다. 얘는 콘텐스트를 갖고잇다
        val binding : RecyclerItemBinding = DataBindingUtil.inflate(LayoutInflater.from(parent.context),R.layout.recycler_item,parent,false)
        return VH(binding)

    }

    override fun onBindViewHolder(holder: VH, position: Int) {
       holder.binding.item = items[position]
    }

    override fun getItemCount(): Int {
        return items.size
    }


}