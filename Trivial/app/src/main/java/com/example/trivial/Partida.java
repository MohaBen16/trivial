package com.example.trivial;

import java.io.Serializable;
import java.util.ArrayList;

public class Partida implements Serializable {
    private int id;
    private String nombre_partida;
    private boolean terminada;
    private ArrayList<Jugador> Jugadores;

    public Partida(int id, String nombre_partida, boolean terminada, ArrayList<Jugador> jugadores) {
        this.id = id;
        this.nombre_partida = nombre_partida;
        this.terminada = terminada;
        Jugadores = jugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre_partida() { return nombre_partida; }

    public void setNombre_partida(String nombre_partida) { this.nombre_partida = nombre_partida; }

    public boolean isTerminada() {
        return terminada;
    }

    public void setTerminada(boolean terminada) {
        this.terminada = terminada;
    }

    public ArrayList<Jugador> getJugadores() {
        return Jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        Jugadores = jugadores;
    }

}
