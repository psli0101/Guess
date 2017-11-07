package com.fju.guess.guess;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    Random random = new Random();
    int sec_num = random.nextInt(10)+1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void push (View view) {
        EditText edGuess = (EditText) findViewById(R.id.ed_guess);
        int answer = Integer.parseInt(edGuess.getText().toString());
        if ( answer > sec_num ) {
            Toast.makeText(this, R.string.lesser, Toast.LENGTH_LONG).show();
        } else if ( answer < sec_num ) {
            Toast.makeText(this, R.string.bigger, Toast.LENGTH_LONG).show();
        } else {
            new AlertDialog.Builder(this)
                    .setMessage(R.string.right)
                    .setPositiveButton(R.string.ok, null)
                    .show();
        }
    }
}
