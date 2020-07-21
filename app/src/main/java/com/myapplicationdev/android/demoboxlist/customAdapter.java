package com.myapplicationdev.android.demoboxlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;

import java.util.ArrayList;

public class customAdapter extends ArrayAdapter {
    Context parent_context;
    int layout_id;
    ArrayList<pojo> colorList;

    public customAdapter(Context context, int resource, ArrayList<pojo> objects){
        super(context, resource,objects);
        parent_context = context;
        layout_id = resource;
        colorList = objects;
    }
    public View getView(int position , View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) parent_context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        View rowView = inflater.inflate(layout_id,parent,false);
        ImageView ivColor = rowView.findViewById(R.id.imageView);

        pojo currentItem = colorList.get(position);

        if(currentItem.getColor() == "blue"){
            ivColor.setImageResource(R.drawable.blue_box);
        }else if(currentItem.getColor() == "brown"){
            ivColor.setImageResource(R.drawable.brown_box);
        }else if (currentItem.getColor() == "orange"){
            ivColor.setImageResource(R.drawable.orange_box);
        }
        return rowView;
    }

}
