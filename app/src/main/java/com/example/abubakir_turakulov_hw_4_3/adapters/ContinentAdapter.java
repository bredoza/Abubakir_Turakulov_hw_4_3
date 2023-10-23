package com.example.abubakir_turakulov_hw_4_3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;
import com.example.abubakir_turakulov_hw_4_3.models.Continent;
import com.example.abubakir_turakulov_hw_4_3.R;
import java.util.ArrayList;

public class ContinentAdapter extends RecyclerView.Adapter<ContinentViewHolder> {

    private final ArrayList<Continent> continentList;
    private final OnItemClickListener listener;

    public ContinentAdapter(ArrayList<Continent> continentList, OnItemClickListener listener) {
        this.continentList = continentList;
        this.listener = listener;
    }

    @NonNull
    @Override
    public ContinentViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_continent, parent, false);
        return new ContinentViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContinentViewHolder holder, int position) {
        final Continent continent = continentList.get(position);
        holder.onBind(continent, listener);
    }

    @Override
    public int getItemCount() {
        return continentList.size();
    }

    public interface OnItemClickListener {
        void onItemClick(Continent continent);
    }
}

class ContinentViewHolder extends RecyclerView.ViewHolder {
    private final ImageView ivIcon;
    private final TextView tvName;

    public ContinentViewHolder(@NonNull View itemView) {
        super(itemView);
        ivIcon = itemView.findViewById(R.id.iv_continent);
        tvName = itemView.findViewById(R.id.tv_continent);
    }

    public void onBind(Continent continent, ContinentAdapter.OnItemClickListener listener) {
        tvName.setText(continent.getName());
        Glide.with(itemView.getContext()).load(continent.getImage()).into(ivIcon);
        itemView.setOnClickListener(view -> listener.onItemClick(continent));
    }
}