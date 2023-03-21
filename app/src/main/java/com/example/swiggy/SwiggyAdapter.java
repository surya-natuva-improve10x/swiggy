package com.example.swiggy;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

public class SwiggyAdapter extends RecyclerView.Adapter <SwiggyViewHolder>{
    SwiggyItems[] items;
    public SwiggyAdapter(SwiggyItems[]swiggyItems){
        items = swiggyItems;
    }
    @NonNull
    @Override
    public SwiggyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.swiggy_items,parent,false);
        SwiggyViewHolder viewHolder = new SwiggyViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull SwiggyViewHolder holder, int position) {
        SwiggyItems item1 =  items[position];
        holder.itemTxt.setText(item1.item);
        holder.rateTxt.setText(item1.rate);
        holder.foodStyleTxt.setText(item1.foodStyle);
        holder.timeTxt.setText(item1.time);
        holder.discountTxt.setText(item1.discount);
        Picasso.get().load(item1.poster).into(holder.swiggyIv);
    }

    @Override
    public int getItemCount() {
        return items.length;
    }
}
