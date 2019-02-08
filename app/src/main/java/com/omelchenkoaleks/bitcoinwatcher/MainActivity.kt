package com.omelchenkoaleks.bitcoinwatcher

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import com.omelchenkoaleks.bitcoinwatcher.adapters.CoinAdapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var adapter: CoinAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        recyclerView.layoutManager = LinearLayoutManager(this)
        adapter = CoinAdapter()
        recyclerView.adapter = adapter
    }

    private fun loadCoins() {

    }
}
