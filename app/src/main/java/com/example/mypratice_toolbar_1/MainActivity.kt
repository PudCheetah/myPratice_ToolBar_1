package com.example.mypratice_toolbar_1

import android.os.Bundle
import android.util.Log
import android.view.Menu
import androidx.appcompat.app.AppCompatActivity
import com.example.mypratice_toolbar_1.databinding.ActivityMainBinding

//
//
//使用setSupportActionBar()的方式綁定Menu
//
//

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setSupportActionBar(binding.materialToolbar)
        setContentView(binding.root)

        binding.materialToolbar.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.myMenu_item_1 -> {
                    Log.d("myTag", "myMenu_item_1")
                    true
                }
                R.id.myMenu_item_1_1 -> {
                    Log.d("myTag", "myMenu_item_1_1")
                    true
                }
                R.id.myMenu_item_2 -> {
                    Log.d("myTag", "myMenu_item_2")
                    true
                }
                R.id.myMenu_item_2_1 -> {
                    Log.d("myTag", "myMenu_item_2_1")
                    true
                }
                R.id.myMenu_item_2_2 -> {
                    Log.d("myTag", "myMenu_item_2_2")
                    true
                }
                R.id.myMenu_item_3 -> {
                    Log.d("myTag", "myMenu_item_3")
                    true
                }
                R.id.myMenu_item_3_1 -> {
                    Log.d("myTag", "myMenu_item_3_1")
                    true
                }
                R.id.myMenu_item_3_2 -> {
                    Log.d("myTag", "myMenu_item_3_2")
                    true
                }
                R.id.myMenu_item_3_3 -> {
                    Log.d("myTag", "myMenu_item_3_3")
                    true
                }
                else -> {false}
            }
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.my_menu_with_actionlayout, menu)
        return super.onCreateOptionsMenu(menu)
    }
}