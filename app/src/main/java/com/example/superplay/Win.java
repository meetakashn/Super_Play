package com.example.superplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Win extends AppCompatActivity {
   Button restart,exit;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_win);
        restart =findViewById(R.id.restart);
        exit=findViewById(R.id.Exit);
        restart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Restart();
            }
        });
        exit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Exit();
            }
        });
    }
    public void Restart(){
        Intent intentrestart=new Intent(this,MainActivity.class);
        startActivity(intentrestart);
    }
    public void Exit(){
         moveTaskToBack(true);
         android.os.Process.killProcess(android.os.Process.myPid());
         System.exit(1);
    }
}