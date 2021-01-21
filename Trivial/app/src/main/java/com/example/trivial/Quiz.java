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

    private Preguntas mPregunta = new Preguntas();

    private String mAnswer;
    private int mScore =0;
    private int mPreguntasLenght = mPregunta.mPreguntas.length;
     Random r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        r = new Random();

        ans1 = findViewById(R.id.answer1);
        ans2 = findViewById(R.id.answer2);
        ans3 = findViewById(R.id.answer3);
        ans4 = findViewById(R.id.answer4);

        score = findViewById(R.id.score);
        pregunta = findViewById(R.id.pregunta);

        updateQuestion(r.nextInt(mPreguntasLenght));

        ans1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans1.getText() == mAnswer) {
                    mScore++;

                    score.setText("score:" + mScore);

                    updateQuestion(r.nextInt(mPreguntasLenght));
                }else{

                    gameOver();

                }
            }
        });
        ans2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans2.getText() == mAnswer) {
                    mScore++;

                    score.setText("score:" + mScore);

                    updateQuestion(r.nextInt(mPreguntasLenght));
                }else{

                    gameOver();

                }
            }
        });
        ans3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans3.getText() == mAnswer) {
                    mScore++;

                    score.setText("score:" + mScore);

                    updateQuestion(r.nextInt(mPreguntasLenght));
                }else{

                    gameOver();

                }
            }
        });
        ans4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(ans4.getText() == mAnswer) {
                    mScore++;

                    score.setText("score:" + mScore);

                    updateQuestion(r.nextInt(mPreguntasLenght));
                }else{

                    gameOver();

                }
            }
        });
    }
    public void updateQuestion(int num){
        pregunta.setText(mPregunta.getQuestion(num));
        ans1.setText(mPregunta.getChoice1(num));
        ans2.setText(mPregunta.getChoice2(num));
        ans3.setText(mPregunta.getChoice3(num));
        ans4.setText(mPregunta.getChoice4(num));

        mAnswer = mPregunta.getAnswer(num);
    }
    public void gameOver(){

        Toast.makeText(getApplicationContext(), "game over ", Toast.LENGTH_SHORT).show();

       AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(Quiz.this);

       alertDialogBuilder
               .setMessage("Game over! Tour Score is "+mScore + "points")
               .setCancelable(false)
               .setPositiveButton("New Game ", new DialogInterface.OnClickListener() {
                   @Override
                   public void onClick(DialogInterface dialog, int which) {

                       startActivity( new Intent(getApplicationContext(), MainActivity.class));
                   }
                 })
               .setNegativeButton("Exit",
                       new DialogInterface.OnClickListener() {
                           @Override
                           public void onClick(DialogInterface dialog, int which) {
                               finish();
                           }
                       });

    }
}