package com.example.student.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;

import butterknife.BindView;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        ArrayList<String> places = new ArrayList<>(Arrays.asList("Chorzów", "Katowice", "Ruda Sląska"));


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        //PlaceAdapter placeAdapter = new PlaceAdapter(places);
        //recyclerView.setAdapter(placeAdapter);


        /*ArrayList<Place> places = new ArrayList<>();
        places.add(1,"Chorzow");
        places.add(1,"Katowice");
        places.add(new Place("Chorzow", 11));*/
    }




}
