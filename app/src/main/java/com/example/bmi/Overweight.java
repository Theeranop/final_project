package com.example.bmi;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Overweight extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_overweight);

        Intent intent = getIntent();
        String bmi = intent.getStringExtra("bmi");

        TextView bmiTextview = findViewById(R.id.BMI_Overweight);
        bmiTextview.setText("BMI = "+bmi);
    }
}
