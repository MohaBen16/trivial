package com.example.trivial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Random;

public class Quiz extends AppCompatActivity {

    Button ans1, ans2, ans3, ans4;
    TextView score, pregunta;

    Pregunta objpregunta;
    boolean esQuesito;
    ArrayList<Respuesta> respuestas;
    ArrayList<Jugador> jugadores;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getSupportActionBar().hide();

        ans1 = findViewById(R.id.answer1);
        ans2 = findViewById(R.id.answer2);
        ans3 = findViewById(R.id.answer3);
        ans4 = findViewById(R.id.answer4);
        score = findViewById(R.id.score);
        pregunta = findViewById(R.id.pregunta);

        //Recoger Objeto Pregunta de la casilla en la que cae
        objpregunta = (Pregunta) getIntent().getSerializableExtra("pregunta");
        esQuesito = getIntent().getBooleanExtra("esQuesito",false);
        jugadores = (ArrayList<Jugador>) getIntent().getSerializableExtra("jugadores");

        //Coger el array de respuestas del objeto Pregunta
        OperacionesBaseDatos opdb = OperacionesBaseDatos.Instanciar(this);
        respuestas = opdb.GetRespuestas(objpregunta.getId());

        //Escribir preguntas en la interfaz
        pregunta.setText(objpregunta.getTextopregunta());
        ans1.setText(respuestas.get(0).getTextorespuesta());
        ans2.setText(respuestas.get(1).getTextorespuesta());
        ans3.setText(respuestas.get(2).getTextorespuesta());
        ans4.setText(respuestas.get(3).getTextorespuesta());

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(0).isCorrecta()) {
                    preguntaAcertada();
                } else {
                    preguntaEquivocada();
                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(1).isCorrecta()) {
                    preguntaAcertada();
                } else {
                    preguntaEquivocada();
                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(2).isCorrecta()) {
                    preguntaAcertada();
                } else {
                    preguntaEquivocada();
                }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(3).isCorrecta()) {
                    preguntaAcertada();
                } else {
                    preguntaEquivocada();
                }
            }
        });
    }

    private void preguntaAcertada(){
        Toast.makeText(Quiz.this, "Acertaste", Toast.LENGTH_SHORT).show();
        for(Jugador jugador : jugadores){
            if(jugador.isTurno() && esQuesito){
                if(objpregunta.getCategoriaPregunta().equals(CategoriaPregunta.geografia)) jugador.setQazul(true);
                else if(objpregunta.getCategoriaPregunta().equals(CategoriaPregunta.historia)) jugador.setQamarillo(true);
                else if(objpregunta.getCategoriaPregunta().equals(CategoriaPregunta.arte)) jugador.setQmarron(true);
                else if(objpregunta.getCategoriaPregunta().equals(CategoriaPregunta.deportes)) jugador.setQnaranja(true);
                else if(objpregunta.getCategoriaPregunta().equals(CategoriaPregunta.ciencia)) jugador.setQverde(true);
                else if(objpregunta.getCategoriaPregunta().equals(CategoriaPregunta.lengua)) jugador.setQrosa(true);
            }
        }

        Intent intent = new Intent(this,Juego.class);
        intent.putExtra("jugadores",jugadores);
        startActivity(intent);
    }

    private void preguntaEquivocada(){
        Toast.makeText(Quiz.this, "Fallaste", Toast.LENGTH_SHORT).show();
        for(Jugador jugador : jugadores){
            if(jugador.isTurno()) jugador.setTurno(false);
            else jugador.setTurno(true);
        }

        Intent intent = new Intent(this,Juego.class);
        intent.putExtra("jugadores",jugadores);
        startActivity(intent);
    }
}