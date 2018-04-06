package com.example.datatoolapp;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageButton financeImgBtn = (ImageButton)findViewById(R.id.financeImgBtn);
        ImageButton demographicImgBtn = (ImageButton)findViewById(R.id.demographicImgBtn);
        ImageButton performanceImgBtn = (ImageButton)findViewById(R.id.performanceImgBtn);
        ImageButton mapImgBtn = (ImageButton)findViewById(R.id.mapImgBtn);
        ImageButton contactImgBtn = (ImageButton)findViewById(R.id.contactImgBtn);
        ImageButton searchImgBtn = (ImageButton)findViewById(R.id.searchImgBtn);

        financeImgBtn.setBackgroundColor(Color.TRANSPARENT);
    }
    private Drawable resize(Drawable image) {
        Bitmap b = ((BitmapDrawable)image).getBitmap();
        Bitmap bitmapResized = Bitmap.createScaledBitmap(b, 50, 50, false);
        return new BitmapDrawable(getResources(), bitmapResized);
    }
}
