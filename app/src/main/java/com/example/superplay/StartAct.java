package com.example.superplay;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.util.*;

public class StartAct extends AppCompatActivity {
    EditText editText;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);

        Random random = new Random();
        button = findViewById(R.id.button);
        editText=findViewById(R.id.value1);
        int x = random.nextInt(10);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(TextUtils.isEmpty(editText.getText().toString())){
                    Toast.makeText(StartAct.this, "Enter a Value please", Toast.LENGTH_SHORT).show();
                }
                else {
                    if(x == Integer.parseInt(editText.getText().toString())){
                        winactivity();
                        Toast.makeText(StartAct.this, "YOU WON", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        lossactivity();
                        Toast.makeText(StartAct.this, "YOU LOSE", Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });

    }
    public void winactivity(){
        Intent intent1 = new Intent(this,Win.class);
        startActivity(intent1);
    }
    public void lossactivity(){
        Intent intent2 = new Intent(this, loose.class);
        startActivity(intent2);
    }
}