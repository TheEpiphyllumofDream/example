package com.example.dell.mengmian;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    private Button button;
    private Button resetButton;
    private Button JumpButton;
    private ImageView imageView;
    private final String TAG="MainActivity";
    private TextView textView;
    private  int clickCount=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.button);
        resetButton = findViewById(R.id.button);
        imageView = findViewById(R.id.imageview);
        textView = findViewById(R.id.text_view);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount++;
                if (clickCount >= 2) {
                    changui();
                }
            }
        });
        resetButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                clickCount = 0;
                changui();
            }
        });
        JumpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        BilibiliActivity.class);
                startActivity(intent);
            }
        });
    }
        private void changui(){
            int image = countstanf.images[clickCount];
            String titile = countstanf.titles[clickCount];
            imageView.setImageResource(image);
            textView.setText(titile);
        }
    }
