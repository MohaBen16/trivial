package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Clasificacion extends AppCompatActivity {

    GridLayout grid;
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion);

        getSupportActionBar().hide();

        grid =(GridLayout) findViewById(R.id.grid);
        grid.setRowCount(1);
        grid.setColumnCount(2);

        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(700, 100);

        for (int i =0; i < 5; i++){

            tv = new TextView(this);

            if(i == 0){

                tv.setText("Jugador:");

            }else if( i== 1){

                tv.setText("Puntos:");
            }

            tv.setTextColor(Color.WHITE);
            tv.setTextSize(30);
            tv.setLayoutParams(layoutParams);
            grid.addView(tv,i);

        }

    }
}