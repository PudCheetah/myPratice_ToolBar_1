package com.example.mypratice_toolbar_1

import android.os.Bundle
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.mypratice_toolbar_1.databinding.ActivityMainBinding

class MainActivity2 : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        binding.materialToolbar.inflateMenu(R.menu.my_menu_with_actionlayout)
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
}