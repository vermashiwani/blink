package com.example.androidlibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.example.blink.BlinkEffect;

public class MainActivity extends AppCompatActivity {
//Shiwani Edit FOrk Testing
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView = findViewById(R.id.textView);
        BlinkEffect.blink(textView);
    }
}