package com.mamcet.electricalcircuitcalculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class formula extends AppCompatActivity {
    Button formula,formula1,formula2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.formula);

        formula=(Button) findViewById(R.id.customButton3 );
        formula.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formula.this,imgActivity1.class);
                startActivity(i);
            }
        });
        formula1=(Button) findViewById(R.id.customButton);
        formula1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formula.this,imgActivity2.class);
                startActivity(i);
            }
        });
        formula2=(Button) findViewById(R.id.customButton2);
        formula2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(formula.this,imgActivity3.class);
                startActivity(i);
            }
        });

    }
}