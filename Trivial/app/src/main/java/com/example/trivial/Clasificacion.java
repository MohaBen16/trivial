package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.GridLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class Clasificacion extends AppCompatActivity {

    ListView listapuntuaciones;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_clasificacion);

        getSupportActionBar().hide();

        listapuntuaciones = findViewById(R.id.listapuntuaciones);

        final ArrayList<Jugador> jugadores = (ArrayList<Jugador>) getIntent().getSerializableExtra("jugadores");
        ArrayList<String> puntuaciones = new ArrayList<>();

        int i = 2;
        for(Jugador jugador : jugadores){
            puntuaciones.add("Jugador: " + jugador.getNombre() + " puntos: " + i);
            i--;
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, puntuaciones);
        listapuntuaciones.setAdapter(adapter);

        listapuntuaciones.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                regresarAlTablero(jugadores);
            }
        });
    }


    public void regresarAlTablero(ArrayList<Jugador> jugadores){
        Intent intent = new Intent();
        intent.putExtra("jugadores",jugadores);
        setResult(1,intent);
        finish();
    }
}