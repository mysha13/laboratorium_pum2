package com.example.student.aplikacjapogodowa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Miejsce_but=findViewById(R.id.miejsce_button);
        Button Lista_but=findViewById(R.id.lista_button);
        final EditText edit =findViewById(R.id.pole_edycji);
        final TextView Miasto  =findViewById(R.id.miasto);

        Miejsce_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String text=edit.getText().toString();
                Miasto.setText(text);

            }
        });

        Lista_but.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


            }
        });

    }



}
