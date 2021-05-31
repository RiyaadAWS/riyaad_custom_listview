package com.devSpace.riyaad_custom_listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.List;

public class CustomAdapter extends ArrayAdapter<Cars>{

    public CustomAdapter(Context context, int resource, List<Cars> carList){
        super(context,resource,carList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        Cars cars = getItem(position);

        if(convertView == null){
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.activity_custom_adapter, parent, false);
        }

        TextView tv = (TextView) convertView.findViewById(R.id.carName);
        ImageView iv = (ImageView) convertView.findViewById(R.id.carImage);
        tv.setText(cars.getName());
        iv.setImageResource(cars.getImage());

        return convertView;
    }
}