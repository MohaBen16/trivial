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
    ArrayList<Respuesta> respuestas;

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
                    onBackPressed();
                } else {
                    Toast.makeText(Quiz.this, "NOOOOOO", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(1).isCorrecta()) {
                    onBackPressed();
                } else {
                    Toast.makeText(Quiz.this, "NOOOOOO", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(2).isCorrecta()) {
                    onBackPressed();
                } else {
                    Toast.makeText(Quiz.this, "NOOOOOO", Toast.LENGTH_SHORT).show();
                }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (respuestas.get(3).isCorrecta()) {
                    onBackPressed();
                } else {
                    Toast.makeText(Quiz.this, "NOOOOOO", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}