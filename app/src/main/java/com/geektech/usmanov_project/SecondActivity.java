package com.geektech.usmanov_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends AppCompatActivity {
    Button paris, hawaii, dubai, nYork;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        paris = findViewById(R.id.btn_paris);
        hawaii = findViewById(R.id.btn_havaii);
        dubai = findViewById(R.id.btn_dubai);
        nYork = findViewById(R.id.new_york);


        paris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SecondActivity.this,ParisActivity.class);
                startActivity(intent);
            }
        });

        hawaii.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hawaii = new Intent(SecondActivity.this,HawaiiActivity.class);
                startActivity(hawaii);
            }
        });

        dubai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent dubai = new Intent(SecondActivity.this,DubaiActivity.class);
                startActivity(dubai);
            }
        });

        nYork.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent nYork = new Intent(SecondActivity.this,YorkActivity.class);
                startActivity(nYork);
            }
        });


    }
}