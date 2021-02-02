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

import java.util.Random;

public class Quiz extends AppCompatActivity {

    Button ans1,ans2,ans3,ans4;
    TextView score, pregunta;

    CategoriaPregunta categoria = CategoriaPregunta.geografia;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        getSupportActionBar().hide();

        int catdb = getIntent().getIntExtra("categoria",-1);

        if (catdb == 0) categoria = CategoriaPregunta.geografia;
        else if (catdb == 1) categoria = CategoriaPregunta.historia;
        else if (catdb == 2) categoria = CategoriaPregunta.arte;
        else if (catdb == 3) categoria = CategoriaPregunta.deportes;
        else if (catdb == 4) categoria = CategoriaPregunta.ciencia;
        else if (catdb == 5) categoria = CategoriaPregunta.lengua;

        ans1 = findViewById(R.id.answer1);
        ans2 = findViewById(R.id.answer2);
        ans3 = findViewById(R.id.answer3);
        ans4 = findViewById(R.id.answer4);

        score = findViewById(R.id.score);
        pregunta = findViewById(R.id.pregunta);

//        updateQuestion();
        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*if(ans1.getText() == mAnswer) {

                }else{

                    onBackPressed();
                }*/
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*if(ans2.getText() == mAnswer) {

                }else{

                    onBackPressed();
                }*/
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*if(ans3.getText() == mAnswer) {


                }else{

                    onBackPressed();
                }*/
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                /*if(ans4.getText() == mAnswer) {


                }else{

                    onBackPressed();
                }*/
            }
        });
    }
    public void updateQuestion(){
        OperacionesBaseDatos opdb = OperacionesBaseDatos.Instanciar(this);
        int id_pregunta = 1;
        pregunta.setText(opdb.GetPregunta(categoria).getTextopregunta());
        ans1.setText(opdb.GetRespuestas(id_pregunta).get(0).getTextorespuesta());
        ans2.setText(opdb.GetRespuestas(id_pregunta).get(1).getTextorespuesta());
        ans3.setText(opdb.GetRespuestas(id_pregunta).get(2).getTextorespuesta());
        ans4.setText(opdb.GetRespuestas(id_pregunta).get(3).getTextorespuesta());
    }
}