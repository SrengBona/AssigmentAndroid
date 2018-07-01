package com.example.user.tosnham;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ViewRestuarantActivity extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_reatuarant_activity);

        View listOfRestuarant = (View) findViewById(R.id.list_restuarant);
        listOfRestuarant.setOnClickListener(this);
    }

    private void showMainRestuarant(){
        Intent intent = new Intent(this, MainRestuarant.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.list_restuarant){
            showMainRestuarant();
        }
    }
}
