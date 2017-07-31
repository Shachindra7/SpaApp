package com.example.shachindratripathi.spaapp;

import android.app.Service;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;

/**
 * Created by shachindratripathi on 19/7/17.
 */

public class CategoryModel
{
    private String category_id;
    private String city_id;
    private String name;
    private String image;
    private String edate;
    private ArrayList<ServiceModel> serviceList;

    public String getEdate() {
        return edate;
    }
    public void setEdate(String edate) {
        this.edate = edate;
    }
    public ArrayList<ServiceModel> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<ServiceModel> serviceList) {
        this.serviceList = serviceList;
    }


    public String getCategory_id() {
        return category_id;
    }

    public void setCategory_id(String category_id) {
        this.category_id = category_id;
    }

    public String getCity_id() {
        return city_id;
    }

    public void setCity_id(String city_id) {
        this.city_id = city_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}

