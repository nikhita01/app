package com.example.pwd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
  Button rep;
  Button chc;
  Button con;
  Button abo;
  Button inf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rep=(Button)findViewById(R.id.button);
        chc=(Button)findViewById(R.id.button2);
        con=(Button)findViewById(R.id.button5);
        abo=(Button)findViewById(R.id.button6);
        inf=(Button)findViewById(R.id.button3);

        rep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Main2Activity.class);
                startActivity(i);
            }
        });
        inf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i2= new Intent(getApplicationContext(),information.class);
                startActivity(i2);
            }
        });
        abo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i3=new Intent(getApplicationContext(),Main22Activity.class);
                startActivity(i3);
            }
        });
        chc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i4=new Intent(getApplicationContext(),Main4Activity.class);
                startActivity(i4);
            }
        });
        con.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i5=new Intent(getApplicationContext(),Main5Activity.class);
                startActivity(i5);
            }
        });
    }
}
