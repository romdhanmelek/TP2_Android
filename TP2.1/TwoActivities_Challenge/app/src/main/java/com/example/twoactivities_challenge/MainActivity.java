package com.example.twoactivities_challenge;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE1 = "com.example.android.twoactivities_challenge.extra.MESSAGE1";
    public static final String EXTRA_MESSAGE2 = "com.example.android.twoactivities_challenge.extra.MESSAGE2";
    public static final String EXTRA_MESSAGE3 = "com.example.android.twoactivities_challenge.extra.MESSAGE3";
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    private EditText mMessageEditText1;
    private EditText mMessageEditText2;
    private EditText mMessageEditText3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mMessageEditText1 = findViewById(R.id.Text_One);
        mMessageEditText2 = findViewById(R.id.Text_Two);
        mMessageEditText3 = findViewById(R.id.Text_Three);



    }

    public void launchSecondActivity(View view) {

        Log.d(LOG_TAG, "Button clicked!");
        Intent intent = new Intent(this, SecondActivity.class);

        String message1 = mMessageEditText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        String message2 = mMessageEditText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);
        String message3 = mMessageEditText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);

        startActivity(intent);


    }



}