package com.example.dell.cloudchefslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    Toolbar mtoolbar;
    ImageView mimageview;
    TextView textview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mtoolbar=(Toolbar) findViewById(R.id.toolbar3);
        mimageview=(ImageView)findViewById(R.id.imageView);
        textview =(TextView)findViewById(R.id.textView4);

        Bundle mbundle=getIntent().getExtras();
        if(mbundle!=null){
            mtoolbar.setTitle(mbundle.getString("names"));
            mimageview.setImageResource(mbundle.getInt("id"));
            textview.setText(mbundle.getString("des"));
        }
    }
}
