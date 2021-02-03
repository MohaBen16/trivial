package com.example.trivial;

import java.io.Serializable;

public class Jugador implements Serializable {
    private int id;
    private int id_partida;
    private String nombre;
    private boolean turno;
    private String posicion;
    private boolean qamarillo;
    private boolean qrosa;
    private boolean qverde;
    private boolean qmarron;
    private boolean qazul;
    private boolean qnaranja;
    private boolean ganador;

    public Jugador(int id, int id_partida, String nombre, boolean turno, String posicion, boolean qamarillo, boolean qrosa, boolean qverde, boolean qmarron, boolean qazul, boolean qnaranja, boolean ganador) {
        this.id = id;
        this.id_partida = id_partida;
        this.nombre = nombre;
        this.turno = turno;
        this.posicion = posicion;
        this.qamarillo = qamarillo;
        this.qrosa = qrosa;
        this.qverde = qverde;
        this.qmarron = qmarron;
        this.qazul = qazul;
        this.qnaranja = qnaranja;
        this.ganador = ganador;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId_partida() {
        return id_partida;
    }

    public void setId_partida(int id_partida) {
        this.id_partida = id_partida;
    }

    public String getNombre() { return nombre; }

    public void setNombre(String nombre) { this.nombre = nombre; }

    public boolean isTurno() { return turno; }

    public void setTurno(boolean turno) { this.turno = turno; }

    public String getPosicion() { return posicion; }

    public void setPosicion(String posicion) { this.posicion = posicion; }

    public boolean isQamarillo() {
        return qamarillo;
    }

    public void setQamarillo(boolean qamarillo) {
        this.qamarillo = qamarillo;
    }

    public boolean isQrosa() {
        return qrosa;
    }

    public void setQrosa(boolean qrosa) {
        this.qrosa = qrosa;
    }

    public boolean isQverde() {
        return qverde;
    }

    public void setQverde(boolean qverde) {
        this.qverde = qverde;
    }

    public boolean isQmarron() {
        return qmarron;
    }

    public void setQmarron(boolean qmarron) {
        this.qmarron = qmarron;
    }

    public boolean isQazul() {
        return qazul;
    }

    public void setQazul(boolean qazul) {
        this.qazul = qazul;
    }

    public boolean isQnaranja() {
        return qnaranja;
    }

    public void setQnaranja(boolean qnaranja) {
        this.qnaranja = qnaranja;
    }

    public boolean isGanador() {
        return ganador;
    }

    public void setGanador(boolean ganador) {
        this.ganador = ganador;
    }

}
