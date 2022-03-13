package com.example.un_conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Weight extends AppCompatActivity {
   private Button button;
    private TextView textView1;
    private TextView textView2;
    private TextView textView3;
    private TextView textView4;
    private EditText editTextNumberDecimal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weight);
        button=findViewById(R.id.button);
        textView1=findViewById(R.id.textView6);
        textView2=findViewById(R.id.textView7);
        textView3=findViewById(R.id.textView8);
        textView4=findViewById(R.id.textView9);
        editTextNumberDecimal=findViewById(R.id.editTextNumberDecimal);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s= editTextNumberDecimal.getText().toString();
                double number=Double.parseDouble(s);
                 double pound=number*2.25;
                 double cmg=number*100000;
                 double gm=number*1000;
                 double ton=number*0.00110231;
                textView1.setText(number+" kg = "+pound+" Pound");
                textView2.setText(number+" kg = "+cmg+" centigrams");
                textView3.setText(number+" kg = "+gm+" Grams");
                textView4.setText(number+" kg = "+ton+" Tons");
            }
        });

    }
}
