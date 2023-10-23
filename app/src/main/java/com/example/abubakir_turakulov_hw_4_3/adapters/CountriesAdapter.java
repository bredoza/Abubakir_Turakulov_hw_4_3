package com.example.abubakir_turakulov_hw_4_3.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.abubakir_turakulov_hw_4_3.models.Country;
import com.example.abubakir_turakulov_hw_4_3.R;

import java.util.ArrayList;

public class CountriesAdapter extends RecyclerView.Adapter<CountriesViewHolder> {

    private final ArrayList<Country> countryList;

    public CountriesAdapter(ArrayList<Country> countryList) {
        this.countryList = countryList;
    }

    @NonNull
    @Override
    public CountriesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountriesViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountriesViewHolder holder, int position) {
        Country country = countryList.get(position);
        holder.onBind(country);
    }

    @Override
    public int getItemCount() {
        return countryList.size();
    }
}

class CountriesViewHolder extends RecyclerView.ViewHolder {
    private final ImageView ivCountryFlag;
    private final TextView tvCountryName;

    public CountriesViewHolder(@NonNull View itemView) {
        super(itemView);
        ivCountryFlag = itemView.findViewById(R.id.iv_country);
        tvCountryName = itemView.findViewById(R.id.tv_country);
    }

    public void onBind(Country country) {
        tvCountryName.setText(country.getName());
        Glide.with(itemView.getContext()).load(country.getFlagImageUrl()).into(ivCountryFlag);
    }
}