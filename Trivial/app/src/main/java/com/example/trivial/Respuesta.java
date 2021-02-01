package com.example.trivial;

public class Respuesta {
    private int id;
    private int id_pregunta;
    private String textorespuesta;
    private boolean correcta;

    public Respuesta(int id, int id_pregunta, String textorespuesta, boolean correcta) {
        this.id = id;
        this.id_pregunta = id_pregunta;
        this.textorespuesta = textorespuesta;
        this.correcta = correcta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_pregunta() {
        return id_pregunta;
    }

    public void setId_pregunta(int id_pregunta) {
        this.id_pregunta = id_pregunta;
    }

    public String getTextorespuesta() {
        return textorespuesta;
    }

    public void setTextorespuesta(String textorespuesta) {
        this.textorespuesta = textorespuesta;
    }

    public boolean isCorrecta() {
        return correcta;
    }

    public void setCorrecta(boolean correcta) {
        this.correcta = correcta;
    }
}
