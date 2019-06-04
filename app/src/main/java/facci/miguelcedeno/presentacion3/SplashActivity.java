package facci.miguelcedeno.presentacion3;


import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import facci.miguelcedeno.presentacion3.ui.login.LoginActivity;
public class SplashActivity extends AppCompatActivity {
    static  int TIMEOUT_MILLIS =2000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        getSupportActionBar().hide();


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent i = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(i);

                finish();
            }


        }, TIMEOUT_MILLIS);
    }
}