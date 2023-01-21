package com.example.catchthekenny;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity2 extends AppCompatActivity {
    EditText sayacNumber;
    EditText hızNumber;
    int sayacNum;
    int hızNum;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        sayacNumber = findViewById(R.id.editTextNumber);
        hızNumber = findViewById(R.id.editTextNumber2);



    }
    public void changeGame(View view){
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);
        startActivity(intent);

    }
    public void countDownTimer(){

    }
}