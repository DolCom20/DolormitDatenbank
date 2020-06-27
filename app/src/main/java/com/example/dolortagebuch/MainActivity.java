package com.example.dolortagebuch;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
EditText e1 , e2 , e3, e4, e5;
RatingBar e6;
Button b1, b2;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final SQLiteDatabase dolorCommentarius = this.openOrCreateDatabase("patienten", MODE_PRIVATE,null);

        e1=(EditText)findViewById(R.id.email);
        e2=(EditText)findViewById(R.id.Vorname);
        e3=(EditText)findViewById(R.id.Name);
        e4=(EditText)findViewById(R.id.Geburtsdatum);
        e5=(EditText)findViewById(R.id.passwort);
        e6=(RatingBar)findViewById(R.id.sternpw);
        String s1 = e1.getText().toString();
        String s2 = e2.getText().toString();
        String s3 = e3.getText().toString();
        String s4 = e4.getText().toString();
        //String s5 = e5.getText().toString();
        //float s6 = e6.getRating();
        //String s60 = String.valueOf(s6);

        /*View.OnClickListener b = new View.OnClickListener() {
            @Override
            public void onClick(View v) {



                try{
                    dolorCommentarius.execSQL("CREATE TABLE IF NOT EXISTS patienten " +
                            "(name varchar, vorname varchar, " +
                            "email varchar, gebdatum varchar)");

                    dolorCommentarius.execSQL("INSERT INTO patienten(name, vorname, email, gebdatum, passwort, sterne)"+
                            "VALUES ('"+s3+"','"+s2+"','"+s1+"','"+s4+"') ");

                }catch (Exception e){
                    e.printStackTrace();
                }
            }
        };
        b1=(Button)findViewById(R.id.registrieren1);
        b1.setOnClickListener(b);
        b1.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){

            }

            });*/
        }

    public void registrierenMain(View view) {

        Intent i = new Intent(getApplicationContext(), Registrieren.class);
        startActivity(i);

    }

    public void einloggen(View view) {

        Intent i = new Intent(getApplicationContext(), Einloggen.class);
        startActivity(i);
    }
}