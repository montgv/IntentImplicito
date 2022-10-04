package com.example.intentimplicito;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.intentimplicito.databinding.ActivitySegundoBinding;

public class SegundoActivity extends AppCompatActivity {

    private ActivitySegundoBinding binding2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding2 = ActivitySegundoBinding.inflate(getLayoutInflater());
        setContentView(binding2.getRoot());
    }
}