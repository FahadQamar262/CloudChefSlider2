package com.example.dell.cloudchefslider;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.os.Bundle;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

public class HomeScreen extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener{

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
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);


    }
    private TextView mTextMessage;
    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_dishes:
                   return true;
                case R.id.navigation_popular_dishes:
                   return true;
                case R.id.navigation_call:
                    return true;
                case R.id.navigation_featured:
                    return true;
                case R.id.navigation_favourites:
                    return true;
            }
            return false;
        }

    };



    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_cart) {

        } else if (id == R.id.nav_logout) {

        } else if (id == R.id.nav_about) {

        } else if (id == R.id.nav_share) {

        } else if (id == R.id.nav_account) {

        }else if (id == R.id.nav_support) {

        }else if (id == R.id.nav_chef) {

        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }



}
