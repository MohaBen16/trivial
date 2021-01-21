package com.example.trivial;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Quiz extends AppCompatActivity {

    Button ans1,ans2,ans3,ans4;
    TextView score, pregunta;

    private Preguntas mPreguntas = new Preguntas();

    private String mAnswer;
    private int mScore =0;
    //private int mPreguntasLenght = mPreguntas.
     Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        ans1 = findViewById(R.id.answer1);
        ans2 = findViewById(R.id.answer2);
        ans3 = findViewById(R.id.answer3);
        ans4 = findViewById(R.id.answer4);

        score = findViewById(R.id.score);
        pregunta = findViewById(R.id.pregunta);

        updateQuestion(r.nextInt());

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans1.getText() == mAnswer) {
                    mScore++;

                    score.setText("score:" + mScore);

                    updateQuestion(r.nextInt());
                }else{

                    //gameOver();

                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
    public void updateQuestion(int num){
        pregunta.setText(mPreguntas.getQuestion(num));
        ans1.setText(mPreguntas.getChoice1(num));
        ans2.setText(mPreguntas.getChoice2(num));
        ans3.setText(mPreguntas.getChoice3(num));
        ans4.setText(mPreguntas.getChoice4(num));

        mAnswer = mPreguntas.getAnswer(num);
    }
    public void game(){
       // AlertDialog.Builder alertDialogBuilder = new AlertDialog().Builder(MainActivity.this);
    }
}