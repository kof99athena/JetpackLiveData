package com.nha2023.ex99jetpacklivedata

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import com.nha2023.ex99jetpacklivedata.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //화면은 바인딩이 만드는것이다.
        val binding : ActivityMainBinding = DataBindingUtil.setContentView(this,R.layout.activity_main)
        //binding.vm = MyViewModel()

        val vm : MyViewModel = MyViewModel()
        binding.vm = vm

        //뷰모델 안에 있는 LiveData 변수를 관찰하는 설정
//        vm.name.observe(this,object : Observer<String>{
//            override fun onChanged(t: String?) {
//                //이렇게 object 익명객체를 사용하는것은 너무 길어서 람다로 쓰는게 좋다.
//            }
//
//        })

        //sam 변환으로 파라미터가 2개일때 (){}로 만들어도된다.
//        vm.name.observe(this){
//            Toast.makeText(this, "데이터변경 감지 : $it", Toast.LENGTH_SHORT).show()
//            //여기서 name을 바꾸려면? textview에 id를 줘야한다... 뷰바인딩같은데!
//            binding.tv.text = it
//        }
        //두번째방법
        binding.lifecycleOwner=this
    }
}