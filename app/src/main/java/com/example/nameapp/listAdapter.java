package com.example.nameapp;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by sebas on 19.01.2017.
 */

public class listAdapter extends RecyclerView.Adapter<listAdapter.ViewHolder>{
    private ArrayList<String> names;
    private Context context;

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public TextView name;
        public ViewHolder(View v){
            super(v);
            name = (TextView) itemView.findViewById(R.id.name);
        }
    }

    public listAdapter(Context context, ArrayList<String> names){
        this.names = names;
        this.context = context;
    }

    @Override
    public listAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);

        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position){
        holder.name.setText(names.get(position));
    }

    @Override
    public int getItemCount(){
        return names.size();
    }
}
