package com.example.tkustaff.chat;

import android.app.Activity;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.KeyEvent;
import android.view.View;
import android.view.Menu;
import android.widget.EditText;
import android.view.View.OnKeyListener;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
    private TextView output;
    private EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        input = (EditText) findViewById(R.id.editText1);
        output = (TextView) findViewById(R.id.textViewOutput);

        input.setOnKeyListener(Linster1);
    }

    private OnKeyListener Linster1 = new OnKeyListener() {
        public boolean onKey(View v, int keyCode, KeyEvent event) {
            output.setText(input.getText());
            return false;
        }
    };
}
