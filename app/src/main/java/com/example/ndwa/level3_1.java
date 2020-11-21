package com.example.ndwa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

public class level3_1 extends AppCompatActivity {

    Button Save;
    EditText ruselt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_1);

        ruselt4 = findViewById(R.id.ruselt4);
        Save = findViewById(R.id.Save4);

        Save.setOnClickListener(view -> {

            String temp = ruselt4.getText().toString();
            long result4 = Long.parseLong(temp);

            if (result4 == 3536272832L )
            {
                AlertDialog dialog = new AlertDialog.Builder(level3_1.this)
                        .setTitle("You Are Winner Go To Next Level")
                        .setMessage("Sudoku")
                        .setNegativeButton("ok",null)
                        .show();

                Intent intent = new Intent(level3_1.this,level3_2.class);
                startActivity(intent);


            }

            else {
                AlertDialog dialogl = new AlertDialog.Builder(level3_1.this)
                        .setTitle("Loser!!!")
                        .setMessage("Try Again...")
                        .setNegativeButton("ok",null)
                        .show();
            }

        });

    }



}