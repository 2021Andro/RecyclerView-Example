package com.example.recyclrviewexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.recyclrviewexample.Adapter.MyRV_Adapter;
import com.example.recyclrviewexample.CostumeClasses.DemoProduct;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView rvList;
    private RecyclerView.LayoutManager layoutManager;
    private ArrayList<DemoProduct> demoList;
    private MyRV_Adapter myRVAdapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rvList = findViewById(R.id.rvList);

        demoList = new ArrayList<>();

        myRVAdapter = new MyRV_Adapter(this, demoList);

        layoutManager = new LinearLayoutManager(this);

        rvList.setLayoutManager(layoutManager);

        rvList.setAdapter(myRVAdapter);

        DemoProduct product = new DemoProduct("1", "Motorcycle", "4", "37000");

        demoList.add(product);


    }
}