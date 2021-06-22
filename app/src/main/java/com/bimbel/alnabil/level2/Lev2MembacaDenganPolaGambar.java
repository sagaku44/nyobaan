package com.bimbel.alnabil.level2;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.ImageView;

import com.bimbel.alnabil.R;
import com.bimbel.alnabil.lazim;

import java.util.Random;

public class Lev2MembacaDenganPolaGambar extends Activity {
    private int b = 0;
    private int a = 0;
    private lazim lzm = new lazim();
    private lazim kata = new lazim();
    private ImageView btgb,bt;
    private ImageButton bckata1;
    private ImageButton bckata2;
    private ImageButton halighan;
    private ImageButton aldinqi;
    private ImageButton kiyinki;
    private ImageButton menu;
    private ImageButton home;
    private MediaPlayer mMediaPlayer;
    private boolean sound = true;
    private int xTouch = 0, xClickOffset = 0, xOffset = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_baca_2);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        btgb = (ImageView) findViewById(R.id.tampilgambar);

        DisplayMetrics dm = new DisplayMetrics();
        dm = this.getApplicationContext().getResources().getDisplayMetrics();
        int screenWidth = dm.widthPixels;
        int btnWidth=screenWidth/4;
        int barHeight;

        if(dm.heightPixels>1000)
        {
            barHeight=100;
        }
        else if(dm.heightPixels<1000 && dm.heightPixels>600)
        {
            barHeight=dm.heightPixels/10;
        }
        else
        {
            barHeight=64;
        }


        btnWidth=dm.widthPixels  /4;

        halighan = (ImageButton) findViewById(R.id.bt1);
        aldinqi = (ImageButton) findViewById(R.id.bt2);
        kiyinki = (ImageButton) findViewById(R.id.bt3);

        home = (ImageButton) findViewById(R.id.bt5);
        halighan.setMaxWidth(btnWidth-5);

        bckata1 = (ImageButton) findViewById(R.id.kata1);

        bckata2 = (ImageButton) findViewById(R.id.kata2);

        bckata1.setBackgroundResource(lzm.gambaralfabet[a]);
        bckata2.setBackgroundResource(lzm.gambarbacagambar[a]);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        bckata1.startAnimation(animasihuruf2);
        bckata2.startAnimation(animasihuruf2);
        home.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {

                Intent Intent = new Intent(Lev2MembacaDenganPolaGambar.this, Level2.class);
                startActivity(Intent);

            }
        });

        halighan.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {

                halighan();
                //

            }
        });


        aldinqi.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                aldigha();

            }
        });


        kiyinki.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                Next();


            }
        });

        bckata1.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bckata1.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX() - xClickOffset > 20)// onggha surulgenni
                    {
                        aldigha();
                    }
                    if (event.getX() - xClickOffset < -20)// solgha surulgenni
                    {
                        Next();
                    }
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player(a);
                    }
                }
                return true;

            }

        });
        bckata2.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bckata2.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX() - xClickOffset > 20)// onggha surulgenni
                    {
                        aldigha();
                    }
                    if (event.getX() - xClickOffset < -20)// solgha surulgenni
                    {
                        Next();
                    }
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player2(a);
                    }
                }
                return true;

            }

        });
    }
    public void btgambar(View view)
    {
        Intent intent = new Intent(Lev2MembacaDenganPolaGambar.this, com.bimbel.alnabil.level2.Lev2MembacaDenganPola.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        btgb.startAnimation(animasihuruf2);
    }
    public void btsemua(View view)
    {
        Intent intent = new Intent(Lev2MembacaDenganPolaGambar.this, com.bimbel.alnabil.level2.Lev2MembacaSemuaPola.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        bt.startAnimation(animasihuruf2);
    }

    public void Next() {
        a++;
        if (a > 4) {
            a = 0;
        }
//        imview.setBackgroundResource(lzm.gambarsaya2[a]);
        bckata1.setBackgroundResource(lzm.gambaralfabet[a]);
        bckata2.setBackgroundResource(lzm.gambarbacagambar[a]);
        final Animation animasihuruf = AnimationUtils.loadAnimation(this,R.anim.right_in);
        bckata1.startAnimation(animasihuruf);
        bckata2.startAnimation(animasihuruf);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        kiyinki.startAnimation(animasihuruf2);
        player3(a);

    }

    public void aldigha() {

        a--;
        if (a < 0) {
            a = 4;
        }
        //   imview.setBackgroundResource(lzm.gambarsaya2[a]);
        bckata1.setBackgroundResource(lzm.gambaralfabet[a]);
        bckata2.setBackgroundResource(lzm.gambarbacagambar[a]);
        final Animation animasihuruf = AnimationUtils.loadAnimation(this,R.anim.left_in);
        bckata1.startAnimation(animasihuruf);
        bckata2.startAnimation(animasihuruf);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        aldinqi.startAnimation(animasihuruf2);
        player3(a);

    }

    public void halighan() {
        int bk = 0;
        Random rndGenerator = new Random();
        bk = rndGenerator.nextInt(1);
//        imview.setBackgroundResource(lzm.gambarsaya2[bk]);
        bckata1.setBackgroundResource(lzm.gambaralfabet[bk]);
        bckata2.setBackgroundResource(lzm.gambarbacagambar[bk]);
        player3(bk);

        a = bk;
    }

    public void player(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Lev2MembacaDenganPolaGambar.this, lzm.musiksaya2[i]);
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
            mMediaPlayer = MediaPlayer.create(Lev2MembacaDenganPolaGambar.this, lzm.musikkatagambar[i]);
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
            mMediaPlayer = MediaPlayer.create(Lev2MembacaDenganPolaGambar.this, lzm.musiksaya2[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }


}
