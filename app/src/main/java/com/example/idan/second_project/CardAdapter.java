package com.example.idan.second_project;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by idan on 09/03/2016.
 */
public class CardAdapter extends RecyclerView.Adapter<CardAdapter.ViewHolder> {

    public CardAdapter() {
        super();
        allItems = new ArrayList<RealItem>();

        RealItem real_item = new RealItem();
        real_item.setName("Name+Lastname");
        real_item.setPlayer(R.mipmap.ic_launcher);
        allItems.add(real_item);

        real_item = new RealItem();
        real_item.setName("Name2+Lastname2");
        real_item.setPlayer(R.mipmap.ic_launcher);
        allItems.add(real_item);

        real_item = new RealItem();
        real_item.setName("Name3+Lastname3");
        real_item.setPlayer(R.mipmap.ic_launcher);
        allItems.add(real_item);

        real_item = new RealItem();
        real_item.setName("Name3+Lastname3");
        real_item.setPlayer(R.mipmap.ic_launcher);
        allItems.add(real_item);
    }

    List<RealItem> allItems;

    @Override
    public CardAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.rec_view_card_item, parent, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(CardAdapter.ViewHolder holder, int position) {
        RealItem ri = allItems.get(position);
        holder.iv.setImageResource(ri.getPlayer());
        holder.tv.setText(ri.getName());
    }

    @Override
    public int getItemCount() {
        return allItems.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView iv;
        public TextView tv;


        public ViewHolder(View itemView) {
            super(itemView);
            iv = (ImageView) itemView.findViewById(R.id.small_image);
            tv = (TextView) itemView.findViewById(R.id.name);
        }
    }
}
