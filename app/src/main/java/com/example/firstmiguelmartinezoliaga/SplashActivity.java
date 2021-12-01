package com.example.firstmiguelmartinezoliaga;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.window.SplashScreen;

import androidx.appcompat.app.AppCompatActivity;

public class SplashActivity extends AppCompatActivity {

@Override
    protected void onCreate(Bundle savedInstanceState){
        ImageView imagen;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        openApp(true);setContentView(R.layout.activity_splash);
        imagen=(ImageView)findViewById(R.id.animimage);
        Animation fadein=AnimationUtils.loadAnimation(this,R.anim.movement);
        imagen.startAnimation(fadein);
    }



    private void openApp(boolean locationPermission) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplashActivity.this, LoginActivity.class);
                startActivity(intent);
            }
        }, 3500);
    }
}
