package com.example.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class WelcomeActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        //For get instant using Authentication
        mAuth = FirebaseAuth.getInstance();
    }

    @Override
    protected void onStart() {
        super.onStart();

        //For get Authenticated user and store it within currentUser object
        FirebaseUser currentUser = mAuth.getCurrentUser();

        //Check currentUser object for logedin user
        if (currentUser == null){
            //For not logedin user sent into start page
            Intent startpageIntent = new Intent(WelcomeActivity.this, StartPageActivity.class);
            //For not allow goto the Welcome Activity using back button press
            startpageIntent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
            startActivity(startpageIntent);
            finish();

        }
    }
}
