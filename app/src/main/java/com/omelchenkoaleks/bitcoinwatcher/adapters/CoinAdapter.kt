package com.omelchenkoaleks.bitcoinwatcher.adapters

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.ViewGroup
import com.omelchenkoaleks.bitcoinwatcher.R
import com.omelchenkoaleks.bitcoinwatcher.components.MyViewHolder
import com.omelchenkoaleks.bitcoinwatcher.models.CoinCap
import kotlinx.android.synthetic.main.item_coin.view.*

class CoinAdapter : RecyclerView.Adapter<MyViewHolder>() {
    var data: List<CoinCap>? = null
        set(value) {
            field = value
            notifyDataSetChanged()
        }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_coin, parent, false))
    }

    override fun getItemCount(): Int = data ?. size ?: 0

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        data?.let {
            val coin = it[position]
            holder.view.symbol_tv.text = coin.symbol
            holder.view.name_tv.text = coin.name
            holder.view.price_change_tv.text =
                if(coin.percent_change_24h > 0) "+${coin.percent_change_24h}%"
                else "${coin.percent_change_24h}"
            holder.view.price_tv.text = "$${coin.price_usd}"
        }
    }
}