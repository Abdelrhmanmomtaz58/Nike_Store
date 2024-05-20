package com.momtaz.nikestore.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.momtaz.nikestore.R
import com.momtaz.nikestore.model.BestSeller
import com.momtaz.nikestore.Activity.productDetails

class BestSellerRecyclerAdaptor(var context: Context,val bestList:ArrayList<BestSeller>):
    RecyclerView.Adapter<BestSellerRecyclerAdaptor.BestSellerViewHolder>(){
    class BestSellerViewHolder(itemView: View):RecyclerView.ViewHolder(itemView),
    View.OnClickListener{
        val linearLayoutBestSeller:LinearLayout=itemView.findViewById(R.id.best_seller)
        var itemImage:ImageView=itemView.findViewById(R.id.imageBest)
        var itemName:TextView=itemView.findViewById(R.id.nameBest)
        var price:TextView  =itemView.findViewById(R.id.priceBest)
        var rating:TextView=itemView.findViewById(R.id.rating)
        override fun onClick(v: View?) {
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BestSellerViewHolder {
        val view:View
        val inflater:LayoutInflater=LayoutInflater.from(context)
        view=inflater.inflate(R.layout.best_seller_recycler_item,parent,false)
        val viewHolder:BestSellerViewHolder= BestSellerViewHolder(view)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return bestList.size
    }

    override fun onBindViewHolder(holder: BestSellerViewHolder, position: Int) {
        holder.itemName.text=bestList[position].name
        holder.price.text=bestList[position].price
        holder.rating.text=bestList[position].rating
        Glide.with(context).load(bestList[position].imageUrl).into(holder.itemImage)

        holder.itemView.setOnClickListener {
            val intent =Intent(context, productDetails::class.java)
            intent.putExtra("name",bestList[position].name)
            intent.putExtra("rating",bestList[position].rating)
            intent.putExtra("price",bestList[position].price)
            intent.putExtra("image",bestList[position].imageUrl)
            context.startActivity(intent)
        }

    }

}
