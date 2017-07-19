package com.example.shachindratripathi.spaapp;

import android.content.res.AssetManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.google.gson.Gson;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;

import static android.R.attr.data;
import static android.R.attr.text;


public class MainActivity extends AppCompatActivity {

    ListView list;
    CategoryAdapter adapter;
    ArrayList<Category> categoryList;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.json);
        MainActivity m = new MainActivity();
         readJson(new View(this));

        categoryList = new ArrayList<>();



    }


    public String readJson(View view) {
        TextView JSONtextView = (TextView) findViewById(R.id.JSONtextView);


        AssetManager am = getAssets();
        String text = "";
        try {
            InputStream is = getAssets().open("spa_dummy.json");
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            text = new String(buffer);
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return text;


    }

    private void parseJson(String s) {

        StringBuilder builder = new StringBuilder();
        try {
            JSONObject jsonObject = new JSONObject(String.valueOf(text));
            JSONArray jsonArray = new JSONArray("data");



        } catch (JSONException e) {
            e.printStackTrace();
        }


    }
}

