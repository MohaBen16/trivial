package com.example.trivial;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.Random;

public final class OperacionesBaseDatos {

    private static BaseDatos bDatos;

    private static OperacionesBaseDatos instancia = new OperacionesBaseDatos();

    private OperacionesBaseDatos() {

    }

    public static OperacionesBaseDatos Instanciar(Context contexto) {
        if (bDatos == null) {
            bDatos = new BaseDatos(contexto);
        }
        return instancia;
    }

    public void SetPregunta(int categoria, String textopregunta) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        ContentValues registro = new ContentValues();
        registro.put("categoria", categoria);
        registro.put("textopregunta", textopregunta);

        db.insert("pregunta", null, registro);
        db.close();
    }


    public Pregunta GetPregunta(CategoriaPregunta categoria) {
        Pregunta pregunta = null;
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,categoria,textopregunta from pregunta where categoria = '" + categoria + "'", null);

        Random r1 = new Random();
        //int r = r1.nextInt(fila.getColumnCount());
        int r = 1;
        if (fila.moveToFirst()) {
            do {
                if (fila.getPosition() == r) {
                    pregunta = new Pregunta(fila.getInt(1), categoria, fila.getString(3));
                }
            } while (fila.moveToNext());
        }

        db.close();

        return pregunta;
    }

    public Pregunta GetTodasPreguntas(String categoriab) {
        Pregunta pregunta = null;
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,categoria,textopregunta from pregunta", null);

        Random r1 = new Random();
        int r = r1.nextInt(fila.getColumnCount());

        if (fila.moveToFirst()) {
            do {
                if (fila.getPosition() == r) {
                    CategoriaPregunta categoria = null;
                    if (fila.getInt(2) == 0) categoria = CategoriaPregunta.geografia;
                    else if (fila.getInt(2) == 1) categoria = CategoriaPregunta.historia;
                    else if (fila.getInt(2) == 2) categoria = CategoriaPregunta.arte;
                    else if (fila.getInt(2) == 3) categoria = CategoriaPregunta.deportes;
                    else if (fila.getInt(2) == 4) categoria = CategoriaPregunta.ciencia;
                    else if (fila.getInt(2) == 5) categoria = CategoriaPregunta.lengua;
                    pregunta = new Pregunta(fila.getInt(1), categoria, fila.getString(3));
                }
            } while (fila.moveToNext());
        }

        db.close();

        return pregunta;
    }

    public void SetRespuesta(int id_pregunta, String textorespuesta, boolean correcta) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        ContentValues registro = new ContentValues();
        registro.put("id_pregunta", id_pregunta);
        registro.put("textorespuesta", textorespuesta);
        registro.put("correcta", correcta);

        db.insert("respuesta", null, registro);
        db.close();
    }

    public ArrayList<Respuesta> GetRespuestas(int categoria) {
        ArrayList<Respuesta> Respuestas = new ArrayList<Respuesta>();
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,id_pregunta,textorespuesta,correcta from respuesta where categoria = '" + categoria + "'", null);

        if (fila.moveToFirst()) {
            do {
                boolean correcta = false;
                if(fila.getInt(4) == 0) correcta = true;
                Respuestas.add(new Respuesta(fila.getInt(1),fila.getInt(2),fila.getString(3),correcta));
            } while (fila.moveToNext());
        }

        db.close();

        return Respuestas;
    }

    public void SetPartida(boolean terminada) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        ContentValues registro = new ContentValues();
        registro.put("terminada", terminada);

        db.insert("partida", null, registro);
        db.close();
    }

    /*public Partida GetPartida() {
        Partida partida = null;
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,terminada from partida", null);

        if (fila.moveToFirst()) {
            do {
                boolean correcta = false;
                if(fila.getInt(2) == 0) correcta = true;
                partida = new Partida(fila.getInt(1),correcta);
            } while (fila.moveToNext());
        }

        db.close();

        return Respuestas;
    }*/

    public void SetJugador(int id_partida, boolean qamarillo, boolean qrosa, boolean qverde, boolean qmarron, boolean qazul, boolean qnaranja, boolean ganador) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        ContentValues registro = new ContentValues();
        registro.put("id_partida", id_partida);
        registro.put("qamarillo", qamarillo);
        registro.put("qrosa", qrosa);
        registro.put("qverde", qverde);
        registro.put("qmarron", qmarron);
        registro.put("qazul", qazul);
        registro.put("qnaranja", qnaranja);
        registro.put("ganador", ganador);

        db.insert("jugador", null, registro);
        db.close();
    }

}
