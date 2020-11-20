package com.example.ndwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class PlayLevel extends AppCompatActivity {
    Button level1_1, level1_2, level2_1 , level2_2 , level3_1 , level3_2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_level);
        level1_1=findViewById(R.id.level1_1);
        level1_2=findViewById(R.id.level1_2);
        level2_1=findViewById(R.id.level2_1);
        level2_2=findViewById(R.id.level2_2);
        level3_1=findViewById(R.id.level3_1);
        level3_2=findViewById(R.id.level3_2);

        level1_1.setOnClickListener(view -> {
            Intent i = new Intent(PlayLevel.this,level1_1.class);
            startActivity(i);
            });



        level1_2.setOnClickListener(view -> {
            Intent i = new Intent(PlayLevel.this,level1_2.class);
            startActivity(i);
        });

        level2_1.setOnClickListener(view -> {
            Intent i = new Intent(PlayLevel.this,level2_1.class);
            startActivity(i);
        });

        level2_2.setOnClickListener(view -> {
            Intent i = new Intent(PlayLevel.this,level2_2.class);
            startActivity(i);
        });

        level3_1.setOnClickListener(view -> {
            Intent i = new Intent(PlayLevel.this,level3_1.class);
            startActivity(i);
        });

        level3_2.setOnClickListener(view -> {
            Intent i = new Intent(PlayLevel.this,level3_2.class);
            startActivity(i);
        });

}

}


