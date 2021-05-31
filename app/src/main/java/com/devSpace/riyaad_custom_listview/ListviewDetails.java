package com.devSpace.riyaad_custom_listview;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class ListviewDetails extends AppCompatActivity {

    Cars selectedCar;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview_details);
        getSelectedCar();
        setValues();
    }

    private void getSelectedCar(){
        Intent previousIntent = getIntent();
        String parsedStringID = previousIntent.getStringExtra("id");
        selectedCar = MainActivity.carList.get(Integer.valueOf(parsedStringID));
    }

    private void setValues(){
        TextView tv = (TextView) findViewById(R.id.carName);
        ImageView iv = (ImageView) findViewById(R.id.carImage);
        tv.setText(selectedCar.getName());
        iv.setImageResource(selectedCar.getImage());
    }
}