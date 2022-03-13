package com.example.un_conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Length extends AppCompatActivity {
    private Button button;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText editTextNumberDecimal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_length);
        button =findViewById(R.id.button2);
        textView1=findViewById(R.id.textView13);
        textView2=findViewById(R.id.textView14);
        textView3=findViewById(R.id.textView15);
        textView4=findViewById(R.id.textView16);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editTextNumberDecimal.getText().toString();
                double number=Double.parseDouble(s);
                double m=number*1000;
                double cm=number*100000;
                double mile=number*0.621;
                double foot=number*3280.84;
                textView1.setText(number+" km = "+m+" m");
                textView2.setText(number+" km = "+cm+" cm");
                textView3.setText(number+" km = "+mile +" mile");
                textView4.setText(number+" km = "+foot+" ft");
            }
        });
    }
}