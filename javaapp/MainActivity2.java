package com.bajaj.javaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Log.e("Main Activity2","onCreate executed");
//        Intent intent = getIntent();
//        String message = intent.getStringExtra("message");

//        TextView textView = findViewById(R.id.textview);
//        textView.setText(message + ", duh!");

        Button compBtn = findViewById(R.id.compBtn);

        compBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity2.this, MainActivity3.class);
                startActivity(intent1);
            }
        });

    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Main Activity2", "onStart executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Main Activity2", "onResume executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Main Activity2", "onPause executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Main Activity2", "onStop executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Main Activity2", "onDestroy executed");
    }
}