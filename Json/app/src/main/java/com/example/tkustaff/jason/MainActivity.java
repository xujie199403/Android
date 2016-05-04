package com.example.tkustaff.jason;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {
    TextView a, b;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        a = (TextView) findViewById(R.id.textView);
        b = (TextView) findViewById(R.id.textView2);


        String json="{\"id\":\"2\",\"name\":\"alpha\",\"title\":\"解析JSON格式文字 by alpha的Android課程\" ,\"info\":[{\"lesson\":\"第一篇\",\"data\":\"甚麼是JSON?\"},{\"lesson\":\"第二篇\",\"data\":\"JSON的格式\"},{\"lesson\":\"第三篇\",\"data\":\"解析JSON\"}]}";

        a.setText(json);

        try {
            JSONObject jsonObj = new JSONObject(json);

            String data0 = jsonObj.getString("id");
            String data1 = jsonObj.getString("name");
            String data2 = jsonObj.getString("title");

            JSONArray jsonArray = (JSONArray) jsonObj.get("info");
            String re = "";
            String da ="";
            String le ="";
            for(int i=0;i<jsonArray.length();i++){
            JSONObject o =jsonArray.getJSONObject(i);
                le= o.getString("lesson");
                da=o.getString("data");
                re= re+ le + "\n"+ da + "\n";
           }
            b.setText(data0+"\n"+data1+"\n"+data2+"\n"+re+"\n");
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
