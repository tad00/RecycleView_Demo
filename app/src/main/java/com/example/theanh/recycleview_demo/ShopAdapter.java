package com.example.theanh.recycleview_demo;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>{
    ArrayList<DataShop> dtshops;
    Context context;

    public ShopAdapter(ArrayList<DataShop> dtshops, Context context) {
        this.dtshops = dtshops;
        this.context = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater layoutInflater = LayoutInflater.from(viewGroup.getContext());
        View itemview = layoutInflater.inflate(R.layout.item_row,viewGroup,false);
        return new ViewHolder(itemview);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        viewHolder.txtName.setText(dtshops.get(i).getTen());
        viewHolder.imgHinh.setImageResource(dtshops.get(i).getHinhAnh());
    }

    @Override
    public int getItemCount() {
        return dtshops.size();
    }

    public void Clickitem (int i){

    }

    public class ViewHolder extends RecyclerView.ViewHolder{
        TextView txtName;
        ImageView imgHinh;
        public ViewHolder(@NonNull final View itemView) {
            super(itemView);
            txtName = (TextView) itemView.findViewById(R.id.txtName);
            imgHinh = (ImageView) itemView.findViewById(R.id.img_hinh);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(itemView.getContext(),"Item "+txtName.getText()+ " is clicked",Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
