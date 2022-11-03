package com.skyink.nubank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.skyink.nubank.adapter.AdapterPayment
import com.skyink.nubank.databinding.ActivityMainBinding
import com.skyink.nubank.model.Payment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapterPayment: AdapterPayment
    private val paymentList: MutableList<Payment> = mutableListOf()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        supportActionBar!!.hide()
        //define layout manager for recycle view
        val recyclerIconPayment = binding.recyclerIconPayments
        recyclerIconPayment.layoutManager = LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)

        //Fixed for more performance
        recyclerIconPayment.setHasFixedSize(true)
        adapterPayment = AdapterPayment(this,paymentList)
        recyclerIconPayment.adapter = adapterPayment
        paymentIconList()
    }

    private fun paymentIconList(){
        val pix = Payment(R.drawable.ic_pix,"Pix Area")
        paymentList.add(pix)

        val barcode = Payment(R.drawable.barcode,"Pay")
        paymentList.add(barcode)

        val loan = Payment(R.drawable.loan,"Borrow")
        paymentList.add(loan)

        val transfer = Payment(R.drawable.transfer,"Transfer")
        paymentList.add(transfer)

        val deposit = Payment(R.drawable.deposit,"Deposit")
        paymentList.add(deposit)

        val recharge = Payment(R.drawable.ic_mobile_recharge,"Mobile Recharge")
        paymentList.add(recharge)

        val demand = Payment(R.drawable.ic_demand,"Demand")
        paymentList.add(demand)

        val donation = Payment(R.drawable.donation,"Donation")
        paymentList.add(donation)


    }
}