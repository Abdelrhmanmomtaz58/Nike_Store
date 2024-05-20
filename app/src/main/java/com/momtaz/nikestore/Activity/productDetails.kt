package com.momtaz.nikestore.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.momtaz.nikestore.R
import com.momtaz.nikestore.databinding.ActivityProductDetailsBinding

class productDetails : AppCompatActivity() {
    lateinit var binding: ActivityProductDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityProductDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val intent : Intent = intent
        val name = intent.getStringExtra("name")
        val price = intent.getStringExtra("price")
        val rating = intent.getStringExtra("rating")
        val image= intent.getStringExtra("image")
        binding.apply {
            productName.text=name
            priceDitals.text=price
            ratingproduct.text=rating
            Glide.with(this@productDetails).load(image).into(binding.bigImage)

            back.setOnClickListener {
                val intent2= Intent(this@productDetails,MainActivity::class.java)
                startActivity(intent2)
                finish()
            }

            buyButton.setOnClickListener {
                Toast.makeText(this@productDetails,"Add to Cart",Toast.LENGTH_LONG).show()

            }
            like.setOnClickListener {
                Toast.makeText(this@productDetails,"thank you for like",Toast.LENGTH_LONG).show()
            }


        }

    }
}