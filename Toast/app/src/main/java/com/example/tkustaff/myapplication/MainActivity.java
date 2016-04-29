package com.example.tkustaff.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button)findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context,
                        "you press Yes",
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });
        Button btn2 = (Button)findViewById(R.id.button2);
        btn2.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Context context = getApplicationContext();
                Toast toast = Toast.makeText(context,
                        "you press no",
                        Toast.LENGTH_LONG);
                toast.show();
            }
        });
    }
}
