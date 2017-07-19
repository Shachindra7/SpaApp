package com.example.shachindratripathi.spaapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by shachindratripathi on 19/7/17.
 */

public class CategoryAdapter extends ArrayAdapter<Category> {


    public CategoryAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull List<Category> objects) {
        super(context, resource, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return super.getView(position, convertView, parent);
    }

}
    class ViewHolder {
        public ImageView imageview;
        public TextView tvcategoryId;
        public TextView tvcityId;
        public TextView tvname;
        public TextView tvimage;
        public TextView tvedate;
        public TextView tvServices;


   }
