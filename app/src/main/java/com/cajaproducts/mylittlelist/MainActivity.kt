package com.cajaproducts.mylittlelist

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    data class TeamSix (var name: String, var last_name: String, var avatar: Int)

    private lateinit var recyclerView: RecyclerView

    private lateinit var viewAdapter: RecyclerView.Adapter<*>

    private lateinit var viewManager: RecyclerView.LayoutManager

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val myDataset = mutableListOf<TeamSix>()
        val avatar = (R.drawable.avatar_android)
    }


}
