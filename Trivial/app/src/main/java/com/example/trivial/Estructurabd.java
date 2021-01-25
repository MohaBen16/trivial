package com.example.trivial;

import java.util.UUID;

public class Estructurabd {

    interface ColumnasPregunta {
        String ID = "id";
        String Categoria = "categoria";
        String TextoPregunta = "texto_pregunta";
    }

    interface ColumnasRespuesta {
        String ID = "id";
        String ID_Pregunta = "id_pregunta";
        String TextoRespuesta = "Texto_Respuesta";
        String Correcta = "correcta";
    }

    interface ColumnasPartida {
        String ID = "id";
        String Terminada = "terminada";
    }

    interface ColumnasJugador {
        String ID = "id";
        String ID_Partida = "id_partida";
        String QuesitoRosa = "quesito_rosa";
        String QuesitoVerde = "quesito_verde";
        String QuesitoMarron = "quesito_marron";
        String QuesitoAzul = "quesito_azul";
        String QuesitoNaranja = "quesito_naranja";
        String QuesitoAmarrillo = "quesito_amarillo";
        String Ganador = "ganador";
    }

    public static class CabecerasPregunta implements ColumnasPregunta{
        public static String generarIdCabeceraPregunta(){
            return "CP-" + UUID.randomUUID().toString();
        }
    }

    public static class CabecerasRespuesta implements ColumnasRespuesta{
        public static String generarIdCabeceraRespuesta(){
            return "CR-" + UUID.randomUUID().toString();
        }
    }

    public static class CabecerasPartida implements ColumnasPartida{
        public static String generarIdCabeceraPartida(){
            return "CPA-" + UUID.randomUUID().toString();
        }
    }

    public static class CabecerasJugador implements ColumnasJugador{
        public static String generarIdCabeceraJugador(){
            return "CJ-" + UUID.randomUUID().toString();
        }
    }

    private Estructurabd(){

    }
}
