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

public class MenuAwal extends AppCompatActivity {

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
    }

    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            exitByBackKey();

            //moveTaskToBack(false);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    //untuk membuka aactivity
    public void BelajarBaca(View view)
    {
        Intent intent = new Intent(MenuAwal.this, com.bimbel.alnabil.menu.BelajarBaca.class);
        startActivity(intent);
    }
    ///////////////
    public void BelajarHitung(View view)
    {
        Intent intent = new Intent(MenuAwal.this, com.bimbel.alnabil.menu.BelajarHitung.class);
        startActivity(intent);
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
    protected void exitByBackKey() {

        AlertDialog alertbox = new AlertDialog.Builder(this)
                .setMessage("Ingin keluar dari Aplikasi?")
                .setPositiveButton("YA", new DialogInterface.OnClickListener() {
                    //membuat tombol pilihan
                    // do something when the button is clicked
                    public void onClick(DialogInterface arg0, int arg1) {

                        finish();
                        //close();
                        //tutup


                    }
                })
                .setNegativeButton("TIDAK", new DialogInterface.OnClickListener() {

                    // do something when the button is clicked
                    //saat tombol di klik
                    public void onClick(DialogInterface arg0, int arg1) {
                    }
                })
                .show();

    }
}
