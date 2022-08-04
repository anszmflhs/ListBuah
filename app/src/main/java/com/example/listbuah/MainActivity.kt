package com.example.listbuah

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val namaBuah = arrayOf("Alpukat","Apel","Ceri","Durian","Jambu Air","Manggis","Stroberi")

        val gambarBuah = arrayOf(
            R.drawable.alpukat,
            R.drawable.apel,
            R.drawable.ceri,
            R.drawable.durian,
            R.drawable.jambuair,
            R.drawable.manggis,
            R.drawable.strawberry
        )
        val suaraBuah = arrayOf(
            R.raw.p,
            R.raw.a,
            R.raw.nyop,
            R.raw.durian,
            R.raw.jambu_air,
            R.raw.manggis,
            R.raw.strawberry
        )
        val buahAdapter = BuahAdapter(namaBuah, gambarBuah, suaraBuah)

        rv_buah.apply {
            layoutManager = GridLayoutManager(this@MainActivity,2)
            setHasFixedSize(true)
            adapter = buahAdapter
        }
    }
}