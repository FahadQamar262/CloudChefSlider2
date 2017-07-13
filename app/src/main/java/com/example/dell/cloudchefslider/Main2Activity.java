package com.example.dell.cloudchefslider;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Spinner mySpinner=(Spinner)findViewById(R.id.spinner);

        ArrayAdapter<String> myAdapter = new ArrayAdapter<String>(Main2Activity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.city));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner.setAdapter(myAdapter);

        Spinner mySpinner1=(Spinner)findViewById(R.id.spinner2);

        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(Main2Activity.this,
                android.R.layout.simple_list_item_1,getResources().getStringArray(R.array.town));
        myAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);
    }
}
