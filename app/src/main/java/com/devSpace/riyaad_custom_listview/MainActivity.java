package com.devSpace.riyaad_custom_listview;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity{

    public static ArrayList<Cars> carList = new ArrayList<>();
    private ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupData();
        setUpList();
        setUpOnclickListener();
    }

    private void setupData(){
        Cars car = new Cars("0", "Civic type r Ek9", R.drawable.ek);
        carList.add(car);

        Cars car1 = new Cars("1","Civic type r Ek9", R.drawable.ekk);
        carList.add(car1);

        Cars car2 = new Cars("2","Civic type r EP3", R.drawable.ep3a);
        carList.add(car2);

        Cars car3 = new Cars("3","Civic type r EP3", R.drawable.ep3b);
        carList.add(car3);

        Cars car4 = new Cars("4","Civic type r FN2", R.drawable.fn2a);
        carList.add(car4);

        Cars car5 = new Cars("5", "Civic type r FN2", R.drawable.fn2r);
        carList.add(car5);

        Cars car6 = new Cars("6","Civic type r FK8", R.drawable.fk);
        carList.add(car6);

        Cars car7 = new Cars("7","Civic type r FK2", R.drawable.fk2a);
        carList.add(car7);

        Cars car8 = new Cars("8","Civic type r FK2", R.drawable.fkc);
        carList.add(car8);

        Cars car9 = new Cars("9","Civic type r FK2", R.drawable.fk2a);
        carList.add(car9);
    }

    private void setUpList() {
        listView = (ListView) findViewById(R.id.carsListView);
        CustomAdapter adapter = new CustomAdapter(getApplicationContext(), 0, carList);
        listView.setAdapter(adapter);
    }

    private void setUpOnclickListener(){
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l){
                Cars selectCars = (Cars) (listView.getItemAtPosition(position));
                Intent showDetail = new Intent(getApplicationContext(), ListviewDetails.class);
                showDetail.putExtra("id",selectCars.getId());
                startActivity(showDetail);
            }
        });
    }
}