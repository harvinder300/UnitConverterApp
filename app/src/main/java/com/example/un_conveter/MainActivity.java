package com.example.un_conveter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
private ImageButton Weight;
private ImageButton Speed;
private ImageButton Length;
private ImageButton Currency;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Weight=findViewById(R.id.imageButton1);
        Speed=findViewById(R.id.imageButton3);
        Length=findViewById(R.id.imageButton2);
        Currency=findViewById(R.id.imageButton5);

  Weight.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
      Intent intent= new Intent(MainActivity.this,Weight.class);
      startActivity(intent);
      }

  });
  Speed.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent= new Intent(MainActivity.this,Speed.class);
          startActivity(intent);
      }

  });
  Length.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent= new Intent(MainActivity.this,Length.class);
          startActivity(intent);
      }
  });
  Currency.setOnClickListener(new View.OnClickListener() {
      @Override
      public void onClick(View view) {
          Intent intent= new Intent(MainActivity.this,Currency.class);
          startActivity(intent);
      }
  });
    }


}