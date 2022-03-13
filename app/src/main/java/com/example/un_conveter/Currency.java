package com.example.un_conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Currency extends AppCompatActivity {
    private Button button;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText editTextNumberDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_currency);
        button =findViewById(R.id.button4);
        textView1=findViewById(R.id.textView17);
        textView2=findViewById(R.id.textView18);
        textView3=findViewById(R.id.textView19);
        textView4=findViewById(R.id.textView20);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal4);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editTextNumberDecimal.getText().toString();
                float number=Float.parseFloat(s);
                float dollar= (float) (number*0.013);
                float Dhiram= (float) (number*0.049);
                float Pound= (float) (number*0.0098);
                float Euro= (float) (number*0.012);
                textView1.setText(number+" Rs = "+dollar+" DOLLAR");
                textView2.setText(number+" Rs = "+Dhiram+" DHIRAM");
                textView3.setText(number+" Rs = "+Pound +" POUND");
                textView4.setText(number+" Rs = "+Euro+" EURO");
            }
        });
    }
}