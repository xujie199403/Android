package com.example.tkustaff.run;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Main22Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main22);


        Button btn1 = (Button)findViewById(R.id.button5);
        btn1.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main22Activity.this, MainActivity.class);
                startActivity(intent);
                finish();
            }
        });
        Button btn2 = (Button)findViewById(R.id.button6);
        btn2.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(Main22Activity.this,Main2Activity.class);
                startActivity(intent);
                finish();
            }
        });
    }

}
