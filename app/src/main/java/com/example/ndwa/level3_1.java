package com.example.ndwa;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import javax.crypto.Cipher;

public class level3_1 extends AppCompatActivity {

    Button Save5;
    EditText ruselt4;
    EditText ruselt5;
    TextView tvCipher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_1);

        ruselt5=findViewById(R.id.ruselt5);
        tvCipher= findViewById(R.id.tvCipher);


        Save5=findViewById(R.id.Save5);

        Save5.setOnClickListener(view -> {

            String userinput = ruselt5.getText().toString();

            tvCipher.setText(encryption(userinput));


        });
    }

    public String encryption(String PlainText){

        char [] alphabet2={ 'A','G','M','S','Y','4',
                            'B','H','N','T','Z','5',
                            'C','I','O','U','0','6',
                            'D','J','P','V','1','7',
                            'E','K','Q','W','2','8',
                            'F','L','R','X','3','9'};

        //if a,h,o,v,2 or 9 do nothing
        //index 0,7,14,21,28,35

        String Cipher= " ";
        int index;
        for(int i=0; i<=PlainText.length(); i++){

            for(int j=0; j<=alphabet2.length; j++){

                if(Character.isWhitespace(PlainText.toUpperCase().charAt(i))){
                    Cipher += " ";
                    break;
                }
                else if(PlainText.toUpperCase().charAt(i)==alphabet2[j]){
                    Cipher += alphabet2[j+2];

                    }/*else{

                    index =(j)%35;
                    Cipher+=alphabet2[index];
                    break;
                    }
                    */


           //     else{

             //  Cipher += alphabet2[j];
               // }

            }
        }
        return Cipher;
    }
}

/*  ruselt4 = findViewById(R.id.ruselt4);
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

        });*/
