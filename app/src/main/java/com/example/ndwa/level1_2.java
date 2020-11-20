package com.example.ndwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class level1_2 extends AppCompatActivity {
    /*Button help;
    Context context;*/
    EditText ruselt2;
    Button Save;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_2);
      /*  help=(Button)findViewById(R.id.wanthelp1_2);
        if(help.callOnClick()){
            helper1_2(context);*/

      ruselt2 = findViewById(R.id.ruselt2);
      Save= findViewById(R.id.Save2);
      Save.setOnClickListener(view -> {

          String result2 = ruselt2.getText().toString();
          if(result2 == "DINA"){
              AlertDialog dialog = new AlertDialog.Builder(level1_2.this)
                      .setTitle("You Are Winner Go To Next Level")
                      .setMessage("ASCII Code TO TEXT Result is :DINA")
                      .setNegativeButton("ok",null)
                      .show();

              Intent level2Intent = new Intent(level1_2.this, level2_2.class);
              startActivity(level2Intent);
          }
          else{
              AlertDialog dialogl = new AlertDialog.Builder(level1_2.this)
                      .setTitle("Loser!!!")
                      .setMessage("Try Again...")
                      .setNegativeButton("ok",null)
                      .show();
          }


      });

    }

    public void wanthelp1_2(View view) {

        AlertDialog dialog = new AlertDialog.Builder(level1_2.this)
                .setTitle("Help")
                .setMessage("ASCII")
                .setNegativeButton("ok", null)
                .show();
    }


  /*  public void Save(View view) {

        String result2 = ruselt2.getText().toString();
        if(result2 == "DINA"){

            AlertDialog dialog = new AlertDialog.Builder(level1_2.this)
                    .setTitle("You Are Winner Go To Next Level")
                    .setMessage("ASCII Code TO TEXT Result is :DINA")
                    .setNegativeButton("ok",null)
                    .show();

            Intent level2Intent = new Intent(level1_2.this, level2_2.class);
            startActivity(level2Intent);
        }


    }*/
}



    /*
    //نحتاج ميثود قبلها تستدعي الميثود هذه اذا كانت الاجابة صحيحة
    public static void show(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("You Are Winer Go To Next Level")
                .setMessage("Hint :ASCII Code TO TEXT Result is :DINA")
                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton("Ok", (dialog, which) -> {
                    dialog.dismiss();
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                .setIcon(android.R.drawable.btn_star_big_on)
                .show();
    }
        public static void helper1_2(Context context) {
            new AlertDialog.Builder(context)
                    .setTitle("HELP")
                    .setMessage("Hint :ASCII")
                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("Ok", (dialog, which) -> {
                        dialog.dismiss();
                    })
                    // A null listener allows the button to dismiss the dialog and take no further action.
                    .setIcon(android.R.drawable.ic_lock_idle_lock)
                    .show();
        }
}*/