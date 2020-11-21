package com.example.ndwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class level1_2 extends AppCompatActivity {

    EditText ruselt2;
    Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_2);


      ruselt2 = findViewById(R.id.ruselt2);
      Save = findViewById(R.id.Save2);
      Save.setOnClickListener(view -> {

          String result2 = ruselt2.getText().toString().toLowerCase();
          if(result2.equals("dina")){
              AlertDialog dialog = new AlertDialog.Builder(level1_2.this)
                      .setTitle("You Are Winner Go To Next Level")
                      .setMessage("ASCII Code TO TEXT Result is :DINA")
                      .setNegativeButton("ok",null)
                      .show();

              Intent level2Intent = new Intent(level1_2.this, level2_1.class);
              startActivity(level2Intent);
          }
          else{
              AlertDialog dialogl = new AlertDialog.Builder(level1_2.this)
                      .setTitle("Loser!!!")
                      .setMessage("Try Again...")
                      .setNegativeButton("ok",null)
                      .show();
          }


      });

    }

    public void wanthelp1_2(View view) {

        AlertDialog dialog = new AlertDialog.Builder(level1_2.this)
                .setTitle("Help")
                .setMessage("ASCII")
                .setNegativeButton("ok", null)
                .show();
    }



}
