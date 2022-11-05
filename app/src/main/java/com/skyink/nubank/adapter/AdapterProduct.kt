package com.skyink.nubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skyink.nubank.databinding.ProductItemBinding
import com.skyink.nubank.model.Product

class AdapterProduct(private val context: Context, private val productList: MutableList<Product>) :
    RecyclerView.Adapter<AdapterProduct.ProductViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val itemList = ProductItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return ProductViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        holder.txtInformation.text = productList[position].text
    }

    override fun getItemCount() = productList.size

    inner class ProductViewHolder(binding: ProductItemBinding): RecyclerView.ViewHolder(binding.root) {
        val txtInformation = binding.txtInformation
    }
}