package com.example.mobiledevelopmenttp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewNews)
        val layoutManager = LinearLayoutManager(this)
        recyclerView.layoutManager = layoutManager
        recyclerView.addItemDecoration(DividerItemDecoration(this, layoutManager.orientation))

        val newsList = listOf(
            NewsItem("Tech Giants Report Record Profits", "Major technology companies announced unprecedented earnings this quarter.", R.drawable.ic_android),
            NewsItem("Climate Summit Reaches New Agreement", "World leaders signed a landmark climate deal targeting net-zero emissions by 2040.", R.drawable.ic_android),
            NewsItem("Space Mission Discovers New Exoplanet", "NASA confirmed a potentially habitable planet just 40 light-years away.", R.drawable.ic_android),
            NewsItem("Global Markets Hit All-Time High", "Stock exchanges closed at record levels following strong economic data.", R.drawable.ic_android),
            NewsItem("Medical Breakthrough in Cancer Research", "MIT researchers unveiled immunotherapy showing 90% success in early trials.", R.drawable.ic_android),
            NewsItem("Championship Final Draws Millions", "Last night's match became the most-watched sporting event of the decade.", R.drawable.ic_android)
        )

        recyclerView.adapter = NewsAdapter(newsList)
    }
}