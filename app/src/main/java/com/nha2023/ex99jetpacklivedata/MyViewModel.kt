package com.nha2023.ex99jetpacklivedata

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

class MyViewModel {
    //LiveData : Observalble와 다르게 라이프사이클에 따라 효율적으로 UI를 갱신
    //원래는 옵저버블인데.. 이제 이거말고!
    //("sam")은 초기값
    val name : MutableLiveData<String> = MutableLiveData("sam")
    val age : MutableLiveData<Int> = MutableLiveData(20)

    //1.1 데이터 변경 콜백메소드

    fun changeName(){
        name.value = "Robin"
        //라이브데이터를 다룰때 생각해야할점 : 옵저버블은 set해두면 원하지 않을때마다 변경되었지만, LiveData는 그걸 막아두었다.
        //LiveData는 값을 변경한다고 해도 자동 갱신하지 않음...

        //방법 1. LiveData 변수를 관찰하는 observe() 메소드를 통해서 관찰 및 UI를 갱신해야한다. -> 액티비티에서 한다.
        //방법 2. LiveData의 변화를 반영할 LifeCycleOwner를 반영하자

    }

    fun increaseAge(){
        //null이 아니야
        age.value= (age.value)!!.toInt()+1
    }

    //2. 리사이클러뷰에 LiveData 변수 적용
    val items : MutableLiveData<MutableList<Item>> = MutableLiveData(mutableListOf(Item("ahn","i love")))

    //2.1 아이템추가하면 화면 자동 갱신
    fun addItem(){
        val list = items.value
        list?.add(0,Item("안혜영","최고"))
        items.value = list
    }



}