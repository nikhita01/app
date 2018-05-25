package com.example.pwd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

public class Main22Activity extends AppCompatActivity {
    RatingBar ratingBar;
    Button b;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);
        b=(Button)findViewById(R.id.button);
        ratingBar = (RatingBar) findViewById(R.id.ratingBar);


        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String rating=String.valueOf(ratingBar.getRating());
                Toast.makeText(getApplicationContext(), rating, Toast.LENGTH_LONG).show();
                Intent i9=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(i9);
            }
        });


    }
}
