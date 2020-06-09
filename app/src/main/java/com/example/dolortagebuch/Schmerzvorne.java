package com.example.dolortagebuch;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Schmerzvorne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.schmerzvorne);
    }

    public void test(View view)
    {
        Toast.makeText(this, "Gedrückt!", Toast.LENGTH_LONG).show();
        Button oberschenkel = findViewById(R. id. obeinor);
        oberschenkel.setBackgroundColor(Color.parseColor("#000000"));
    }
}
