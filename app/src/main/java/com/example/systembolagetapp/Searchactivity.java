package com.example.systembolagetapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.Serializable;

public class Searchactivity extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);
    }
}
