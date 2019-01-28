package com.example.helloapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class StartPageActivity extends AppCompatActivity {

    //Take 2object for 2Button
    private Button NeedNewAccountButton;
    private Button AlreadyHaveAccountButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start_page);

        //Initial XML id through java object
        NeedNewAccountButton = (Button) findViewById(R.id.need_account_button);
        AlreadyHaveAccountButton = (Button) findViewById(R.id.already_have_account_button);

        //For going to Next page through the NeedNewAccountButton click
        NeedNewAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(StartPageActivity.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        //For going to Next page through the AlreadyHaveAccountButton click
        AlreadyHaveAccountButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(StartPageActivity.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
    }
}
