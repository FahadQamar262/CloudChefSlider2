package com.example.dell.cloudchefslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
    }

    void RegisterOnClick(View v)
    {
        Intent myIntent = new Intent(this,Main2Activity.class);
        startActivity(myIntent);


    }
    void UserOnClick(View v)
    {
        Intent mIntent = new Intent(Activity2.this,HomeScreen.class);
        startActivity(mIntent);


    }
}
