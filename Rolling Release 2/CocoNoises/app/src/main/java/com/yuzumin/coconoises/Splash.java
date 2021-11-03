package com.yuzumin.coconoises;

import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Splash extends AppCompatActivity {

    boolean isLaunched;
    ConstraintLayout Layout;
    SharedPreferences sharedPref;
    SharedPreferences.Editor activation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        Layout=findViewById(R.id.layout);
        isLaunched=false;

        sharedPref =getSharedPreferences("serverActivation", MODE_PRIVATE);
        if (!sharedPref.getBoolean("isActivated", false)) {
            new AuthTask().execute();
        }


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

    protected class AuthTask extends AsyncTask<Void, Void, JSONObject>
    {
        @Override
        protected JSONObject doInBackground(Void... params)
        {

            String str="https://raw.githubusercontent.com/YuzuMin/Hololive-GEN4-Kiryu-Coco-Noises/main/Activation/VC-1.json";
            URLConnection urlConn = null;
            BufferedReader bufferedReader = null;
            try
            {
                URL url = new URL(str);
                urlConn = url.openConnection();
                bufferedReader = new BufferedReader(new InputStreamReader(urlConn.getInputStream()));

                StringBuffer stringBuffer = new StringBuffer();
                String line;
                while ((line = bufferedReader.readLine()) != null)
                {
                    stringBuffer.append(line);
                }

                return new JSONObject(stringBuffer.toString());
            }
            catch(Exception ex)
            {
                Log.e("App", "yourDataTask", ex);
                return null;
            }
            finally
            {
                if(bufferedReader != null)
                {
                    try {
                        bufferedReader.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        @Override
        protected void onPostExecute(JSONObject response)
        {
            if(response != null)
            {
                try {
                    Log.e("App", "Success: " + response.getString("isActivated") );
                    String str = response.getString("isActivated");
                    if(str.equals("true")){
                        activation = getSharedPreferences("serverActivation",MODE_PRIVATE).edit();
                        activation.putBoolean("isActivated",true);
                        activation.apply();

                        activation = getSharedPreferences("save2",MODE_PRIVATE).edit();
                        activation.putBoolean("value2",true);
                        activation.apply();
                    }

                } catch (JSONException ex) {
                    Log.e("App", "Failure", ex);
                }
            }
        }
    }
}

