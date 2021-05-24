package com.example.fktestexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.fktest.FKTest;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FKTest.initialize();
    }
}