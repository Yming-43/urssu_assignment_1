package com.example.urssu_assignment_1;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder>
{
    private ArrayList<RecyclerItem> list;
    private Context context;

    public RecyclerViewAdapter( ArrayList<RecyclerItem> list, Context context)
    {
        this.list = list;
        this.context = context;
    }

    @NonNull
    @Override
    public RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View cardView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item, parent, false);
        RecyclerViewHolder holder = new RecyclerViewHolder(cardView);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewHolder holder, int position)
    {
        RecyclerItem itemPosition = list.get(position);

        holder.flist_tv_name.setText(itemPosition.getName());
        holder.flist_tv_phonenumber.setText(itemPosition.getPhonenumber());

    }

    @Override
    public int getItemCount()
    {
        return (list !=null ? list.size():0);
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder
    {
        TextView flist_tv_name;
        TextView flist_tv_phonenumber;

        public RecyclerViewHolder(View view)
        {
            super(view);

            this.flist_tv_name = view.findViewById(R.id.flist_tv_name);
            this.flist_tv_phonenumber = view.findViewById(R.id.flist_tv_phonenumber);
        }

    }

}
