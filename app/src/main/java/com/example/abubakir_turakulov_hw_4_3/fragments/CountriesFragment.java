package com.example.abubakir_turakulov_hw_4_3.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.abubakir_turakulov_hw_4_3.models.Continent;
import com.example.abubakir_turakulov_hw_4_3.models.Country;
import com.example.abubakir_turakulov_hw_4_3.R;
import com.example.abubakir_turakulov_hw_4_3.adapters.CountriesAdapter;

import java.util.ArrayList;
import java.util.Objects;

public class CountriesFragment extends Fragment {

    private final ArrayList<Country> countryList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_countries, container, false);
        RecyclerView recyclerView = view.findViewById(R.id.rv_countries);
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));

        Bundle bundle = getArguments();
        if (bundle != null) {
            Continent currentContinent = (Continent) bundle.getSerializable("continent");
            loadCountriesData(Objects.requireNonNull(currentContinent));
        }

        CountriesAdapter countriesAdapter = new CountriesAdapter(countryList);
        recyclerView.setAdapter(countriesAdapter);

        return view;
    }

    private void loadCountriesData(Continent continent) {
        switch (continent.getName()) {
            case "North America":
                countryList.add(new Country("USA", "https://cdn.discordapp.com/attachments/1164267593268473877/1166041093507387454/image.png?ex=65490b64&is=65369664&hm=2ff377bbf980a27d3f88829a8858ade70750359ae5482fe79d62b0315dabf092&"));
                countryList.add(new Country("Canada", "https://cdn.discordapp.com/attachments/1164267593268473877/1166041289150701598/image.png?ex=65490b93&is=65369693&hm=35d94d7bc6a2554c762eefe3a099f4d391f4591124eb40553edbf95d67ca6017&"));
                countryList.add(new Country("Cuba", "https://cdn.discordapp.com/attachments/1164267593268473877/1166043636128034937/image.png?ex=65490dc2&is=653698c2&hm=dfe50b50ab47c4a1b43aaadf5309217a02fb44e6d0904ae1bcc0616af52e1947&"));
                countryList.add(new Country("Grenada", "https://cdn.discordapp.com/attachments/1164267593268473877/1166044158939627611/image.png?ex=65490e3f&is=6536993f&hm=80af439bad76eecbedcfc5ce858b32852fcb606f6dbbe35dbee5799d6f670005&"));
                countryList.add(new Country("Costa Rica", "https://cdn.discordapp.com/attachments/1164267593268473877/1166044519234551878/image.png?ex=65490e95&is=65369995&hm=363b3a000cb66dbdc263b33473e61b37b34ce43e3bb367c36605fa3764bb17d9&"));
                break;
            case "South America":
                countryList.add(new Country("Brazil", "https://cdn.discordapp.com/attachments/1164267593268473877/1166041613609472130/image.png?ex=65490be0&is=653696e0&hm=d9f63b52f00260f48c8d5bab79f5e26d822f94ac919a36ddb9d1b28bac2093b3&"));
                countryList.add(new Country("Argentina", "https://cdn.discordapp.com/attachments/1164267593268473877/1166041751224586250/image.png?ex=65490c01&is=65369701&hm=065750f90f13007dea249059053a19045b99f239572c7b0dc0d90322cd8ae76a&"));
                countryList.add(new Country("Peru", "https://cdn.discordapp.com/attachments/1164267593268473877/1166044876509560923/image.png?ex=65490eea&is=653699ea&hm=b99418b70472bab5b6c73ed778e27f6bc0ee46cdf675ca131e561e2806518f06&"));
                countryList.add(new Country("Chile", "https://cdn.discordapp.com/attachments/1164267593268473877/1166042771820380261/image.png?ex=65490cf4&is=653697f4&hm=b62f3d727239d3c335e4d0ed7e232b9303d4ad63e52a97bcb6bbfb6888632c6f&"));
                countryList.add(new Country("Colomba", "https://cdn.discordapp.com/attachments/1164267593268473877/1166043365977108620/image.png?ex=65490d82&is=65369882&hm=d93cd01ed4e4ace3d0cd5acce1f18116ea1facdc63d61e01c4628356e6c7ad7a&"));
                break;
            case "Africa":
                countryList.add(new Country("Libya", "https://cdn.discordapp.com/attachments/1164267593268473877/1166045414999470175/image.png?ex=65490f6b&is=65369a6b&hm=971af1151afb3abfc702e57a6e5b01cbda2d6af9b6dffcbb60934d4111929dfb&"));
                countryList.add(new Country("Egypt", "https://cdn.discordapp.com/attachments/1164267593268473877/1166045567785377843/image.png?ex=65490f8f&is=65369a8f&hm=d279a4e50eb25002974e5e3152cd89c83cc6c1636118952439dcb044dd27426e&"));
                countryList.add(new Country("Ghana", "https://cdn.discordapp.com/attachments/1164267593268473877/1166045848715669634/image.png?ex=65490fd2&is=65369ad2&hm=6097edbe052fdec7f8e1a54eaf5435e8a12f8c465ad7d0ebdffb4ea216f7cfdb&"));
                countryList.add(new Country("Niger", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046103288938547/image.png?ex=6549100f&is=65369b0f&hm=4d7f77ef3aa3191ee6f2556bc30ac6a78e986f122ad7c3204df3af0f11f4aa08&"));
                countryList.add(new Country("Morocco", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046380821848074/image.png?ex=65491051&is=65369b51&hm=86d5952601779c48cc8bd1d488fcb61a924b170ebd5ee8a4da6b2d3a252555b3&"));
                break;
            case "Eurasia":
                countryList.add(new Country("Russia", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046632828223579/image.png?ex=6549108d&is=65369b8d&hm=659409be23f99e922fffc0c55436ca24aa3babde78a6e2d761877d50e1cd02f3&"));
                countryList.add(new Country("United Kingdom", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046722573738114/image.png?ex=654910a2&is=65369ba2&hm=bb0e2725a2baf1bb53c80933e1400dd8c3c77cb1e07b9b2f1cd1d7b1155fe4f5&"));
                countryList.add(new Country("Germany", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046775551983726/image.png?ex=654910af&is=65369baf&hm=bded5217fb681874509a6c69f9eb7a4eb57875c05f7e7b972c897142df98cbdf&"));
                countryList.add(new Country("Italy", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046859563892926/image.png?ex=654910c3&is=65369bc3&hm=c6edc02f92b7178d205d6dcd9183f5de17adc7ec9b7349951c5c5547306ceb66&"));
                countryList.add(new Country("Japan", "https://cdn.discordapp.com/attachments/1164267593268473877/1166046889569955890/image.png?ex=654910ca&is=65369bca&hm=3d603fdae373792dda65eca68e5c640754cb2db2fd2822a346b42eee44b68cd3&"));
                break;
            case "Australia":
                countryList.add(new Country("New Zealand", "https://cdn.discordapp.com/attachments/1164267593268473877/1166048335916969994/image.png?ex=65491223&is=65369d23&hm=49307b4cb2db1c292e9d575bb8eccedc4cceea511faa982d1f88bc0c99369ea7&"));
                countryList.add(new Country("French Polynesia", "https://cdn.discordapp.com/attachments/1164267593268473877/1166047964549103777/image.png?ex=654911ca&is=65369cca&hm=4b25555356414ff2bf83c6f651240cdee47b6d752e3d1070d7de1880bba71bc3&"));
                countryList.add(new Country("Palau", "https://cdn.discordapp.com/attachments/1164267593268473877/1166048207357358200/image.png?ex=65491204&is=65369d04&hm=bdabb1a8f6e3e6d8c63adf9c4bb266c32eb70fd41cdb554b34f96d2c0cf24b8f&"));
                countryList.add(new Country("Australia", "https://cdn.discordapp.com/attachments/1164267593268473877/1166047297696710726/image.png?ex=6549112b&is=65369c2b&hm=11dd95ee48042a75422ea1383659af17bf45f1ecb6abdf4c3403f541b7a44127&"));
                countryList.add(new Country("Papua New Guinea", "https://cdn.discordapp.com/attachments/1164267593268473877/1166048675529764994/image.png?ex=65491274&is=65369d74&hm=bc53412e9b11a112a7ea770a7aa92293df418cfdda8a668cf7e131240f136a25&"));
                break;
        }
    }
}