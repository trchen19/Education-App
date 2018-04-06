package com.example.datatoolapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Splash extends AppCompatActivity {

    private TextView titleTV;
    private ImageView logoIV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        titleTV = (TextView)findViewById(R.id.titleTextView);
        logoIV = (ImageView)findViewById(R.id.logoImg);

        Animation anim = AnimationUtils.loadAnimation(this, R.anim.mytransition);

        titleTV.startAnimation(anim);
        logoIV.startAnimation(anim);

        final Intent in = new Intent(this, MainActivity.class);

        Thread timer = new Thread(){
            public void run() {
                try{
                    sleep(5000);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }finally{
                    startActivity(in);
                    finish();
                }
            }
        };
        timer.start();
    }
}
