package com.example.trivial;

public class Jugador {
    private int id;
    private int id_partida;
    private boolean qamarillo;
    private boolean qrosa;
    private boolean qverde;
    private boolean qmarron;
    private boolean qazul;
    private boolean qnaranja;
    private boolean ganador;

    public Jugador(int id, int id_partida, boolean qamarillo, boolean qrosa, boolean qverde, boolean qmarron, boolean qazul, boolean qnaranja, boolean ganador) {
        this.id = id;
        this.id_partida = id_partida;
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
