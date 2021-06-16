package com.yuzumin.coconoises;

import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class Splash extends AppCompatActivity {

    boolean isLaunched;
    ConstraintLayout Layout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Layout=findViewById(R.id.layout);
        isLaunched=false;




        Layout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                if(!isLaunched){
                    isLaunched=true;
                    startActivity(new Intent(Splash.this, MainActivity.class));
                    finish();
                }
                return false;
            }
        });


        Thread timer= new Thread()
        {
            public void run()
            {
                try
                {
                    //Display for 3 seconds
                    sleep(1500);
                }
                catch (InterruptedException e)
                {
                    // TODO: handle exception
                    e.printStackTrace();
                }
                finally
                {
                    if(!isLaunched){
                        isLaunched=true;
                        startActivity(new Intent(Splash.this, MainActivity.class));
                        finish();
                    }
                }
            }
        };
        timer.start();

    }
}