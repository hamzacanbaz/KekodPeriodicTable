package com.canbazdev.kekodperiodictable.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.canbazdev.kekodperiodictable.R
import com.canbazdev.kekodperiodictable.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private var _binding: ActivityMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val firstFragment = FirstFragment.newInstance()
        val ft = supportFragmentManager
        val transaction = ft.beginTransaction()
        transaction.replace(binding.frameLayout.id,firstFragment)
        transaction.commit()


    }


}