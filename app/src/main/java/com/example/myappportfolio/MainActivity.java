package com.example.myappportfolio;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatButton;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Toast message;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        AppCompatButton spotstream=(AppCompatButton)findViewById(R.id.spotstreame);
        AppCompatButton scoreapp=(AppCompatButton)findViewById(R.id.scoresap);
        AppCompatButton libapp=(AppCompatButton)findViewById(R.id.libraryap);
        AppCompatButton bib=(AppCompatButton)findViewById(R.id.builditbig);
        AppCompatButton xyz=(AppCompatButton)findViewById(R.id.xyzread);
        AppCompatButton capstone=(AppCompatButton)findViewById(R.id.capston);

        spotstream.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message=Toast.makeText(getBaseContext(),"This Button will launch my Spot Stream app!",Toast.LENGTH_SHORT);
                message.show();
            }
        });

        scoreapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message=Toast.makeText(getBaseContext(),"This Button will launch my Score app!",Toast.LENGTH_SHORT);
                message.show();
            }
        });

        libapp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message=Toast.makeText(getBaseContext(),"This Button will launch my Library app!",Toast.LENGTH_SHORT);
                message.show();
            }
        });

        bib.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message=Toast.makeText(getBaseContext(),"This Button will launch my Build it Bigger app!",Toast.LENGTH_SHORT);
                message.show();
            }
        });

        xyz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message=Toast.makeText(getBaseContext(),"This Button will launch my XYZ Reader app!",Toast.LENGTH_SHORT);
                message.show();
            }
        });

        capstone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                message=Toast.makeText(getBaseContext(),"This Button will launch my Capstone app!",Toast.LENGTH_SHORT);
                message.show();
            }
        });
    }
}
