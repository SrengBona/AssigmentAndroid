package com.example.user.tosnham;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class LoginActivity extends Activity implements View.OnClickListener{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        //
        View login=(View) findViewById(R.id.login);
        View newacount=(View) findViewById(R.id.newacount);


        login.setOnClickListener(this);
        newacount.setOnClickListener(this);
    }

    private void startMainActivity(){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
    private void startCreateAcount(){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }
    @Override
    public void onClick(View view) {
        if(view.getId()==R.id.login){
            startMainActivity();
            finish();
        }
        else if(view.getId()==R.id.newacount) {
            startCreateAcount();
            finish();
//            String message="No!";
//            Toast.makeText(this, message, Toast.LENGTH_LONG).show();
        }
    }

}
