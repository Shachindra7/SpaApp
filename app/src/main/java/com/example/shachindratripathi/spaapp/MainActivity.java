package com.example.shachindratripathi.spaapp;

import android.app.Service;
import android.content.res.AssetManager;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;



public class MainActivity extends AppCompatActivity {


    CategoryAdapter adapter;
    ArrayList<CategoryModel> categoryList;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sub_category);

        MainActivity m = new MainActivity();
        categoryList = new ArrayList<CategoryModel>();

        //readJson();
        parseJson();
        //readJsonFromAssets();
        //parseJson(readJson());;
        //categoryList = new ArrayList<>();

    }
    @NonNull
    private String readJsonFromAssets(){
        BufferedReader reader = null;
        StringBuilder builder = new StringBuilder();
        try {
           /* reader = new BufferedReader(
                    new InputStreamReader(getAssets().open("spa_dummy_data.txt")));*/
            reader = new BufferedReader(
                    new InputStreamReader(getResources().openRawResource(R.raw.spa_dummy_data)));

            // do reading, usually loop until end of file reading
            String mLine;
            while ((mLine = reader.readLine()) != null) {
                //process line
                builder.append(mLine);
            }
        } catch (IOException e) {
            //log the exception
        } finally {
            if (reader != null) {
                try {
                    reader.close();
                } catch (IOException e) {
                    //log the exception
                }
            }
        }

        return builder.toString();
    }

    private void parseJson() {

        StringBuilder builder = new StringBuilder();
        try {
            JSONObject jsonObject = new JSONObject(DummyJsonClass.DUMMY_JSON);

            JSONArray jsonArray = jsonObject.getJSONArray("data");

            ArrayList<CategoryModel> dataModelList = new ArrayList<>();
            for(int i = 0; i<jsonArray.length(); i++){

                CategoryModel category = new CategoryModel();

                JSONObject realObject = jsonArray.getJSONObject(i);
                category.setCategory_id(realObject.getString("category_id"));
                category.setCity_id(realObject.getString("city_id"));
                category.setName(realObject.getString("name"));
                category.setImage(realObject.getString("image"));
                category.setEdate(realObject.getString("edate"));

                ArrayList<ServiceModel> serviceList = new ArrayList<>();
                for(int j=0;j<realObject.getJSONArray("services").length();j++){
                    JSONObject serviceObject = realObject.getJSONArray("services").getJSONObject(j);
                    ServiceModel services  = new ServiceModel();
                    services.setEdate(serviceObject.getString("edate"));
                    services.setId(serviceObject.getString("id"));
                    services.setCategory_id(serviceObject.getString("category_id"));
                    services.setCity_id(serviceObject.getString("city_id"));
                    services.setTitle(serviceObject.getString("title"));
                    services.setDescription(serviceObject.getString("description"));
                    services.setDuration(serviceObject.getString("duration"));
                    services.setPrice(serviceObject.getString("price"));
                    services.setImage(serviceObject.getString("image"));
                    serviceList.add(services);
                }
                category.setServiceList(serviceList);
                dataModelList.add(category);
                Log.i("parsed Data",dataModelList.toString());

            }


        } catch (JSONException e) {
            e.printStackTrace();
        }
        //Adaptor code to be included.
        //list.setAdapter(adapter);
    }
}

