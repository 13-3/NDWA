package com.example.ndwa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static android.view.View.*;

public class PlayLevel extends AppCompatActivity {
    Button level1_1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play_level);
        level1_1=(Button)findViewById(R.id.level1_1);
        level1_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(),level1_1.class);
                startActivity(i);
                }
        });
            }

}