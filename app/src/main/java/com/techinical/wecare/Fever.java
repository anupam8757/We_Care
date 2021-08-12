package com.techinical.wecare;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Fever extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fever);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        startActivity(new Intent(Fever.this,Register.class));
        finish();
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        startActivity(new Intent(Fever.this,Register.class));
        finish();
    }
}