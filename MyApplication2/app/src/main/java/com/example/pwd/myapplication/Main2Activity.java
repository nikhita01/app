package com.example.pwd.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    TextView t;
    TextView t1;
    TextView t2;
    EditText e;
    EditText e1;
    EditText e2;
    Button b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t=(TextView)findViewById(R.id.textView2);
        t1=(TextView)findViewById(R.id.textView3);

        e=(EditText)findViewById(R.id.editText);
        e1=(EditText)findViewById(R.id.editText2);

        b=(Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i1=new Intent(getApplicationContext(),Main3Activity.class);
                Bundle b1=new Bundle();
                b1.putString("fasting",e.getText().toString());
                b1.putString("after",e1.getText().toString());

                i1.putExtras(b1);
                startActivity(i1);

            }
        });
    }
}
