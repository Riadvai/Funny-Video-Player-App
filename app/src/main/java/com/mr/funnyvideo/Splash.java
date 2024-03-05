package com.mr.funnyvideo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    ImageView appImageViewLogo;
    TextView appTextViewTitle,appTextViewTagLine;
    Animation topAnimation, bottomAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //for full screen
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_splash);

        appImageViewLogo =findViewById(R.id.logo_app_view);
        appTextViewTitle =findViewById(R.id.text_app_view);
        appTextViewTagLine =findViewById(R.id.tag_line);

        //----Animation----//
        topAnimation = AnimationUtils.loadAnimation(this, R.anim.top_animation);
        bottomAnimation = AnimationUtils.loadAnimation(this, R.anim.bottom_animation);
        appImageViewLogo.setAnimation(topAnimation);
        appTextViewTitle.setAnimation(bottomAnimation);

        //For Splash Screen
        final Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                //Code here
                Intent myIntent = new Intent(Splash.this, Home.class);
                startActivity(myIntent);
                finish();
            }
        },2500);
    }
}