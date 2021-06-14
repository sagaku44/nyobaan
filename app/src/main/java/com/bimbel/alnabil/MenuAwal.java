package com.bimbel.alnabil;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageButton;

public class MenuAwal extends AppCompatActivity {
    private Button lvl1;
    private Button lvl2;
    private Button lvl3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try
        {
            this.getSupportActionBar().hide();
        }
        catch (NullPointerException e){}
        setContentView(R.layout.activity_menu_awal);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        lvl1 = (Button) findViewById(R.id.button1);
        lvl2 = (Button) findViewById(R.id.button2);
        lvl3 = (Button) findViewById(R.id.button3);
    }


    public void Homes(View view)
    {
        Intent intent = new Intent(MenuAwal.this, ActivitLevel.class);
        startActivity(intent);
    }

    //untuk membuka aactivity
    public void BelajarBaca(View view)
    {
        Intent intent = new Intent(MenuAwal.this, com.bimbel.alnabil.menu.BelajarBaca.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl1.startAnimation(animasihuruf2);

    }
    ///////////////
    public void BelajarHitung(View view)
    {
        Intent intent = new Intent(MenuAwal.this, com.bimbel.alnabil.menu.BelajarHitung.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl2.startAnimation(animasihuruf2);
    }
    public void BelajarSatukata(View view)
    {
        Intent intent = new Intent(MenuAwal.this, com.bimbel.alnabil.menu.Belajarsatukata.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lvl3.startAnimation(animasihuruf2);
    }
    public void BelajarLatihanWarna(View view){
        Intent intent = new Intent(MenuAwal.this, com.bimbel.alnabil.menu.BelajarLatihanWarna.class);
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
