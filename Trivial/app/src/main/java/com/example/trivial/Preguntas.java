package com.example.trivial;

public class Preguntas {

    public String mPreguntas[] = {
            "pregunta 1?",
            "pregunta 2?",
            "pregunta 3?",
            "pregunta 4?",
            "pregunta 5?",
            "pregunta 6?",
            "pregunta 7?",
            "pregunta 8?",
            "pregunta 9?"


    };

    private String mChoices[][] = {
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"},
        {"Respuesta1","Respuesta2","Respuesta3","Respuesta4"}
    };

    private String mCorrectAnswers [] = {"Respuesta1","Respuesta2","Respuesta3","Respuesta4","Respuesta1","Respuesta2","Respuesta3","Respuesta4","Respuesta1"};


    public String getQuestion(int a){
        String question = mPreguntas[a];
        return question;
    }
    public String getChoice1(int a){
        String choice = mChoices[a][0];
        return choice;
    }

    public String getChoice2(int a){
        String choice = mChoices[a][1];
        return choice;
    }
    public String getChoice3(int a){
        String choice = mChoices[a][2];
        return choice;
    }
    public String getChoice4(int a){
        String choice = mChoices[a][3];
        return choice;
    }
    public String getAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
