package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class Historial extends AppCompatActivity {

    private ListView LVpartidas;
    private ArrayList<String> mostrarpartidas;
    private ArrayList<Partida> partidas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historial);

        getSupportActionBar().hide();

        LVpartidas = findViewById(R.id.listapartidas);
        mostrarpartidas = new ArrayList();
        partidas = new ArrayList<>();

        /*OperacionesBaseDatos opdb = OperacionesBaseDatos.Instanciar(this);
        opdb.BorrarTodasPartidas();
        opdb.BorrarTodosJugadores();
        opdb.SetPartida(false,"partidaprueba1");
        opdb.SetPartida(false,"partidaprueba2");
        opdb.SetJugador(1,"moha",true,"b0c",false,false,false,false,false,false,false);
        opdb.SetJugador(1,"gonza",false,"b0c",false,false,false,false,false,false,false);
        opdb.SetJugador(2,"moha1",true,"b0c",false,false,false,false,false,false,false);
        opdb.SetJugador(2,"gonza1",false,"b0c",false,false,false,false,false,false,false);*/

        RellenarArray();
    }

    public void RellenarArray() {
        OperacionesBaseDatos opdb = OperacionesBaseDatos.Instanciar(this);

        partidas = opdb.GetPartida();

        for(Partida partida : partidas){
            mostrarpartidas.add(partida.getNombre_partida());
        }

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mostrarpartidas);
        LVpartidas.setAdapter(adapter);

        LVpartidas.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                CargarPartida(partidas.get(position).getJugadores());
            }
        });
    }

    public void CargarPartida(ArrayList<Jugador> jugadores){
        Intent intent = new Intent(this,Juego.class);
        intent.putExtra("jugadores",jugadores);
        startActivity(intent);
    }

}