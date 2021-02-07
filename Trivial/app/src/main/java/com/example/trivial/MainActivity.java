package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText et_j1,et_j2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().hide();

        et_j1 = findViewById(R.id.etJugador1);
        et_j2 = findViewById(R.id.etJugador2);
    }

    public void jugar(View v){

        String nJugador1 = et_j1.getText().toString();
        String nJugador2 = et_j2.getText().toString();

        if(!nJugador1.equals("") && !nJugador2.equals("")) {
            Intent intent = new Intent(this, Juego.class);
            intent.putExtra("jugador1", nJugador1);
            intent.putExtra("jugador2", nJugador2);
            startActivity(intent);
        }else{
            Toast.makeText(this, "Deben intoducir sus nombre", Toast.LENGTH_SHORT).show();
        }
    }

    public void historial(View v){
        Intent intent = new Intent(this, Historial.class);
        startActivity(intent);
    }

}