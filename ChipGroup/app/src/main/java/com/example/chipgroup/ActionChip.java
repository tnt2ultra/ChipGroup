package com.example.chipgroup;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chipgroup.databinding.ActivityActionChipBinding;

public class ActionChip extends AppCompatActivity {
    ActivityActionChipBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityActionChipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.chip.setOnClickListener(view ->
                Toast.makeText(ActionChip.this, "Action Chip Clicked", Toast.LENGTH_SHORT).show());
    }
}
