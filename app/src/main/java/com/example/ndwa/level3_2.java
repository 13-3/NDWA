package com.example.ndwa;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.widget.Button;

public class level3_2 extends AppCompatActivity {
    Button help;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_level3_2);
        help=(Button)findViewById(R.id.wanthelp3_2);
        if(help.callOnClick()){
            helper3_2(context);
        }}
    //نحتاج ميثود قبلها تستدعي الميثود هذه اذا كانت الاجابة صحيحة
    public static void show(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("You Are Winer Go To Next Level")
                .setMessage("Hint :Find a word AHAD in Sudoku")
                // Specifying a listener allows you to take an action before dismissing the dialog.
                // The dialog is automatically dismissed when a dialog button is clicked.
                .setPositiveButton("Ok", (dialog, which) -> {
                    dialog.dismiss();
                })
                // A null listener allows the button to dismiss the dialog and take no further action.
                .setIcon(android.R.drawable.btn_star_big_on)
                .show();
    }
    public static void helper3_2(Context context) {
        new AlertDialog.Builder(context)
                .setTitle("HELP")
                .setMessage("Hint :Sudoku ")
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