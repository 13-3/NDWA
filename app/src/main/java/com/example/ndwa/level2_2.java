package com.example.ndwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class level2_2 extends AppCompatActivity {
  EditText ruselt4;
  Button Save;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_2);

        ruselt4 = findViewById(R.id.ruselt4);
        Save = findViewById(R.id.Save4);

        Save.setOnClickListener(view -> {

            String result4 = ruselt4.getText().toString().toLowerCase().trim();

            if(result4.equals("wedad"))
            {
                AlertDialog dialog = new AlertDialog.Builder(level2_2.this)
                        .setTitle("You Are Winner Go To Next Level")
                        .setMessage("ASCII Code TO TEXT Result is :DINA") // change hint
                        .setNegativeButton("ok",null)
                        .show();

                Intent level2Intent = new Intent(level2_2.this, level3_1.class);
                startActivity(level2Intent);
            }
            else
            {
                AlertDialog dialogl = new AlertDialog.Builder(level2_2.this)
                        .setTitle("Loser!!!")
                        .setMessage("Try Again...")
                        .setNegativeButton("ok",null)
                        .show();
            }


        });


        }

    public void wanthelp2_2(View view) {

        AlertDialog dialog = new AlertDialog.Builder(level2_2.this)
                .setTitle("Help")
                .setMessage("Matrix size")
                .setNegativeButton("ok", null)
                .show();
    }


    }
