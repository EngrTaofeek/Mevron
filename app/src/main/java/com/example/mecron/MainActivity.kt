package com.example.mecron

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager

import androidx.recyclerview.widget.LinearLayoutManager

import android.view.View

import androidx.recyclerview.widget.RecyclerView




class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()
        initializeDisplay()
    }
    fun initializeDisplay(){
        val recyclerItems: RecyclerView = findViewById<View>(R.id.recycler) as RecyclerView
        val layoutManager = LinearLayoutManager(this)
        val recyclerAdapter = RecyclerAdapter(this)

        recyclerItems.layoutManager = layoutManager
        recyclerItems.adapter = recyclerAdapter
    }
}