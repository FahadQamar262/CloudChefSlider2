package com.example.dell.cloudchefslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_1);

    }
    void SignUpOnClick(View v)
    {
        Intent myIntent = new Intent(this,Activity2.class);
        startActivity(myIntent);

    }
    void SignUpOnClick1(View v)
    {
        Intent myIntent = new Intent(this,HomeScreen.class);
        startActivity(myIntent);

    }


}
