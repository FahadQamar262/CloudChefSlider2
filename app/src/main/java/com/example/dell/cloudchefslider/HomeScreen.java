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

    String[] names={"Biryani", "Aloo Bhaji", "Pizza", "Karahi", "Chowmein", "Cake", "Burger", "Bread","Grilled Chicken", "Koftay", "Mix Sabzi", "Sajji", "Shami Kabab"};
    String[] des={"By Chef Abc","By Chef Def","By Chef Ghi","By Chef Jkl","By Chef Mno","By Chef Pqr","By Chef Stu","By Chef Vwx","By Chef Yza","By Chef Bcd","By Chef Efg","By Chef Hij","By Chef Klm"};
    String[] price={"500","400","300","600","200","250","350","450","550","275","375","225","325"};
    int[] picID={R.drawable.food_biryani1,
            R.drawable.food_aloobhaji,
            R.drawable.food_pizza1,
            R.drawable.food_karahi1,
            R.drawable.food_chowmein1,
            R.drawable.food_cake1,
            R.drawable.food_burger,
            R.drawable.food_bread1,
            R.drawable.food_griledchik,
            R.drawable.food_koftay,
            R.drawable.food_mixsabzi,
            R.drawable.food_sajji1,
            R.drawable.food_shami};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        mtoolbar=(Toolbar) findViewById(R.id.toolbar2);
        mtoolbar.setTitle(getResources().getString(R.string.app_name));

        mlistView=(ListView) findViewById(R.id.listview);
        Adapter myadapter = new Adapter(HomeScreen.this,names,des,picID,price);
        mlistView.setAdapter(myadapter);
        mlistView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int i, long id) {
                Intent mintent=new Intent(HomeScreen.this,DetailActivity.class);
                mintent.putExtra("names",names[i]);
                mintent.putExtra("des",des[i]);
                mintent.putExtra("id",picID[i]);
                mintent.putExtra("price",price[i]);
                startActivity(mintent);
            }
        });

    }

}
