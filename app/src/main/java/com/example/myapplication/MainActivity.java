package com.example.myapplication;

import android.annotation.SuppressLint;
import android.app.WallpaperManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    Button promjenaPozadine;
    private WallpaperManager wpmngr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        promjenaPozadine = findViewById(R.id.button);

        promjenaPozadine.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("ResourceType")
            @Override
            public void onClick(View v) {
                wpmngr = WallpaperManager.getInstance(MainActivity.this);
                try {
                    wpmngr.setResource(R.drawable.blackmarble1);
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        });
    }
}