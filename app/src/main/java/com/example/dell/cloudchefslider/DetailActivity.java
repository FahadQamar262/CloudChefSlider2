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
    TextView mtextview;
    TextView mntextview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mtoolbar=(Toolbar) findViewById(R.id.toolbar_detail);
        mimageview=(ImageView)findViewById(R.id.imageView);
        textview =(TextView)findViewById(R.id.ch_name_detail);
        mtextview =(TextView)findViewById(R.id.name_detail);
        mntextview=(TextView)findViewById(R.id.price_detail);


        Bundle mbundle=getIntent().getExtras();
        if(mbundle!=null){
            mtoolbar.setTitle(mbundle.getString("names"));
            mimageview.setImageResource(mbundle.getInt("id"));
            textview.setText(mbundle.getString("des"));
            mtextview.setText(mbundle.getString("names"));
            mntextview.setText(mbundle.getString("price"));
        }
    }
}
