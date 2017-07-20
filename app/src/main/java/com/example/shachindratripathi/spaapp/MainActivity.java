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
        ListView JSONtextView = (ListView) findViewById(R.id.JSONtextView);


        AssetManager am = getAssets();
        String text = "";
        try {
            InputStream is = getAssets().open("spa_dummy.txt");
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
            JSONArray jsonArray = jsonObject.getJSONArray("data");
            for(int i = 0; i<= jsonArray.length(); i++){
                Category category = new Category();
                JSONObject realObject = jsonArray.getJSONObject(i);
                category.setCategory_id(realObject.getString("category_id"));
                category.setCity_id(realObject.getString("category_id"));
                category.setName(realObject.getString("category_id"));
                category.setImage(realObject.getString("category_id"));
                category.setEdate(realObject.getString("category_id"));
                categoryList.add(category);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
        CategoryAdapter adapter = new CategoryAdapter(getApplicationContext(),R.layout.category,categoryList);
        list.setAdapter(adapter);
    }
}

