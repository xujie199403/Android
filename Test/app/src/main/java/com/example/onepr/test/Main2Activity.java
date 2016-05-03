package com.example.onepr.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        TextView tet15 = (TextView) findViewById(R.id.textView15);
        TextView tet16 = (TextView) findViewById(R.id.textView16);
        TextView tet17 = (TextView) findViewById(R.id.textView17);
        TextView tet18 = (TextView) findViewById(R.id.textView18);
        TextView tet19 = (TextView) findViewById(R.id.textView19);
        TextView tet20 = (TextView) findViewById(R.id.textView20);
        TextView tet21 = (TextView) findViewById(R.id.textView21);
        TextView tet22 = (TextView) findViewById(R.id.textView22);


        Intent intent = getIntent();
        Bundle bundle = intent.getExtras();

        String ex = bundle.getString("ex");
        String ye = bundle.getString("ye");
        String he = bundle.getString("he");
        String we = bundle.getString("we");
        String en = bundle.getString("en");
        String Ree = bundle.getString("Ree");
        String re = bundle.getString("re");
        String result = bundle.getString("result");

        tet15.setText(ex);
        tet16.setText(ye);
        tet17.setText(he);
        tet18.setText(we);
        tet19.setText(en);
        tet20.setText(Ree);
        tet21.setText(re);
        tet22.setText(result);



    }
}
