package ru.samsung.itschool.mdev.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import ru.samsung.itschool.mdev.myapplication.viewmodel.MainViewModel

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var tv: TextView
    private lateinit var btn: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn = findViewById(R.id.button)
        tv = findViewById(R.id.textView)
        viewModel = ViewModelProvider(this)[MainViewModel::class.java]
        btn.setOnClickListener {
            viewModel.setValue()
        }
        viewModel.counter.observe(this, Observer {
            tv.text = it.toString()
        })


    }
}