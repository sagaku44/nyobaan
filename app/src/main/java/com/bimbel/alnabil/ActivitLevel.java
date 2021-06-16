package com.bimbel.alnabil;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.ActivityInfo;
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
            exitByBackKey();

            //moveTaskToBack(false);
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    public void Level1(View view)
    {
        Intent intent = new Intent(ActivitLevel.this, Level1.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lev1.startAnimation(animasihuruf2);
    }

    public void Level2(View view)
    {
        Intent intent = new Intent(ActivitLevel.this, Level2.class);
        startActivity(intent);
        final Animation animasihuruf2 = AnimationUtils.loadAnimation(getBaseContext(),R.anim.bounce);
        lev2.startAnimation(animasihuruf2);
    }

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