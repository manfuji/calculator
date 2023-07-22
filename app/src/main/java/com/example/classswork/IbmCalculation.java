package com.example.classswork;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.CollationElementIterator;

public class IbmCalculation extends AppCompatActivity {
    



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ibm_calculation);
        String name = getIntent().getStringExtra("name");
        int age = getIntent().getIntExtra("age", 0); // default value in case of null
         EditText weightInput = findViewById(R.id.weight);
         EditText heightInput = findViewById(R.id.height);
         TextView textViewName = findViewById(R.id.name);
        TextView bmiText = findViewById(R.id.textViewBMI);
         
        TextView textViewAge = findViewById(R.id.age);

        textViewName.setText( name);
        textViewAge.setText( age);




        Button calculateButton = findViewById(R.id.buttonCalculateBMI);
        calculateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double weight = Double.parseDouble(weightInput.getText().toString());
                double height = Double.parseDouble(heightInput.getText().toString()); // convert cm to m
                double bmi = weight / (height * height);
                bmiText.setText(String.format("%.2f", bmi));
            }
        });
    }
}