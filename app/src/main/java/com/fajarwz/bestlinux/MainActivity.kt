package com.fajarwz.bestlinux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var rvDistros: RecyclerView
    private val list: ArrayList<Distro> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rvDistros = findViewById(R.id.rv_distros)
        rvDistros.setHasFixedSize(true)

        list.addAll(DistrosData.listData)
        showList()
    }

    private fun showList() {
        rvDistros.layoutManager = LinearLayoutManager(this)
        val listDistroAdapter = ListDistroAdapter(list)
        rvDistros.adapter = listDistroAdapter
    }
}
