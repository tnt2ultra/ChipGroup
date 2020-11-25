package com.example.chipgroup;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chipgroup.databinding.ActivityChoiceChipBinding;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;

public class ChoiceChip extends AppCompatActivity {
    ActivityChoiceChipBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityChoiceChipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        for (int i = 1; i < 15; i++) {

            Chip chip = new Chip(this);

            ChipDrawable chipDrawable = ChipDrawable.createFromAttributes(this, null, 0,
                    R.style.Widget_MaterialComponents_Chip_Choice);

            chip.setChipDrawable(chipDrawable);

            chip.setPadding(10, 10, 10, 10);
            chip.setText("Option :" + i);

            binding.chipgroup2.addView(chip);
        }
    }
}
