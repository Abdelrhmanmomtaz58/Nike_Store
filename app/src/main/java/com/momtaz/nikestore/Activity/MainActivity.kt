package com.momtaz.nikestore.Activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.momtaz.nikestore.R
import com.momtaz.nikestore.adapter.BestSellerRecyclerAdaptor
import com.momtaz.nikestore.adapter.NewReleaseRecyclerAdapter
import com.momtaz.nikestore.databinding.ActivityMainBinding
import com.momtaz.nikestore.model.BestSeller
import com.momtaz.nikestore.model.NewRelease

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView: RecyclerView = findViewById(R.id.recyclerView)
        val bestSellerRecyclerView: RecyclerView = findViewById(R.id.bast_Seller_recycler)
        val newReleaseList: ArrayList<NewRelease> = ArrayList()
        val bestSellerList: ArrayList<BestSeller> = ArrayList()

        addProduct1(newReleaseList)
        addProduct2(bestSellerList)

        val newReleaseRecyclerAdapter =
            NewReleaseRecyclerAdapter(this, newReleaseList)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerView.adapter = newReleaseRecyclerAdapter

        val bestSellerRecyclerAdaptor =
            BestSellerRecyclerAdaptor(this, bestSellerList)
        bestSellerRecyclerView.setHasFixedSize(true)
        bestSellerRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
        bestSellerRecyclerView.adapter = bestSellerRecyclerAdaptor


    }

    private fun addProduct2(bestSellerList: ArrayList<BestSeller>) {
        val Bproduct1 = BestSeller(
            "Legend React 2",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FLEGEND-REACT-2-SHIELD.png?alt=media&token=f9f1dcea-c1c3-49e2-937f-9a3b4bcdc2e8",
            "110$",
            "4.8"
        )
        val Bproduct2 = BestSeller(
            "Air Max Infinity",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FAIR-MAX-INFINITY.png?alt=media&token=f80a444b-23dd-4cfb-846d-01fbff2333b0",
            "130$",
            "4.7"
        )
        val Bproduct3 = BestSeller(
            "Zoom Gravity",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FZoom-Gravity.png?alt=media&token=18dd7bcf-10f5-45fa-b552-2a831b23b010",
            "90$",
            "4.6"
        )
        val Bproduct4 = BestSeller(
            "Phantom Vision",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fphantom-vision-elite.png?alt=media&token=a7623279-beec-4f80-a4d3-67fe498287d8",
            "275$",
            "4.8"
        )
        val Bproduct5 = BestSeller(
            "Air Max Alpha",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-max-alpha.png?alt=media&token=2aaff64e-8f74-43d5-9281-cbe9af05abb4",
            "130$",
            "4.5"
        )
        val Bproduct6 = BestSeller(
            "Air Zoom Super",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-zoom-superrep.png?alt=media&token=44be4805-f3e3-423c-a5e3-b0f939fe3cda",
            "150$",
            "4.9"
        )

        bestSellerList.add(Bproduct1)
        bestSellerList.add(Bproduct2)
        bestSellerList.add(Bproduct3)
        bestSellerList.add(Bproduct4)
        bestSellerList.add(Bproduct5)
        bestSellerList.add(Bproduct6)

    }

    private fun addProduct1(newReleaseList:ArrayList<NewRelease>) {
        val product1 = NewRelease(
            "Legend React 2",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FLEGEND-REACT-2-SHIELD.png?alt=media&token=f9f1dcea-c1c3-49e2-937f-9a3b4bcdc2e8",
            "110$",
            "4.8"
        )
        val product2 = NewRelease(
            "Air Max Infinity",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FAIR-MAX-INFINITY.png?alt=media&token=f80a444b-23dd-4cfb-846d-01fbff2333b0",
            "130$",
            "4.7"
        )
        val product3 = NewRelease(
            "Zoom Gravity",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2FZoom-Gravity.png?alt=media&token=18dd7bcf-10f5-45fa-b552-2a831b23b010",
            "90$",
            "4.6"
        )
        val product4 = NewRelease(
            "Phantom Vision",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fphantom-vision-elite.png?alt=media&token=a7623279-beec-4f80-a4d3-67fe498287d8",
            "275$",
            "4.8"
        )
        val product5 = NewRelease(
            "Air Max Alpha",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-max-alpha.png?alt=media&token=2aaff64e-8f74-43d5-9281-cbe9af05abb4",
            "130$",
            "4.5"
        )
        val product6 = NewRelease(
            "Air Zoom Super",
            "https://firebasestorage.googleapis.com/v0/b/nike-store-8568e.appspot.com/o/shoe%20models%2Fair-zoom-superrep.png?alt=media&token=44be4805-f3e3-423c-a5e3-b0f939fe3cda",
            "150$",
            "4.9"
        )

        newReleaseList.add(product1)
        newReleaseList.add(product2)
        newReleaseList.add(product3)
        newReleaseList.add(product4)
        newReleaseList.add(product5)
        newReleaseList.add(product6)

    }
}