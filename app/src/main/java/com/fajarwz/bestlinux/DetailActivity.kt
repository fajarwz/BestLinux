package com.fajarwz.bestlinux

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class DetailActivity : AppCompatActivity() {

    private val list: ArrayList<Distro> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val detailImg : ImageView = findViewById(R.id.detail_img)

        val image = intent.getIntExtra(EXTRA_IMG, 0)

        list.addAll(DistrosData.listData)
        //detailImg.setImageResource(listData.photo)
    }
}
