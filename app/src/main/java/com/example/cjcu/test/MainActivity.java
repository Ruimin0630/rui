package com.example.cjcu.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText input_lend;
    private EditText input_rate;
    private EditText input_numder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    private void findViews(){


        findViews();


    }

    private void findViews() {
        input_lend = findViewById(R.id.input_lend);
        input_rate = findViewById(R.id.input_rate);
        input_numder = findViewById(R.id.input_number);
    }
}
