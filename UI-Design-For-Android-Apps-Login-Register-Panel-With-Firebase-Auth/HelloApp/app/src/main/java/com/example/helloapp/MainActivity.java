package com.example.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //For Run Splash Screen and goto next page
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    //For how many time wait splash Image/screen
                    sleep(3000);

                }
                catch (Exception e){
                    e.printStackTrace();
                }
                finally {
                    //For going to next page After Splash time out
                    Intent welcomeIntent = new Intent(MainActivity.this, WelcomeActivity.class);
                    startActivity(welcomeIntent);
                }
            }
        };
        thread.start();
    }
//For pause user on the screen
    @Override
    protected void onPause() {
        super.onPause();

        finish();
    }
}
