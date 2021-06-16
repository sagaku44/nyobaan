package com.bimbel.alnabil.level1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.bimbel.alnabil.ActivitLevel;
import com.bimbel.alnabil.R;

public class Level1 extends AppCompatActivity {
    private Button lvl1;
    private Button lvl2;
    private Button lvl3;
    private ImageView homes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_level_1);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        lvl1 = (Button) findViewById(R.id.button1);
        lvl2 = (Button) findViewById(R.id.button2);
        lvl3 = (Button) findViewById(R.id.button3);
        homes = (ImageView) findViewById(R.id.home);
    }


    public void Homes(View view)
    {
        Intent intent = new Intent(Level1.this, ActivitLevel.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        homes.startAnimation(animasihuruf2);
    }

    //untuk membuka aactivity
    public void BelajarBaca(View view)
    {
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.BelajarBaca.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl1.startAnimation(animasihuruf2);

    }
    ///////////////
    public void BelajarHitung(View view)
    {
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.BelajarHitung.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl2.startAnimation(animasihuruf2);
    }
    public void BelajarSatukata(View view)
    {
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.Belajarsatukata.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl3.startAnimation(animasihuruf2);
    }
    public void BelajarLatihanWarna(View view){
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.BelajarLatihanWarna.class);
        startActivity(intent);
    }
    /*public void bukaabout(View view){
        Intent intent = new Intent(MainActivity.this, AboutActivity.class);
        startActivity(intent);
    }
    public void bukahelp (View view){
        Intent intent = new Intent(MainActivity.this, HelpActivity.class);
        startActivity(intent);
    }
    public void bukahewan(View view){
        Intent intent = new Intent(MainActivity.this, ActivityHewan.class);
        startActivity(intent);
    }
    public void bukatransportasi(View view){
        Intent intent = new Intent (MainActivity.this, ActivityTransportasi.class);
        startActivity(intent);
    }*/

}
