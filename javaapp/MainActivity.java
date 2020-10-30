package com.bajaj.javaapp;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("Main Activity", "onCreate executed");
        final Button btn = findViewById(R.id.nextBtn);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);
//                EditText editText = findViewById(R.id.edittext);
//                String message = editText.getText().toString();
//                intent.putExtra("message", message);
                startActivity(intent);
            }
        });
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("Main Activity", "onStart executed");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("Main Activity", "onResume executed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("Main Activity", "onPause executed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("Main Activity", "onStop executed");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("Main Activity", "onDestroy executed");
    }
}