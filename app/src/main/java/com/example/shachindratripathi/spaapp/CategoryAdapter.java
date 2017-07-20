package com.example.shachindratripathi.spaapp;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

import static android.R.attr.resource;

/**
 * Created by shachindratripathi on 19/7/17.
 */

public class CategoryAdapter extends ArrayAdapter<Category> {



    ArrayList<Category> ArrayListCategory;
    int Resource;
    Context context;
    LayoutInflater vi;


    public CategoryAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<Category> objects) {
        super(context, resource, objects);

        ArrayListCategory = objects;
        Resource = resource;
        this.context = context;
        vi = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null){
            convertView= vi.inflate(Resource,null);
            holder = new ViewHolder();
            holder.imageview = (ImageView)convertView.findViewById(R.id.imageView);
            holder.tvcategoryId = (TextView)convertView.findViewById(R.id.tvcategoryId);
            holder.tvname = (TextView)convertView.findViewById(R.id.tvcityId);
            holder.tvname = (TextView)convertView.findViewById(R.id.tvname);
            holder.tvname = (TextView)convertView.findViewById(R.id.tvimage);
            holder.tvname = (TextView)convertView.findViewById(R.id.tvedate);
            holder.tvname = (TextView)convertView.findViewById(R.id.tvServices);

            convertView.setTag(holder); 


        }
        else {
            holder = (ViewHolder)convertView.getTag();

        }
       return convertView ;
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
