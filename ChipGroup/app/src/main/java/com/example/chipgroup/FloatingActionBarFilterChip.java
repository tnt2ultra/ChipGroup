package com.example.chipgroup;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.example.chipgroup.databinding.ActivityFloatingActionBarFilterChipBinding;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class FloatingActionBarFilterChip extends AppCompatActivity {
    ActivityFloatingActionBarFilterChipBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityFloatingActionBarFilterChipBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(view -> {
            Intent intent = new Intent(FloatingActionBarFilterChip.this, FilterChip.class);
            startActivityForResult(intent, 101);
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (resultCode == 101) {
            TextView textView = findViewById(R.id.textview_first);
            textView.setText(data.getStringExtra("data"));
        }
    }
}
