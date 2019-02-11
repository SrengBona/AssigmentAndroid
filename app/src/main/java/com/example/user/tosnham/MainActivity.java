package com.example.user.tosnham;

import android.content.Intent;
import android.os.Message;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

import com.facebook.accountkit.AccountKit;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar tlbMain = findViewById(R.id.tlb_main);
        setSupportActionBar(tlbMain);
        getSupportActionBar().setTitle("Tos Nham");

        // Create actionbar drawer toggle
        DrawerLayout drawerLayout = findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle drawerToggle = new ActionBarDrawerToggle(this, drawerLayout, tlbMain, R.string.app_name, R.string.app_name);
        drawerLayout.addDrawerListener(drawerToggle);
        drawerToggle.syncState();

        View home = (View) findViewById(R.id.btv_home);
        View restuarant = (View) findViewById(R.id.btv_restuarant);
        View more = (View) findViewById(R.id.btv_more);



        home.setOnClickListener(this);
        restuarant.setOnClickListener(this);
        more.setOnClickListener(this);

        showhome();

        //SignOut

//        Button btnSignOut = (Button) findViewById(R.id.btnLogOut);
//        btnSignOut.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                AccountKit.logOut();
//                finish();
//            }
//        });

    }

    //Function Show restuarant list
    private  void showlistRestuarant(){
        FragmentReatuarant fragmentReatuarant= new FragmentReatuarant();
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyo_container,fragmentReatuarant);
        fragmentTransaction.commit();
    }

    //Function Show restuarant list
    private  void showhome(){
        FragmentHome fragmentHome= new FragmentHome();
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyo_container,fragmentHome);
        fragmentTransaction.commit();
    }

    //Function Show restuarant list
    private  void showmore(){
        FragmentMore fragmentMore= new FragmentMore();
        FragmentManager fragmentManager= getSupportFragmentManager();
        FragmentTransaction fragmentTransaction= fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.lyo_container,fragmentMore);
        fragmentTransaction.commit();
    }

    @Override
    public void onClick(View view) {

        if(view.getId()==R.id.btv_home){
            showhome();
        }
        else if(view.getId()==R.id.btv_restuarant){
            showlistRestuarant();
        }
        else if(view.getId()==R.id.btv_more){
            showmore();
        }

    }


}
