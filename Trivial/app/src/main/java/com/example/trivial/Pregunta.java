package com.example.trivial;

public class Pregunta {
    private int id;
    private CategoriaPregunta categoriaPregunta;
    private String textopregunta;

    public Pregunta(int id, CategoriaPregunta categoriaPregunta, String textopregunta) {
        this.id = id;
        this.categoriaPregunta = categoriaPregunta;
        this.textopregunta = textopregunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public CategoriaPregunta getCategoriaPregunta() {
        return categoriaPregunta;
    }

    public void setCategoriaPregunta(CategoriaPregunta categoriaPregunta) {
        this.categoriaPregunta = categoriaPregunta;
    }

    public String getTextopregunta() {
        return textopregunta;
    }

    public void setTextopregunta(String textopregunta) {
        this.textopregunta = textopregunta;
    }

}
