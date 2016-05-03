package com.example.onepr.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;


public class MainActivity extends AppCompatActivity {

    Button btnSub;
    Button btnClear;
    EditText h, w, y, enem;
    RadioGroup radiogroup;
    RadioButton radio1, radio3, radio4, radio5, radio6, radio;
    int i;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSub = (Button) findViewById(R.id.button);
        btnClear = (Button) findViewById(R.id.button2);

        radio1 = (RadioButton) findViewById(R.id.radioButton);
        radio3 = (RadioButton) findViewById(R.id.radioButton3);
        radio4 = (RadioButton) findViewById(R.id.radioButton4);
        radio5 = (RadioButton) findViewById(R.id.radioButton5);
        radio6 = (RadioButton) findViewById(R.id.radioButton6);

        btnClear.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                h = (EditText) findViewById(R.id.editTextHeight);
                w = (EditText) findViewById(R.id.editTextＷeight);
                y = (EditText) findViewById(R.id.editTextYear);
                enem = (EditText) findViewById(R.id.editTextEn);
                h.setText("");
                w.setText("");
                y.setText("");
                enem.setText("");
            }
        });
        btnSub.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View view) {
                h = (EditText) findViewById(R.id.editTextHeight);
                w = (EditText) findViewById(R.id.editTextＷeight);
                y = (EditText) findViewById(R.id.editTextYear);
                enem = (EditText) findViewById(R.id.editTextEn);

                double height = Double.parseDouble(h.getText().toString());
                double weight = Double.parseDouble(w.getText().toString());
                double year = Double.parseDouble(y.getText().toString());
                double enemy = Double.parseDouble(enem.getText().toString());
                double re;

                String result;
                Intent i = new Intent(MainActivity.this, Main2Activity.class);

                Bundle extras = new Bundle();

                if (radio1.isChecked()) {
                    String ex = "男";
                    double ye = year;
                    double he = height;
                    double we = weight;
                    double en = enemy;

                    double ree = 10 * we + 6.25 * he - 5 * ye - 161;

                    if (radio3.isChecked()) {
                        re = ree * 1.2;
                    } else if (radio4.isChecked()) {
                        re = ree * 1.3;
                    } else if (radio5.isChecked()) {
                        re = ree * 1.75;
                    } else {
                        re = ree * 2.0;
                    }
                    re = re - en;
                    if (re > 100) {
                        result = "熱量不足，會導致營養不良";
                    } else if (re <= (-100)) {
                        result = "熱量過多，會導致肥胖";
                    } else {
                        result = "熱量充足，保持下去";
                    }

                    extras.putString("ex", ex + " ");
                    extras.putString("ye", ye + " ");
                    extras.putString("he", he + " ");
                    extras.putString("we", we + " ");
                    extras.putString("en", en + " ");
                    extras.putString("Ree", ree + " ");
                    extras.putString("re", re + " ");
                    extras.putString("result", result);
                } else {
                    String ex = "女";
                    double ye = year;
                    double he = height;
                    double we = weight;
                    double en = enemy;
                    double ree = 10 * we + 6.25 * he - 5 * ye + 5;

                    if (radio3.isChecked()) {
                        re = ree * 1.2;
                    } else if (radio4.isChecked()) {
                        re = ree * 1.3;
                    } else if (radio5.isChecked()) {
                        re = ree * 1.75;
                    } else {
                        re = ree * 2.0;
                    }
                    re = re - en;
                    if (re <= (-100)) {
                        result = "熱量過多，會導致肥胖";
                    } else if (re > 100) {
                        result = "熱量不足，會導致營養不良";
                    } else {
                        result = "熱量充足，保持下去";
                    }

                    extras.putString("ex", ex);
                    extras.putString("ye", ye + " ");
                    extras.putString("he", he + " ");
                    extras.putString("we", we + " ");
                    extras.putString("en", en + " ");
                    extras.putString("Ree", ree + " ");
                    extras.putString("re", re + " ");
                    extras.putString("result", result);
                }
                i.putExtras(extras);
                startActivity(i);
                finish();
            }
        });
    }
}