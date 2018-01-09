package com.example.student.aplikacjapogodowa;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {
    /*@BindView(R.id.recyclerview)
    RecyclerView recylerview;*/
    @BindView(R.id.miejsce_button)
    Button miejsce_button;
    @BindView(R.id.lista_button)
    Button lista_button;
    @BindView(R.id.pole_edycji)
    EditText pole_edycji;
    @BindView(R.id.miasto)
    TextView miasto;
    @BindView(R.id.obrazek)
    ImageView obrazek;

    @OnClick(R.id.miejsce_button)
    void onClick_mb() {
        String text = pole_edycji.getText().toString();
        miasto.setText(text);
    }

    @OnClick(R.id.lista_button)
    void onClick_lb() {
        Intent intent = new Intent(MainActivity.this, Main2Activity.class);
        startActivity(intent);

        Bundle bundle = new Bundle();
        bundle.putString("Miasto", "edit");

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        Glide.with(this)
                .load( "http://mammothsite.com/wp-content/uploads/2014/05/weather.png")
                .into(obrazek);

        Intent getData = getIntent();
        Bundle bundle = getIntent().getExtras();


        if (bundle != null) {
            String place = bundle.getString("lista_button");
            miasto.setText(place);
        }




    }


}




