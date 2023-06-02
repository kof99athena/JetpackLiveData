package com.nha2023.ex99jetpacklivedata

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

object MyBindingAdapter {
    //리사이클러뷰에서 리스트데이터를 설정하는 새로운 속성을 만들기 [속성명 : itemList]
    @BindingAdapter("itemList")
    @JvmStatic
    fun setItemList(view:RecyclerView, items:Any){
        view.adapter = RecyclerItemAdapter(items as List<Item>)
    }
}