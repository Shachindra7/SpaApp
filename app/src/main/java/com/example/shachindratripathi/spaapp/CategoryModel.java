package com.example.shachindratripathi.spaapp;

import android.app.Service;

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
    private String id;
    private String description;
    private String duration;
    private String price;
    private String statuscode;
    private String message;
    private String edate;
    private ArrayList<ServiceModel> serviceList;

    public ArrayList<ServiceModel> getServiceList() {
        return serviceList;
    }

    public void setServiceList(ArrayList<ServiceModel> serviceList) {
        this.serviceList = serviceList;
    }

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
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

    public String getEdate() {
        return edate;
    }

    public void setEdate(String edate) {
        this.edate = edate;
    }


}

