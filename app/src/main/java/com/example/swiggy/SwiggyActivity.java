package com.example.swiggy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class SwiggyActivity extends AppCompatActivity {
    RecyclerView swiggyRv;
    SwiggyItems [] swiggyItems;
    SwiggyAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_swiggy);
        initViews();
        createData();
        setUpAdapter();
        connectAdapter();
    }

    private void initViews() {
        swiggyRv = findViewById(R.id.swiggy_rv);

    }

    private void connectAdapter() {
        swiggyRv.setLayoutManager(new LinearLayoutManager(this));
        swiggyRv.setAdapter(adapter);
    }

    private void setUpAdapter() {
        adapter = new SwiggyAdapter(swiggyItems);
    }

    private void createData() {
        swiggyItems  = new SwiggyItems[7];
        SwiggyItems item1 = new SwiggyItems();
        item1.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item1.item = "Silvia";
        item1.rate = "4.5";
        item1.foodStyle  = "ppl keep sa";
        item1.time = "12min";
        item1.discount  = "40%";
        swiggyItems[0] = item1;

        SwiggyItems item2 = new SwiggyItems();
        item2.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item2.item = "Silvia";
        item2.rate = "4.2";
        item2.foodStyle  = "ppl keep sa";
        item2.time = "15min";
        item2.discount  = "15%";
        swiggyItems[1] = item2;

        SwiggyItems item3 = new SwiggyItems();
        item3.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item3.item = "Silvia";
        item3.rate = "4.1";
        item3.foodStyle  = "ppl keep sa";
        item3.time = "11min";
        item3.discount  = "60%";
        swiggyItems[2] = item3;

        SwiggyItems item4 = new SwiggyItems();
        item4.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item4.item = "Silvia";
        item4.rate = "4.0";
        item4.foodStyle  = "ppl keep sa";
        item4.time = "19min";
        item4.discount  = "50%";
        swiggyItems[3] = item4;

        SwiggyItems item5 = new SwiggyItems();
        item5.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item5.item = "Silvia";
        item5.rate = "4.6";
        item5.foodStyle  = "ppl keep sa";
        item5.time = "22min";
        item5.discount  = "40%";
        swiggyItems[4] = item5;

        SwiggyItems item6 = new SwiggyItems();
        item6.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item6.item = "Silvia";
        item6.rate = "4.3";
        item6.foodStyle  = "ppl keep sa";
        item6.time = "32min";
        item6.discount  = "10%";
        swiggyItems[5] = item6;

        SwiggyItems item7 = new SwiggyItems();
        item7.poster = "https://food-guide.canada.ca/sites/default/files/styles/fgk_image_large/public/2022-02/Mapo%20Tofu%20with%20Chicken.jpg";
        item7.item = "Silvia";
        item7.rate = "4.2";
        item7.foodStyle  = "ppl keep sa";
        item7.time = "22min";
        item7.discount  = "20%";
        swiggyItems[6] = item7;



    }
    }
