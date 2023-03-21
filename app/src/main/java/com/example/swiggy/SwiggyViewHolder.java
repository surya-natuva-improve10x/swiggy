package com.example.swiggy;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class SwiggyViewHolder extends RecyclerView.ViewHolder {
    public TextView itemTxt;
    public TextView rateTxt;
    public TextView foodStyleTxt;
    public TextView timeTxt;
    public TextView discountTxt;
    public ImageView swiggyIv;
    public SwiggyViewHolder(@NonNull View itemView) {
        super(itemView);
        itemTxt = itemView.findViewById(R.id.item_name_txt);
        rateTxt = itemView.findViewById(R.id.rating_txt);
        foodStyleTxt = itemView.findViewById(R.id.style_txt);
        timeTxt = itemView.findViewById(R.id.mins_txt);
        discountTxt = itemView.findViewById(R.id.discount_txt);
        swiggyIv = itemView.findViewById(R.id.swiggy_iv);
    }
}
