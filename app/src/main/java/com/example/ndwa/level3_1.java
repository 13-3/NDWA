package com.example.ndwa;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class level3_1 extends AppCompatActivity {

    Button Save5;
    Button Next1;

    EditText ruselt5;
    TextView tvCipher;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_1);

        ruselt5 = findViewById(R.id.ruselt5);
        tvCipher = findViewById(R.id.tvCipher);
        Next1 = findViewById(R.id.Next1);


        Save5 = findViewById(R.id.Save5);

        Save5.setOnClickListener(view -> {

            String userinput = ruselt5.getText().toString();
            tvCipher.setText(encryption(userinput));

        });

        Next1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(level3_1.this, level3_2.class);
                startActivity(intent);
            }
        });

    }

    public String encryption(String PlainText) {

        char[] alphabet2 = {

                'A', 'G', 'M', 'S', 'Y', '4',
                'B', 'H', 'N', 'T', 'Z', '5',
                'C', 'I', 'O', 'U', '0', '6',
                'D', 'J', 'P', 'V', '1', '7',
                'E', 'K', 'Q', 'W', '2', '8',
                'F', 'L', 'R', 'X', '3', '9'
        };

        char[] chars = PlainText.toUpperCase().toCharArray();

        String temp = "";

        ArrayList<String> array = new ArrayList<>();


        for (int i = 0; i < chars.length; i++) {
            for (int j = 0; j < alphabet2.length; j++) {
                if (chars[i] == alphabet2[j]) {
                    temp = temp + alphabet2[j + 2];
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


    public void wanthelp3_1(View view) {

        AlertDialog dialog = new AlertDialog.Builder(level3_1.this)
                .setTitle("Help")
                .setMessage("Encrypt your name using NDWA encryption")
                .setNegativeButton("ok", null)
                .show();
    }
}


