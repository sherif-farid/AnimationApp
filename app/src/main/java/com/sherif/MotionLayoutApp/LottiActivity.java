package com.sherif.MotionLayoutApp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.SeekBar;

import com.sherif.MotionLayoutApp.databinding.ActivityLottiBinding;

public class LottiActivity extends AppCompatActivity implements SeekBar.OnSeekBarChangeListener {
   private ActivityLottiBinding binding ;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityLottiBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        binding.seekBar.setOnSeekBarChangeListener(this);

    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
     binding.animationView.setProgress((float) progress / 100);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }
}