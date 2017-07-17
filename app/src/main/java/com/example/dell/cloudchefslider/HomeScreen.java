package com.example.dell.cloudchefslider;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class HomeScreen extends AppCompatActivity {

    Toolbar mtoolbar;
    ListView mlistView;

    String[] names={"Australia", "Brazil", "China", "France", "Germany", "India", "Ireland", "ItalY","Mexico", "Poland", "Russia", "Spain", "US"};
    String[] des={"Country","Country","Country","Country","Country","Country","Country","Country","Country","Country","Country","Country","Country"};
    int[]  picID={R.drawable.flag_australia,
            R.drawable.flag_brazil,
            R.drawable.flag_china,
            R.drawable.flag_france,
            R.drawable.flag_germany,
            R.drawable.flag_india,
            R.drawable.flag_ireland,
            R.drawable.flag_italy,
            R.drawable.flag_maxico,
            R.drawable.flag_poland,
            R.drawable.flag_russia,
            R.drawable.flag_spain,
            R.drawable.flag_us};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        mtoolbar=(Toolbar) findViewById(R.id.toolbar2);
        mtoolbar.setTitle(getResources().getString(R.string.app_name));

        mlistView=(ListView) findViewById(R.id.listview);
        Adapter myadapter = new Adapter(HomeScreen.this,names,des,picID);
        mlistView.setAdapter(myadapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent mintent=new Intent(HomeScreen.this,DetailActivity.class);
                mintent.putExtra("names",names[i]);
                mintent.putExtra("des",des[i]);
                mintent.putExtra("id",picID[i]);
                startActivity(mintent);
            }
        });

    }

}
