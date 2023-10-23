package com.example.abubakir_turakulov_hw_4_3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.abubakir_turakulov_hw_4_3.databinding.ActivityMainBinding;
import com.example.abubakir_turakulov_hw_4_3.fragments.ContinentFragment;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getSupportFragmentManager().beginTransaction().add(R.id.container, new ContinentFragment()).commit();
    }
}