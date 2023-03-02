package com.example.superplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button start,help;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        start=findViewById(R.id.Start);
        help=findViewById(R.id.Help);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    openActivity2();
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
    }
    public void openActivity2(){
        Intent intent = new Intent(this, StartAct.class);
        startActivity(intent);
    }
    public void openActivity3(){
        Intent intent = new Intent(this, Help.class);
        startActivity(intent);
    }

}