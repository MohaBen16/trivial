package com.example.trivial;

public class Preguntas {

    private String mPreguntas[] = {
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?",
            "Which is the first planet in the solar system?"


    };

    private String mChoices[][] = {
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"},
        {"Mercury","Venus","Mars","Saturn"}
    };

    private String mCorrectAnswers [] = {"Mercury","Mercury","Mercury","Mercury","Mercury","Mercury","Mercury","Mercury","Mercury"};


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
        String choice = mChoices[a][4];
        return choice;
    }
    public String getAnswer(int a){
        String answer = mCorrectAnswers[a];
        return answer;
    }
}
