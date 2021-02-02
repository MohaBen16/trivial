package com.example.trivial;

import java.io.Serializable;
import java.util.ArrayList;

public class Partida implements Serializable {
    private int id;
    private boolean terminada;
    private ArrayList<Jugador> Jugadores;

    public Partida(int id, boolean terminada, ArrayList<Jugador> jugadores) {
        this.id = id;
        this.terminada = terminada;
        Jugadores = jugadores;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
