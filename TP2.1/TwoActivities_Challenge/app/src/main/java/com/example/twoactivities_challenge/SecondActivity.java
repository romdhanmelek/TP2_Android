package com.example.twoactivities_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent1 = getIntent();
        Intent intent2 = getIntent();
        Intent intent3 = getIntent();

        String message1 = intent1.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String message2 = intent2.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent3.getStringExtra(MainActivity.EXTRA_MESSAGE3);

        TextView textView1 = findViewById(R.id.textView3);
        TextView textView2 = findViewById(R.id.textView4);
        TextView textView3= findViewById(R.id.textView5);
        textView1.setText(message1);
        textView2.setText(message2);
        textView3.setText(message3);
    }
}