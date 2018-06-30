package com.example.user.tosnham;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class StartupActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_startup);
        delayToStartLoginActivity();
    }

    private void delayToStartLoginActivity(){
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startLoginActivity();
                finishStartupActivity();
            }
        }, 3000);
    }

    private void startLoginActivity(){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }

    private void finishStartupActivity(){
        finish();
    }
}
