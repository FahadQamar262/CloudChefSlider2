package com.example.dell.cloudchefslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;

public class DetailActivity extends AppCompatActivity {

    Toolbar mtoolbar;
    ImageView mimageview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mtoolbar=(Toolbar) findViewById(R.id.toolbar3);
        mimageview=(ImageView)findViewById(R.id.imageView);

        Bundle mbundle=getIntent().getExtras();
        if(mbundle!=null){
            mtoolbar.setTitle(mbundle.getString("names"));
            mimageview.setImageResource(mbundle.getInt("id"));
        }
    }
}
