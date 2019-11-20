package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Normal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_normal);

        Intent intent = getIntent();
        String bmi = intent.getStringExtra("bmi");

        TextView bmiTextview = findViewById(R.id.BMI_Normal);
        bmiTextview.setText("BMI = "+bmi);
    }
}
