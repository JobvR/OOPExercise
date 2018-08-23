package com.example.jvanruiten.oopexercise.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jvanruiten.oopexercise.R;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    public ArrayList<String> names = new ArrayList<>();
    public ArrayList<String> breeds = new ArrayList<>();
    public ArrayList<String> colors = new ArrayList<>();
    public ArrayList<Integer> heights = new ArrayList<>();

    public RecyclerViewAdapter(ArrayList<String> names, ArrayList<String> breeds, ArrayList<String> colors, ArrayList<Integer> heights) {
        this.names = names;
        this.breeds = breeds;
        this.colors = colors;
        this.heights = heights;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int position) {

        viewHolder.textViewName.setText(names.get(position));
        viewHolder.textViewBreed.setText(breeds.get(position));
        viewHolder.textViewColor.setText(colors.get(position));
        viewHolder.textViewHeight.setText(heights.get(position).toString());
    }

    @Override
    public int getItemCount() {
        return names.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView textViewName;
        TextView textViewBreed;
        TextView textViewColor;
        TextView textViewHeight;
        LinearLayout list_layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            textViewName = itemView.findViewById(R.id.textViewName);
            textViewBreed = itemView.findViewById(R.id.textViewBreed);
            textViewColor = itemView.findViewById(R.id.textViewColor);
            textViewHeight = itemView.findViewById(R.id.textViewHeight);
            list_layout = itemView.findViewById(R.id.list_layout);
        }
    }
}