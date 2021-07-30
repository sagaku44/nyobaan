package com.bimbel.alnabil;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.bimbel.alnabil.level1.Level1;
import com.bimbel.alnabil.level2.Level2;

public class ActivitLevel extends AppCompatActivity {

    private ImageView lev1;
    private ImageView lev2;
    private lazim lzm = new lazim();
    private MediaPlayer mMediaPlayer;
    private boolean sound = true;
    private int xTouch = 0, xClickOffset = 0, xOffset = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_activit_level);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        lev1 = (ImageView) findViewById(R.id.level1);
        lev2 = (ImageView) findViewById(R.id.level2);
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            onBackPressed();

            //moveTaskToBack(false);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void Level1(View view)
    {
        level1(0);
        Intent intent = new Intent(ActivitLevel.this, Level1.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lev1.startAnimation(animasihuruf2);
    }

    public void Level2(View view)
    {
        level2(0);
        Intent intent = new Intent(ActivitLevel.this, Level2.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lev2.startAnimation(animasihuruf2);
    }

    @Override
    public void onBackPressed() {
        new AlertDialog.Builder(this)
                .setIcon(R.mipmap.ic_launcher)
                .setTitle(R.string.app_name)
                .setMessage("Kamu yakin ingin keluar?")
                .setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        finish();
                    }
                })
                .setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        dialog.cancel();
                    }
                })
                .show();
    }

    public void level1(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(ActivitLevel.this, lzm.level1[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }

    public void level2(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(ActivitLevel.this, lzm.level2[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }
}