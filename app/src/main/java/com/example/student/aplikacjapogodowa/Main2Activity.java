package com.example.student.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import butterknife.BindView;

public class Main2Activity extends AppCompatActivity {

    @BindView(R.id.recyclerview)
    View recylerview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
}
