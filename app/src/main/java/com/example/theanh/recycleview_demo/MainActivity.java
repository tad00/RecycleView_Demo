package com.example.theanh.recycleview_demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
    }
    public void initView(){
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_item);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        ArrayList<DataShop> arrayList = new ArrayList<>();
        arrayList.add(new DataShop(R.drawable.iphone,"Iphone"));
        arrayList.add(new DataShop(R.drawable.redmi,"Redmi"));
        arrayList.add(new DataShop(R.drawable.lg,"LG"));
        arrayList.add(new DataShop(R.drawable.samsung,"Samsung"));
        ShopAdapter shopAdapter = new ShopAdapter(arrayList, getApplicationContext());
        recyclerView.setAdapter(shopAdapter);
    }
}
