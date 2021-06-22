package com.bimbel.alnabil.level1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

import com.bimbel.alnabil.ActivitLevel;
import com.bimbel.alnabil.R;
import com.bimbel.alnabil.lazim;

public class Level1 extends AppCompatActivity {
    private lazim lzm = new lazim();
    private Button lvl1;
    private Button lvl2;
    private Button lvl3;
    private MediaPlayer mMediaPlayer;
    private boolean sound = true;
    private int xTouch = 0, xClickOffset = 0, xOffset = 0;
    private ImageView homes;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_lev1);
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
        player1(0);
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.BelajarBaca.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl1.startAnimation(animasihuruf2);

    }
    ///////////////
    public void BelajarHitung(View view)
    {
        player2(0);
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.BelajarHitung.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl2.startAnimation(animasihuruf2);
    }
    public void BelajarSatukata(View view)
    {
        player3(0);
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.Belajarsatukata.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl3.startAnimation(animasihuruf2);
    }
    /*public void BelajarLatihanWarna(View view){
        Intent intent = new Intent(Level1.this, com.bimbel.alnabil.level1.BelajarLatihanWarna.class);
        startActivity(intent);
    }*/

    public void player1(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Level1.this, lzm.belajarhurufvokal[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }
    public void player2(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Level1.this, lzm.belajarangka15[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }
    public void player3(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Level1.this, lzm.membacasukukataterpisah[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
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
