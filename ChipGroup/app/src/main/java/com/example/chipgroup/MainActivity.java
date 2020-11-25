package com.example.chipgroup;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chipgroup.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.buttonInputChip.setOnClickListener(view -> goActivity(InputChip.class));
        binding.buttonFilterChip.setOnClickListener(view -> goActivity(FloatingActionBarFilterChip.class));
        binding.buttonChoiceChip.setOnClickListener(view -> goActivity(ChoiceChip.class));
        binding.buttonActionChip.setOnClickListener(view -> goActivity(ActionChip.class));
    }

    private void goActivity(Class chipClass) {
        startActivity(new Intent(MainActivity.this, chipClass));
    }
}
