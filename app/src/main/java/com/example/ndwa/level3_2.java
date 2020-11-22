package com.example.ndwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class level3_2 extends AppCompatActivity {

    EditText ruselt6;
    TextView tvCipher2;
    Button Save6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_2);

        char[][] alphabet = {
                {'A', 'B', 'C', 'D', 'E', 'F'},
                {'G', 'H', 'I', 'J', 'K', 'L'},
                {'M', 'N', 'O', 'P', 'Q', 'R'},
                {'S', 'T', 'U', 'V', 'W', 'X'},
                {'Y', 'Z', '0', '1', '2', '3'},
                {'4', '5', '6', '7', '8', '9'}
        };

        ruselt6 = findViewById(R.id.ruselt6);
        tvCipher2 = findViewById(R.id.tvCipher2);
        Save6 = findViewById(R.id.Save6);

        Save6.setOnClickListener(view -> {

            String userinput = ruselt6.getText().toString();

            tvCipher2.setText(Decryption(userinput));

        });


    }

    public String Decryption(String CipherText) {

        char[] alphabet2 = {

                'A', 'G', 'M', 'S', 'Y', '4',
                'B', 'H', 'N', 'T', 'Z', '5',
                'C', 'I', 'O', 'U', '0', '6',
                'D', 'J', 'P', 'V', '1', '7',
                'E', 'K', 'Q', 'W', '2', '8',
                'F', 'L', 'R', 'X', '3', '9'
        };

        char[] chars = CipherText.toUpperCase().toCharArray();

        String temp = "";

        ArrayList<String> array = new ArrayList<>();


        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < alphabet2.length; j++) {
                if (chars[i] == alphabet2[j]) {
                    temp = temp + alphabet2[j - 2];
                }

            }
        }
        array.add(temp);
        String result = "";
        for (String s : array) {
            result += s;
        }
        return result;
    }

    public void wanthelp3_2(View view) {

        AlertDialog dialog = new AlertDialog.Builder(level3_2.this)
                .setTitle("Help")
                .setMessage("Decrypt your name")
                .setNegativeButton("ok", null)
                .show();
    }
}