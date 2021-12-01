package com.example.firstmiguelmartinezoliaga;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

@SuppressLint("CustomSplashScreen")
public class SplashActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState){
        ImageView imagen;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp();setContentView(R.layout.activity_splash);
        imagen=(ImageView)findViewById(R.id.animimage);
        Animation fadein=AnimationUtils.loadAnimation(this,R.anim.movement);
        imagen.startAnimation(fadein);
    }



    private void openApp() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
            startActivity(intent);
        }, 3450);
    }
}
