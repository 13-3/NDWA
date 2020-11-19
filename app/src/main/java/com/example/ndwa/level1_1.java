package com.example.ndwa;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Context;
import android.widget.Button;

import androidx.appcompat.app.AlertDialog;
public class level1_1 extends AppCompatActivity {
    Button help;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level1_1);
        help=(Button)findViewById(R.id.wanthelp1_1);
        if(help.callOnClick()){
            helper(context);
        }
    }
    //نحتاج ميثود قبلها تستدعي الميثود هذه اذا كانت الاجابة صحيحة

        public static void show(Context context) {
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
        }
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
    }
