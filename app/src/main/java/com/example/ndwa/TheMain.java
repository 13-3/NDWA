package com.example.ndwa;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import static android.view.View.*;
public class TheMain extends AppCompatActivity {

Button play,insteactions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_the_main);
    }
 public void insteactions( View V){
    insteactions=(Button)findViewById(R.id.instructions);
        insteactions.setOnClickListener(new OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent i = new Intent(getApplicationContext(),insteactions.class);
            startActivity(i);
        }
    });}
    public void ExitMethod( View V){
        finish();
    }
    public void PlayMethod( View v){
        play=(Button)findViewById(R.id.Save2);
        play.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getApplicationContext(),PlayLevel.class);
                startActivity(i);
            }
        });

    }
}