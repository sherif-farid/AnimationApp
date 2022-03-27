package com.sherif.MotionLayoutApp;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.SeekBar;

import androidx.appcompat.app.AppCompatActivity;

import com.sherif.MotionLayoutApp.databinding.ActivityMainBinding;


public class MainActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
    private ActivityMainBinding binding;
    private String TAG = "MainActivityTag";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        getWindow().setStatusBarColor(Color.TRANSPARENT);
        binding.seekBar.setOnSeekBarChangeListener(this);
//        submit();
//        showInfo();
    }



    public void submit() {
        Intent intent = new Intent(this , LottiActivity.class);
        startActivity(intent);
    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        binding.motionLayout.setProgress((float) progress / 100);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    public void submit(View view) {
        submit();
    }
}