package com.bimbel.alnabil.level1;

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

public class Belajarsatukata extends Activity {
    private int b = 0;
    private int a = 0;
    private lazim lzm = new lazim();
    private lazim kata = new lazim();
    private ImageView imview;
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
        setContentView(R.layout.activity_lev2_membaca2_suku_kata);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);

        DisplayMetrics dm = new DisplayMetrics();
        dm = this.getApplicationContext().getResources().getDisplayMetrics();
        int screenWidth = dm.widthPixels;
        int btnWidth=screenWidth/4;
        //RelativeLayout.LayoutParams mParam = new RelativeLayout.LayoutParams(
               // RelativeLayout.LayoutParams.FILL_PARENT,
               // RelativeLayout.LayoutParams.WRAP_CONTENT
        //);

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
        //herpHeight=dm.heightPixels/8;
        //mParam.width=btnWidth-10;
        //mParam.height=barHeight+2;
        //mParam.leftMargin=5;
        //mParam.rightMargin=5;
        halighan = (ImageButton) findViewById(R.id.bt1);
        aldinqi = (ImageButton) findViewById(R.id.bt2);
        kiyinki = (ImageButton) findViewById(R.id.bt3);

        //menu = (ImageButton) findViewById(R.id.bt4);
        home = (ImageButton) findViewById(R.id.bt5);
        halighan.setMaxWidth(btnWidth-5);

        //halighan.setLayoutParams(mParam);
        //aldinqi.setLayoutParams(mParam);
        //kiyinki.setLayoutParams(mParam);
        //menu.setLayoutParams(mParam);

        //imview = (ImageView) findViewById(R.id.imvwsan);
//        mParam=(LinearLayout.LayoutParams)imview.getLayoutParams();
        //mParam.height=(dm.heightPixels-barHeight-42) * 4/10;
//        imview.setLayoutParams(mParam);
        bckata1 = (ImageButton) findViewById(R.id.kata1);

        bckata2 = (ImageButton) findViewById(R.id.kata2);

//        imview.setBackgroundResource(lzm.gambarsaya2[a]);
        bckata1.setBackgroundResource(lzm.gambarbaca1[a]);
        bckata2.setBackgroundResource(lzm.gambarbaca2[a]);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        bckata1.startAnimation(animasihuruf2);
        bckata2.startAnimation(animasihuruf2);
        home.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {

                Intent Intent = new Intent(Belajarsatukata.this, Level1.class);
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


        /*menu.setOnClickListener(new ImageButton.OnClickListener() {
            public void onClick(View v) {
                BelajarBaca.this.openOptionsMenu();

            }
        });*/



       /* imview.setOnTouchListener(new ImageView.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
                } else if (event.getAction() == MotionEvent.ACTION_MOVE) {
                    xOffset += xTouch - (int) event.getX();
                    xTouch = (int) event.getX();
                } else if (event.getAction() == MotionEvent.ACTION_UP) {
                    if (event.getX() - xClickOffset > 40)// onggha surulgenni
                    {
                        aldigha();
                    }
                    if (event.getX() - xClickOffset < -40)// solgha surulgenni
                    {
                        Next();
                    }
                    if (event.getX()-xClickOffset<40 &&event.getX()-xClickOffset>-40)
                    {
                        player(a);
                    }

                }
                return true;
            }

        });*/

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
       /* RelativeLayout layout = new RelativeLayout(this);
        layout.setOnTouchListener(new RelativeLayout.OnTouchListener() {
            public boolean onTouch(View arg0, MotionEvent event) {
                if (event.getAction() == MotionEvent.ACTION_DOWN) {
                    xTouch = (int) event.getX();
                    xClickOffset = xTouch;
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
                    if (event.getX()== xClickOffset)
                    {
                        player(a);
                    }
                }
                return true;
            }

        }); */
    }

    public void Next() {
        a++;
        if (a > 4) {
            a = 0;
        }
//        imview.setBackgroundResource(lzm.gambarsaya2[a]);
        bckata1.setBackgroundResource(lzm.gambarbaca1[a]);
        bckata2.setBackgroundResource(lzm.gambarbaca2[a]);
        final Animation animasihuruf = AnimationUtils.loadAnimation(this,R.anim.right_in);
        bckata1.startAnimation(animasihuruf);
        bckata2.startAnimation(animasihuruf);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        kiyinki.startAnimation(animasihuruf2);
        //player3(a);

    }

    public void aldigha() {

        a--;
        if (a < 0) {
            a = 4;
        }
     //   imview.setBackgroundResource(lzm.gambarsaya2[a]);
        bckata1.setBackgroundResource(lzm.gambarbaca1[a]);
        bckata2.setBackgroundResource(lzm.gambarbaca2[a]);
        final Animation animasihuruf = AnimationUtils.loadAnimation(this,R.anim.left_in);
        bckata1.startAnimation(animasihuruf);
        bckata2.startAnimation(animasihuruf);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(this,R.anim.bounce);
        aldinqi.startAnimation(animasihuruf2);
        //player3(a);

    }

    public void halighan() {
        int bk = 0;
        Random rndGenerator = new Random();
        bk = rndGenerator.nextInt(1);
//        imview.setBackgroundResource(lzm.gambarsaya2[bk]);
        bckata1.setBackgroundResource(lzm.gambarbaca1[bk]);
        bckata2.setBackgroundResource(lzm.gambarbaca2[bk]);
        //player3(bk);

        a = bk;
    }

    public void player(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Belajarsatukata.this, lzm.musikkata1[i]);
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
            mMediaPlayer = MediaPlayer.create(Belajarsatukata.this, lzm.musikkata2[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }
    /*public void player3(int i) {
        if (sound == true) {
            if (mMediaPlayer != null) {
                mMediaPlayer.release();

            }
            mMediaPlayer = MediaPlayer.create(Belajarsatukata.this, lzm.musikkata3[i]);
            mMediaPlayer.start();
        } else if (sound == false) {
            if (mMediaPlayer != null) {

                mMediaPlayer.stop();
            }
        }
    }*/
/*
    public boolean onCreateOptionsMenu(Menu menu) {

        //menu.add(0, 1, 1, "Quiz Tebak Angka")
                //.setIcon(R.drawable.share_icon);
        menu.add(0, 2, 2, "Matikan/Hidupkan Suara").setIcon(
                R.drawable.sound);


        return super.onCreateOptionsMenu(menu);
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        if (item.getItemId() == 1) {
            Intent tallash = new Intent();
            //tallash.setClass(BelajarBaca.this, TebakAngka.class);
            Belajarsatukata.this.startActivity(tallash);

        } else if (item.getItemId() == 2) {

            if (sound == true) {

                Toast toast = new Toast(this);
                ImageView view = new ImageView(this);
                view.setImageResource(R.drawable.off);
                // toast.setGravity(Gravity.NO_GRAVITY,toast.getXOffset()/2,toast.getYOffset()/2);
                toast.setView(view);
                toast.show();
                sound = false;
            } else {
                Toast toast = new Toast(this);
                ImageView view = new ImageView(this);
                view.setImageResource(R.drawable.on);
                // toast.setGravity(Gravity.NO_GRAVITY,toast.getXOffset()/2,toast.getYOffset()/2);
                toast.setView(view);
                toast.show();
                sound = true;
            }
        }
        return true;
    }
*/

}
