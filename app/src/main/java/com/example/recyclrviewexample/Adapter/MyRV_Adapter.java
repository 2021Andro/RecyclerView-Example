package com.example.recyclrviewexample.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclrviewexample.CostumeClasses.DemoProduct;
import com.example.recyclrviewexample.Interfaces.MyRVEvent;
import com.example.recyclrviewexample.R;

import java.util.ArrayList;

import de.hdodenhof.circleimageview.CircleImageView;

public class MyRV_Adapter extends RecyclerView.Adapter<MyRV_Adapter.MyViewHolder> {

    private ArrayList<DemoProduct> productList;
    private MyRVEvent myRVEvent;

    public MyRV_Adapter(Context context, ArrayList<DemoProduct> productList)
    {
        this.myRVEvent = (MyRVEvent) context;
        this.productList = productList;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.my_rv_a_layout, parent, false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return productList.size();
    }


    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView tvId, tvName, tvAge, tvPrice;
        private CircleImageView productImage;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {



                }
            });
        }
    }
}
