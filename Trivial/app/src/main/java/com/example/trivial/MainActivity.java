package com.example.trivial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText et_j1,et_j2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_j1 = findViewById(R.id.etJugador1);
        et_j2 = findViewById(R.id.etJugador2);
    }

    public void jugar(View v){

        Intent intent = new Intent(this, Juego.class);
        intent.putExtra("jugador1",et_j1.getText());
        intent.putExtra("jugador2",et_j2.getText());
        startActivity(intent);
    }
}