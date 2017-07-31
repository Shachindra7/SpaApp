package com.example.shachindratripathi.spaapp;

import java.util.ArrayList;

/**
 * Created by shachindratripathi on 26/7/17.
 */

public class PreArray {

  private String statuscode;
  private String  message;
    private  ArrayList<CategoryModel>preArrayList;

    public ArrayList<CategoryModel> getPreArrayList() {
        return preArrayList;
    }

    public void setPreArrayList(ArrayList<CategoryModel> preArrayList) {
        this.preArrayList = preArrayList;
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
}
