package com.example.chipgroup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CompoundButton;

import androidx.appcompat.app.AppCompatActivity;

import com.example.chipgroup.databinding.ActivityFliterChipBinding;

import java.util.ArrayList;

public class FilterChip extends AppCompatActivity {
    ActivityFliterChipBinding binding;
    private ArrayList<String> selectedChipData = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFliterChipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        CompoundButton.OnCheckedChangeListener checkedChangeListener = (compoundButton, isChecked) -> {
            if (isChecked) {
                selectedChipData.add(compoundButton.getText().toString());
            } else {
                selectedChipData.remove(compoundButton.getText().toString());
            }
        };

        binding.trending.setOnCheckedChangeListener(checkedChangeListener);
        binding.newarrival.setOnCheckedChangeListener(checkedChangeListener);
        binding.bestselling.setOnCheckedChangeListener(checkedChangeListener);
        binding.lowtohigh.setOnCheckedChangeListener(checkedChangeListener);
        binding.hightolow.setOnCheckedChangeListener(checkedChangeListener);

        binding.buttonSubmit.setOnClickListener(view -> {
            Intent intent = new Intent();
            intent.putExtra("data", selectedChipData.toString());
            setResult(101, intent);
            finish();
        });

    }
}
