package com.example.systembolagetapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.io.Serializable;

public class Aldergrans extends AppCompatActivity implements Serializable {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aldergrans);

        Button btn = (Button) findViewById(R.id.Ybutton);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Aldergrans.this, MainActivity.class);
                startActivity(intent);
            }
        });
        Button btnexit = (Button) findViewById(R.id.Nbutton);
        btnexit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You're too young to use this app.", Toast.LENGTH_LONG).show();
                finish();
            }
        });
    }

}
