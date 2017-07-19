package com.example.shachindratripathi.spaapp;

import android.content.res.AssetManager;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.json);
        MainActivity m = new MainActivity();
        parseJson(readJson());


    }


    public String readJson() {
        TextView JSONtextView = (TextView) findViewById(R.id.JSONtextView);


        AssetManager am = getAssets();
        String text = "";
        try {
            InputStream is = getAssets().open("spa_dummy.txt");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer, "UTF-8");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;


    }


//    private void parseJsonData(String s){
//        try {
//            JSONObject jsonObject = new JSONObject(s);
//
//
//        } catch (JSONException e) {
//            e.printStackTrace();
//        }
//    }

    private void parseJson(String s) {
        TextView JSONtextView = (TextView) findViewById(R.id.JSONtextView);
        StringBuilder builder = new StringBuilder();
        try {
            JSONObject root = new JSONObject(s);
            JSONObject spa = root.getJSONObject("JSON");
            builder.append("Statuscode:")
                    .append(spa.getString("statuscode")).append("\n");
            builder.append("Message:")
                    .append(spa.getString("message")).append("\n");
            JSONArray data = spa.getJSONArray("data");
            for (int i = 0; i <= data.length(); i++) {
                JSONObject spa1 = spa.getJSONObject(String.valueOf(i));
                builder.append(spa1.getString("category_id"))
                        .append("\n")
                        .append(spa1.getString("city_id"))
                        .append("\n")
                        .append(spa1.getString("name"))
                        .append("\n")
                        .append(spa1.getString("image"))
                        .append("\n")
                        .append(spa1.getString("edate"))
                        .append("\n");
            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
        JSONtextView.setText(builder.toString());

    }
}

