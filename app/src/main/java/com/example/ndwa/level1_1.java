package com.example.ndwa;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.content.Context;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
public class level1_1 extends AppCompatActivity {
   // Button help;
    //Context context;
    EditText ruselt;
    Button Save2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_1);
     /*   help=(Button)findViewById(R.id.wanthelp1_1);
           if(help.callOnClick()){
               helper(context);*/
            ruselt = findViewById(R.id.ruselt1);
            Save2 = findViewById(R.id.Save2);

        }
        public void wanthelp1_1(View view){

            AlertDialog dialog = new AlertDialog.Builder(level1_1.this)
                    .setTitle("Help")
                    .setMessage("Hint: One of computers filed")
                    .setNegativeButton("ok",null)
                    .show();
        }


        public void Save2(View view){
           String result = ruselt.getText().toString();
            if(result == "info security"){

                AlertDialog dialog = new AlertDialog.Builder(level1_1.this)
                        .setTitle("You Are Winner Go To Next Level")
                        .setMessage("Result:073078070079032083069067085082073084089")
                        .setNegativeButton("ok",null)
                        .show();
                Intent levelIntent = new Intent(level1_1.this, level1_2.class);
                startActivity(levelIntent);

            }
            else{
                AlertDialog dialogl = new AlertDialog.Builder(level1_1.this)
                        .setTitle("Loser!!!")
                        .setMessage("Try Again...")
                        .setNegativeButton("ok",null)
                        .show();
            }


    }
    }













    //نحتاج ميثود قبلها تستدعي الميثود هذه اذا كانت الاجابة صحيحة

      /*  public static void show(Context context) {
            new AlertDialog.Builder(context)
                    .setTitle("You Are Winner Go To Next Level")
                    .setMessage("Result:073078070079032083069067085082073084089")
                    // Specifying a listener allows you to take an action before dismissing the dialog.
                    // The dialog is automatically dismissed when a dialog button is clicked.
                    .setPositiveButton("Ok", (dialog, which) -> {
                        dialog.dismiss();
                    })
                    // A null listener allows the button to dismiss the dialog and take no further action.
                    .setIcon(android.R.drawable.btn_star_big_on)
                    .show();
        } */

      /*
    public static void helper(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("HELP")
                .setMessage("Hint :One of computers filed")
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


