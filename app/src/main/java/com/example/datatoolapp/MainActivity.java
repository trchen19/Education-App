package com.example.datatoolapp;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ScaleDrawable;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawer;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mDrawer = (DrawerLayout)findViewById(R.id.drawer);
        mToggle = new ActionBarDrawerToggle(this, mDrawer, R.string.open, R.string.close);
        mDrawer.addDrawerListener(mToggle);
        mToggle.syncState();
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ImageButton financeImgBtn = (ImageButton)findViewById(R.id.financeImgBtn);
        ImageButton demographicImgBtn = (ImageButton)findViewById(R.id.demographicImgBtn);
        ImageButton performanceImgBtn = (ImageButton)findViewById(R.id.performanceImgBtn);
        ImageButton mapImgBtn = (ImageButton)findViewById(R.id.mapImgBtn);
        ImageButton contactImgBtn = (ImageButton)findViewById(R.id.contactImgBtn);
        ImageButton searchImgBtn = (ImageButton)findViewById(R.id.searchImgBtn);

        financeImgBtn.setBackgroundColor(Color.TRANSPARENT);
        demographicImgBtn.setBackgroundColor(Color.TRANSPARENT);
        performanceImgBtn.setBackgroundColor(Color.TRANSPARENT);
        mapImgBtn.setBackgroundColor(Color.TRANSPARENT);
        contactImgBtn.setBackgroundColor(Color.TRANSPARENT);
        searchImgBtn.setBackgroundColor(Color.TRANSPARENT);

        financeImgBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //each button produces a number, then depending on number produce intent with hasExtra info
                //to modify DataDisplay
                return;
            }
        });
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(mToggle.onOptionsItemSelected(item)){
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
