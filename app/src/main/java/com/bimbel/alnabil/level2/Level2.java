package com.bimbel.alnabil.level2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.media.MediaPlayer;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bimbel.alnabil.ActivitLevel;
import com.bimbel.alnabil.R;
import com.bimbel.alnabil.lazim;

public class Level2 extends AppCompatActivity {
    private lazim lzm = new lazim();
    private Button lvl1;
    private Button lvl2;
    private Button lvl3,membacaduasukukata;
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
        setContentView(R.layout.activity_lev2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        lvl1 = (Button) findViewById(R.id.button1);
        lvl2 = (Button) findViewById(R.id.button2);
        lvl3 = (Button) findViewById(R.id.button3);
        homes = (ImageView) findViewById(R.id.home);


    }


    public void Homes(View view)
    {
        Intent intent = new Intent(Level2.this, ActivitLevel.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        homes.startAnimation(animasihuruf2);
    }

    //untuk membuka aactivity
    public void duasukukata(View view)
    {
        player4(0);
        Intent intent = new Intent(Level2.this, lev2Membaca2SukuKata.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl1.startAnimation(animasihuruf2);

    }
    ///////////////
    public void polaaiueo(View view)
    {
        player5(0);
        Intent intent = new Intent(Level2.this, Lev2MembacaDenganPola.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl2.startAnimation(animasihuruf2);
    }
    public void angka510(View view)
    {
        player6(0);
        Intent intent = new Intent(Level2.this, Lev2MengenalAngka510.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl3.startAnimation(animasihuruf2);
    }
    public void player4(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Level2.this, lzm.membacankonsonandengana[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }

    public void player5(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Level2.this, lzm.membacapola[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }

    public void player6(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Level2.this, lzm.belajarangka610[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }

}