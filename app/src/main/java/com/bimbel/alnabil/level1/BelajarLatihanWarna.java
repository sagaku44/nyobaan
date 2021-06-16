package com.bimbel.alnabil.level1;

import android.content.Intent;

import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

import androidx.appcompat.app.AppCompatActivity;

import com.bimbel.alnabil.MainActivity;
import com.bimbel.alnabil.MengenalWarna;
import com.bimbel.alnabil.R;


public class BelajarLatihanWarna extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_latihan_warna);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
    }

    public void bukabelajarwarna(View view) {
        Intent intent = new Intent(BelajarLatihanWarna.this, MengenalWarna.class);
        startActivity(intent);
        finish();
    }
    /*
        public void bukalatihanwarna(View vew) {
            Intent intent = new Intent(BelajarLatihanWarna.this, KuisWarna.class);
            startActivity(intent);
            finish();
        }*/
    public void kembali (View view){
        Intent intent = new Intent (BelajarLatihanWarna.this, MainActivity.class);
        startActivity(intent);
        finish();
    }
}
