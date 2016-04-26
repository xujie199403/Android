package com.example.onepr.bmr;

import java.text.DecimalFormat;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.RadioButton;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.buttonCalculate);
        button.setOnClickListener(calcBMR);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    private OnClickListener calcBMR = new OnClickListener()
    {
        public void onClick(View v)
        {
            final RadioButton radiobutton = (RadioButton) findViewById(R.id.radioButton);

            DecimalFormat nf = new DecimalFormat("0.00");
            EditText fieldheight = (EditText)findViewById(R.id.inputHeight);
            EditText fieldweight = (EditText)findViewById(R.id.inputWeight);
            EditText fieldyear = (EditText)findViewById(R.id.inputYear);

            double height = Double.parseDouble(fieldheight.getText().toString());
            double weight = Double.parseDouble(fieldweight.getText().toString());
            double year = Double.parseDouble(fieldyear.getText().toString());

            double BMR1 = 13.7 * weight + 5.0 * height - 6.8 * year +66;
            double BMR2 = 9.6 * weight + 1.8 * height - 4.7 * year + 655;

            if(radiobutton.isChecked())
            {
                TextView result = (TextView)findViewById(R.id.textResult);
                result.setText("Your BMR is " + nf.format(BMR1));
            }
            else
            {
                TextView result = (TextView)findViewById(R.id.textResult);
                result.setText("Your BMR is " + nf.format(BMR2) );
            }

//Give health advice

        }
    };
}
