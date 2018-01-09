package com.example.student.aplikacjapogodowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import java.util.ArrayList;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import butterknife.BindView;
import butterknife.ButterKnife;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    RecyclerView recyclerView;

    String place;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        ButterKnife.bind(this);

        ArrayList<Place> places = new ArrayList<>();
        places.add(new Place ("Chorzow",21,"Teatr Rozrywki zaprasza"));
        places.add(new Place("Katowice",25,"Centra handlowe"));
        places.add(new Place("Ruda Sląska", 22,"Basen, wszelkiego rodzaju ośrodki sportowe"));


        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(layoutManager);

        OnClickPlace listener = (view, position) -> {

            place = places.get(position).getPlaceName();
            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
            Bundle bundle = new Bundle();
            bundle.putString("lista_button", place);
            intent.putExtras(bundle);
            startActivity(intent);
        };

        PlaceAdapter placeAdapter = new PlaceAdapter(places,listener);
        recyclerView.setAdapter(placeAdapter);



    }




}
