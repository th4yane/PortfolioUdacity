package com.thayane.portfolioudacity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button popMoviesBtn = (Button) findViewById(R.id.popularMoviesBtn);
        popMoviesBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),
                        "This button will launch my Popular Movies project", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button stockHawkBtn = (Button) findViewById(R.id.stockHawkBtn);
        stockHawkBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),
                        "This button will launch my Stock Hawk project", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button buildItBiggerBtn = (Button) findViewById(R.id.buildItBiggerBtn);
        buildItBiggerBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),
                        "This button will launch my Build it Bigger project", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button materialBtn = (Button) findViewById(R.id.materialBtn);
        materialBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),
                        "This button will launch my Make Your App Material project", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button ubiquitousBtn = (Button) findViewById(R.id.ubiquitousBtn);
        ubiquitousBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),
                        "This button will launch my Go Ubiquitous project", Toast.LENGTH_LONG);
                toast.show();
            }
        });

        Button capstoneBtn = (Button) findViewById(R.id.capstoneBtn);
        capstoneBtn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Toast toast = Toast.makeText(v.getContext(),
                        "This button will launch my Capstone: My Own App project", Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
