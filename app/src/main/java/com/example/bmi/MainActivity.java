package com.example.bmi;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.bmi.model.Body;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        final Button calculateButton = findViewById(R.id.calculator_button);
        calculateButton.setOnClickListener(new View.OnClickListener() { //
            @Override
            public void onClick(View view) {
                EditText heightEditText = findViewById(R.id.height_edit_text);
                EditText weightEditText = findViewById(R.id.weight_edit_text);

                int h = Integer.parseInt(heightEditText.getText().toString());
                int w = Integer.parseInt(weightEditText.getText().toString());
                Body body = new Body(h,w);

                float bmi = body.calculateBmi();

                String strBmi = String.valueOf(bmi);

                String msg = "เกณฑ์น้ำหนักของคุณ: "+body.getResultText();

                Toast t =Toast.makeText(MainActivity.this,msg,Toast.LENGTH_LONG);
                t.show();
                /*
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("Result");
                dialog.setMessage(msg);

                dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                dialog.setNegativeButton("No",null);
                dialog.setCancelable(false);
                dialog.show();
                */

                if (bmi < 18.5) {
                    Intent i1 = new Intent(MainActivity.this, Underweight.class);
                    i1.putExtra("bmi",strBmi);
                    startActivity(i1);
                }
                else if(bmi >= 18.5 && bmi <= 22.99) {
                    Intent i2 = new Intent(MainActivity.this,Normal.class);
                    i2.putExtra("bmi",strBmi);
                    startActivity(i2);
                }
                else if(bmi > 22.99 && bmi <= 24.99) {
                    Intent i3 = new Intent(MainActivity.this, Overweight.class);
                    i3.putExtra("bmi",strBmi);
                    startActivity(i3);
                }
                else if(bmi > 24.99 && bmi <= 29.99) {
                    Intent i3 = new Intent(MainActivity.this, Atrisk.class);
                    i3.putExtra("bmi",strBmi);
                    startActivity(i3);
                }
                else if(bmi > 29.99 && bmi <= 39.99) {
                    Intent i3 = new Intent(MainActivity.this, Obese_I.class);
                    i3.putExtra("bmi",strBmi);
                    startActivity(i3);
                }
                else {
                    Intent i4 = new Intent(MainActivity.this, Obese2.class);
                    i4.putExtra("bmi",strBmi);
                    startActivity(i4);
                }
            }
        });
    }
}
