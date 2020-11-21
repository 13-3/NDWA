package com.example.ndwa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class level3_2 extends AppCompatActivity {

    EditText ruselt6;
    TextView tvCipher2;
    Button Save6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_2);

        char [][] alphabet = {
                { 'A','B','C','D','E','F'},
                { 'G','H','I','J','K','L'},
                { 'M','N','O','P','Q','R'},
                { 'S','T','U','V','W','X'},
                { 'Y','Z','0','1','2','3'},
                { '4','5','6','7','8','9'}
        };

        ruselt6=findViewById(R.id.ruselt6);
        tvCipher2= findViewById(R.id.tvCipher2);
        Save6=findViewById(R.id.Save6);

        Save6.setOnClickListener(view -> {

            String userinput = ruselt6.getText().toString();
            encryption(userinput);
            tvCipher2.setText(userinput);

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
        for(int i=0; i<PlainText.length(); i++){

            for(int j=0; j<alphabet2.length; j++){

                if(Character.isWhitespace(PlainText.toUpperCase().charAt(i))){
                    Cipher += " ";
                    break;
                }else if(PlainText.toUpperCase().charAt(i)== alphabet2[0] ||
                         PlainText.toUpperCase().charAt(i)== alphabet2[7] ||
                         PlainText.toUpperCase().charAt(i)== alphabet2[14] ||
                         PlainText.toUpperCase().charAt(i)== alphabet2[21] ||
                         PlainText.toUpperCase().charAt(i)== alphabet2[28] ||
                         PlainText.toUpperCase().charAt(i)== alphabet2[35] ){

                    Cipher += alphabet2[j];

                }else{

                    Cipher += alphabet2[j+2];
                }

            }
        }
      return Cipher;
    }

}
