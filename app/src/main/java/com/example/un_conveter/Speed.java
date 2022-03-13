package com.example.un_conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Speed extends AppCompatActivity {
   private Button button;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText editTextNumberDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_speed);
        button =findViewById(R.id.button3);
        textView1=findViewById(R.id.textView5);
        textView2=findViewById(R.id.textView10);
        textView3=findViewById(R.id.textView11);
        textView4=findViewById(R.id.textView12);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal3);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editTextNumberDecimal.getText().toString();
                double number=Double.parseDouble(s);
                double meterSec=number*(0.28);
                double meterHour=number*1000;
                double centiMin=number*1666.666667;
                double centiSec=number*27.78;
                textView1.setText(number+" km/hr = "+meterSec+" m/sec");
                textView2.setText(number+" km/hr = "+meterHour+" m/hr");
                textView3.setText(number+" km/hr = "+centiMin+" cm/m");
                textView4.setText(number+" km/hr = "+centiSec+" cm/sec");
            }
        });
    }
}