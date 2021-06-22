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

public class Lev2MembacaSemuaPola extends Activity {
    private int b = 0;
    private int a = 0;
    private lazim lzm = new lazim();
    private lazim kata = new lazim();
    private ImageView btgb;
    private ImageButton bca;
    private ImageButton bci;
    private ImageButton bcu;
    private ImageButton bce;
    private ImageButton bco;
    private ImageButton menu;
    private ImageButton home;
    private MediaPlayer mMediaPlayer;
    private boolean sound = true;
    private int xTouch = 0, xClickOffset = 0, xOffset = 0;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_belajar_bacaall);
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
        home = (ImageButton) findViewById(R.id.bt5);

        bca = (ImageButton) findViewById(R.id.kataa);
        bcu = (ImageButton) findViewById(R.id.katai);
        bci = (ImageButton) findViewById(R.id.katau);
        bce = (ImageButton) findViewById(R.id.katae);
        bco = (ImageButton) findViewById(R.id.katao);

        bca.setBackgroundResource(lzm.gambaralfabet[0]);
        bcu.setBackgroundResource(lzm.gambaralfabet[1]);
        bci.setBackgroundResource(lzm.gambaralfabet[2]);
        bce.setBackgroundResource(lzm.gambaralfabet[3]);
        bco.setBackgroundResource(lzm.gambaralfabet[4]);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        bca.startAnimation(animasihuruf2);
        bcu.startAnimation(animasihuruf2);
        bci.startAnimation(animasihuruf2);
        bce.startAnimation(animasihuruf2);
        bco.startAnimation(animasihuruf2);
        home.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {

                Intent Intent = new Intent(Lev2MembacaSemuaPola.this, Level2.class);
                startActivity(Intent);

            }
        });

        bca.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bca.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player3(0);
                    }
                }
                return true;

            }

        });
        bci.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bci.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player3(1);
                    }
                }
                return true;

            }

        });
        bcu.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bcu.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player3(2);
                    }
                }
                return true;

            }

        });
        bce.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bce.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player3(3);
                    }
                }
                return true;

            }

        });
        bco.setOnTouchListener(new ImageButton.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                    final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
                    bco.startAnimation(animasihuruf2);

                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX()-xClickOffset<40 && event.getX()-xClickOffset>-40) {
                        player3(4);
                    }
                }
                return true;

            }

        });
    }
    public void btgambar(View view)
    {
        Intent intent = new Intent(Lev2MembacaSemuaPola.this, Lev2MembacaDenganPola.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        btgb.startAnimation(animasihuruf2);
    }

    public void player3(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Lev2MembacaSemuaPola.this, lzm.musiksaya2[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }


}
