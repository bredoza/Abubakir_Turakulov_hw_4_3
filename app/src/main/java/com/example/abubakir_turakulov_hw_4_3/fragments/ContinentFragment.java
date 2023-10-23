package com.example.abubakir_turakulov_hw_4_3.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abubakir_turakulov_hw_4_3.models.Continent;
import com.example.abubakir_turakulov_hw_4_3.R;
import com.example.abubakir_turakulov_hw_4_3.adapters.ContinentAdapter;

import java.util.ArrayList;

public class ContinentFragment extends Fragment {

    private final ArrayList<Continent> continentList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_continent, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        RecyclerView recyclerView = view.findViewById(R.id.rv_continent);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        loadData();

        ContinentAdapter continentAdapter = new ContinentAdapter(continentList, continent -> {
            Bundle bundle = new Bundle();
            bundle.putSerializable("continent", continent);
            CountriesFragment countriesFragment = new CountriesFragment();
            countriesFragment.setArguments(bundle);
            requireActivity().getSupportFragmentManager().beginTransaction()
                    .replace(R.id.container, countriesFragment)
                    .addToBackStack(null)
                    .commit();
        });

        recyclerView.setAdapter(continentAdapter);
    }

    private void loadData() {
        continentList.clear();

        continentList.add(new Continent("North America", "https://cdn.discordapp.com/attachments/1164267593268473877/1166014633811906620/CNA.png?ex=6548f2c0&is=65367dc0&hm=6653a7c30d9b70d0bfe94921cb1739f66d56d025d80a4ea52c33bbd6d7dbdaac&"));
        continentList.add(new Continent("South America", "https://cdn.discordapp.com/attachments/1164267593268473877/1166014633530900581/CSA.png?ex=6548f2c0&is=65367dc0&hm=27bc7c88c6bc23ee7362569c0937e0a42cd02dab63c8d5d72ba1b2364b34e497&"));
        continentList.add(new Continent("Africa", "https://cdn.discordapp.com/attachments/1164267593268473877/1166014633040162917/CAF.png?ex=6548f2c0&is=65367dc0&hm=4896b0f9250611f49eb138806fb4694e10c48815498c0d98031c34a0a6d976a2&"));
        continentList.add(new Continent("Eurasia", "https://cdn.discordapp.com/attachments/1164267593268473877/1166014634050990110/CAS.png?ex=6548f2c0&is=65367dc0&hm=f13d9e6f41c66c4cde305fedd49853764d7ac192eb8b225cb90362ef1829c302&"));
        continentList.add(new Continent("Australia", "https://cdn.discordapp.com/attachments/1164267593268473877/1166014933268435134/COC.png?ex=6548f307&is=65367e07&hm=bec3601ed9bfb32610784e93233d14fd981afdac3085fc769f37d4d62c9841cc&"));
    }
}