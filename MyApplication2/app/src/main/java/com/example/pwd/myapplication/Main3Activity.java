package com.example.pwd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main3Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Bundle b1=this.getIntent().getExtras();
        TextView t=(TextView)findViewById(R.id.textView);
        TextView t1=(TextView)findViewById(R.id.textView5);
        t.setText(b1.getCharSequence("fasting"));
        t1.setText(b1.getCharSequence("after"));
        Button bb=(Button)findViewById(R.id.button4);
        bb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent ii=new Intent(getApplicationContext(),MainActivity.class);
                startActivity(ii);
            }
        });

    }
}
