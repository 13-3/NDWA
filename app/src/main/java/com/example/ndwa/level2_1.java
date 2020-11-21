package com.example.ndwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class level2_1 extends AppCompatActivity {

    EditText ruselt3;
    Button Save;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level2_1);

    ruselt3 = findViewById(R.id.ruselt3);
    Save = findViewById(R.id.Save3);


    Save.setOnClickListener(view -> {

        String temp = ruselt3.getText().toString();
        int result3 = Integer.parseInt(temp);

        if(result3 == 32144511){

            AlertDialog dialog = new AlertDialog.Builder(level2_1.this)
                    .setTitle("You Are Winner Go To Next Level")
                    .setMessage("Matrix size numbering")
                    .setNegativeButton("ok",null)
                    .show();

            Intent intent = new Intent(level2_1.this,level2_2.class);
            startActivity(intent);

        }

        else {
            AlertDialog dialogl = new AlertDialog.Builder(level2_1.this)
                    .setTitle("Loser!!!")
                    .setMessage("Try Again...")
                    .setNegativeButton("ok",null)
                    .show();
        }


    });


   }

    public void wanthelp2_1(View view) {

        AlertDialog dialog = new AlertDialog.Builder(level2_1.this)
                .setTitle("Help")
                .setMessage("Matrix")
                .setNegativeButton("ok", null)
                .show();
    }




}

