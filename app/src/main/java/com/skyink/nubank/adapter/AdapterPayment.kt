package com.skyink.nubank.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.skyink.nubank.databinding.PaymentItemBinding
import com.skyink.nubank.model.Payment

class AdapterPayment (private val context: Context, private val paymentList: MutableList<Payment>):
    RecyclerView.Adapter<AdapterPayment.PaymentViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PaymentViewHolder {
        val itemList = PaymentItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return PaymentViewHolder(itemList)
    }

    override fun onBindViewHolder(holder: PaymentViewHolder, position: Int) {
        holder.paymentIcon.setBackgroundResource(paymentList[position].icon!!)
        holder.txtPaymentTitle.text = paymentList[position].title
    }

    override fun getItemCount() = paymentList.size


    inner class PaymentViewHolder(binding: PaymentItemBinding ): RecyclerView.ViewHolder(binding.root) {
        val paymentIcon = binding.icPayment
        val txtPaymentTitle = binding.txtPaymentTitle

    }
}