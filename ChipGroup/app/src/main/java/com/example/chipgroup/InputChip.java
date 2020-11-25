package com.example.chipgroup;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chipgroup.databinding.ActivityInputChipBinding;
import com.google.android.material.chip.Chip;
import com.google.android.material.chip.ChipDrawable;

public class InputChip extends AppCompatActivity {
    ActivityInputChipBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityInputChipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }

    public void btn_click(View view) {

        final Chip chip = new Chip(this);

        ChipDrawable chipDrawable = ChipDrawable.createFromAttributes(this, null,
                0, R.style.Widget_MaterialComponents_Chip_Entry);

        chip.setChipDrawable(chipDrawable);
        chip.setCheckable(false);
        chip.setClickable(false);
        chip.setChipIconResource(R.drawable.ic_location_on_black_24dp);
        chip.setIconStartPadding(3f);
        chip.setPadding(60, 10, 60, 10);
        chip.setText(binding.editText.getText().toString());
        chip.setOnCloseIconClickListener(view1 -> binding.chipGroup.removeView(chip));

        binding.chipGroup.addView(chip);
        binding.editText.setText("");

    }
}
