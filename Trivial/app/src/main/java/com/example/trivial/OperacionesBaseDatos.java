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

    public void SetPregunta(CategoriaPregunta categoria, String textopregunta) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        int catdb = 0;

        if(categoria == CategoriaPregunta.historia) catdb = 1;
        else if(categoria == CategoriaPregunta.arte) catdb = 2;
        else if(categoria == CategoriaPregunta.deportes) catdb = 3;
        else if(categoria == CategoriaPregunta.ciencia) catdb = 4;
        else if(categoria == CategoriaPregunta.lengua) catdb = 5;

        Cursor fila = db.rawQuery("Select id from pregunta",null);

        int id = 1;
        if (fila.moveToFirst()) {
            do {
                id++;
            } while (fila.moveToNext());
        }

        ContentValues registro = new ContentValues();
        registro.put("id",id);
        registro.put("categoria", catdb);
        registro.put("textopregunta", textopregunta);

        db.insert("pregunta", null, registro);
        db.close();
    }


    public Pregunta GetPregunta(CategoriaPregunta categoria) {
        Pregunta pregunta = null;
        SQLiteDatabase db = bDatos.getReadableDatabase();

        int catdb = 0;

        if(categoria == CategoriaPregunta.historia) catdb = 1;
        else if(categoria == CategoriaPregunta.arte) catdb = 2;
        else if(categoria == CategoriaPregunta.deportes) catdb = 3;
        else if(categoria == CategoriaPregunta.ciencia) catdb = 4;
        else if(categoria == CategoriaPregunta.lengua) catdb = 5;

        Cursor fila = db.rawQuery("select id,categoria,textopregunta from pregunta where categoria = '" + catdb + "'", null);

        Random r1 = new Random();
        int r = r1.nextInt(fila.getCount());

        if(fila.moveToPosition(r)){
            pregunta = new Pregunta(fila.getInt(0), categoria, fila.getString(2));
        }

        /*if (fila.moveToFirst()) {
            do {
               if (fila.getPosition() == r) {
                    pregunta = new Pregunta(fila.getInt(0), categoria, fila.getString(2));
               }
            } while (fila.moveToNext());
        }*/

        db.close();

        return pregunta;
    }

    public Pregunta GetTodasPreguntas(String categoriab) {
        Pregunta pregunta = null;
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,categoria,textopregunta from pregunta", null);

        Random r1 = new Random();
        int r = r1.nextInt(fila.getCount());

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

    public void BorrarTodasPreguntas(){
        SQLiteDatabase db = bDatos.getWritableDatabase();

        db.execSQL("delete from pregunta");
        db.close();
    }

    public void SetRespuesta(int id_pregunta, String textorespuesta, boolean correcta) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        int pcorrecta = 1;
        if(correcta == true) pcorrecta = 0;

        Cursor fila = db.rawQuery("Select id from respuesta",null);

        int id = 1;
        if (fila.moveToFirst()) {
            do {
                id++;
            } while (fila.moveToNext());
        }

        ContentValues registro = new ContentValues();
        registro.put("id",id);
        registro.put("id_pregunta", id_pregunta);
        registro.put("textorespuesta", textorespuesta);
        registro.put("bcorrecta", pcorrecta);

        db.insert("respuesta", null, registro);
        db.close();
    }

    public ArrayList<Respuesta> GetRespuestas(int id_pregunta) {
        ArrayList<Respuesta> Respuestas = new ArrayList<Respuesta>();
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,id_pregunta,textorespuesta,bcorrecta from respuesta where id_pregunta = '" + id_pregunta + "'", null);

        if (fila.moveToFirst()) {
            do {
                boolean correcta = false;
                if(fila.getInt(3) == 0) correcta = true;
                Respuestas.add(new Respuesta(fila.getInt(0),fila.getInt(1),fila.getString(2),correcta));
            } while (fila.moveToNext());
        }

        db.close();

        return Respuestas;
    }

    public void BorrarTodasRespuestas(){
        SQLiteDatabase db = bDatos.getWritableDatabase();

        db.execSQL("delete from respuesta");
        db.close();
    }

    public void SetPartida(boolean terminada,String nombrepartida) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        Cursor fila = db.rawQuery("Select id from partida",null);

        int id = 1;
        if (fila.moveToFirst()) {
            do {
                id++;
            } while (fila.moveToNext());
        }

        int iterminada = 0;
        if(terminada == false) iterminada = 1;

        ContentValues registro = new ContentValues();
        registro.put("id",id);
        registro.put("nombrepartida",nombrepartida);
        //registro.put("bterminada", iterminada);

        db.insert("partida", null, registro);
        db.close();
    }

    public ArrayList<Partida> GetPartida() {
        ArrayList<Partida> partidas = new ArrayList<Partida>();
        SQLiteDatabase db = bDatos.getReadableDatabase();

        //bterminada
        Cursor fila = db.rawQuery("select id,nombrepartida from partida", null);

        if (fila.moveToFirst()) {
            do {
                //boolean correcta = false;
                //if(fila.getInt(2) == 0) correcta = true;
                partidas.add(new Partida(fila.getInt(0),fila.getString(1),false,GetJugador(fila.getInt(0))));
            } while (fila.moveToNext());
        }

        db.close();

        return partidas;
    }

    public void BorrarTodasPartidas(){
        SQLiteDatabase db = bDatos.getWritableDatabase();

        db.execSQL("delete from partida");
        db.close();
    }

    public void SetJugador(int id_partida, String nombre, boolean turno, String posicion, boolean qamarillo, boolean qrosa, boolean qverde, boolean qmarron, boolean qazul, boolean qnaranja, boolean ganador) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        int iturno = 0,iamarillo = 0,irosa = 0,iverde = 0,imarron = 0,iazul = 0,inaranja = 0,iganador = 0;

        Cursor fila = db.rawQuery("Select id from jugador",null);

        int id = 1;
        if (fila.moveToFirst()) {
            do {
                id++;
            } while (fila.moveToNext());
        }

        if(turno == false) iturno = 1;
        if(qamarillo == false) iamarillo = 1;
        if(qrosa == false) irosa = 1;
        if(qverde == false) iverde = 1;
        if(qmarron == false) imarron = 1;
        if(qazul == false) iazul = 1;
        if(qnaranja == false) inaranja = 1;
        if(ganador == false) iganador = 1;

        ContentValues registro = new ContentValues();
        registro.put("id",id);
        registro.put("id_partida", id_partida);
        registro.put("nombre",nombre);
        registro.put("bturno",iturno);
        registro.put("posicion",posicion);
        registro.put("bqamarillo", iamarillo);
        registro.put("bqrosa", irosa);
        registro.put("bqverde", iverde);
        registro.put("bqmarron", imarron);
        registro.put("bqazul", iazul);
        registro.put("bqnaranja", inaranja);
        registro.put("bganador", iganador);

        db.insert("jugador", null, registro);
        db.close();
    }

    public ArrayList<Jugador> GetJugador(int id_partida){
        ArrayList<Jugador> jugadores = new ArrayList<Jugador>();
        SQLiteDatabase db = bDatos.getReadableDatabase();

        Cursor fila = db.rawQuery("select id,id_partida,nombre,bturno,posicion,bqamarillo,bqrosa,bqverde,bqmarron,bqazul,bqnaranja,bganador from jugador where id_partida = '" + id_partida + "'", null);

        if (fila.moveToFirst()) {
            do {
                boolean turno = false;
                boolean qamarillo = false;
                boolean qrosa = false;
                boolean qverde = false;
                boolean qmarron = false;
                boolean qazul = false;
                boolean qnaranja = false;
                boolean ganador = false;

                if(fila.getInt(3) == 0) turno = true;
                if(fila.getInt(5) == 0) qamarillo = true;
                if(fila.getInt(6) == 0) qrosa = true;
                if(fila.getInt(7) == 0) qverde = true;
                if(fila.getInt(8) == 0) qmarron = true;
                if(fila.getInt(9) == 0) qazul = true;
                if(fila.getInt(10) == 0) qnaranja = true;
                if(fila.getInt(11) == 0) ganador = true;

                jugadores.add(new Jugador(fila.getInt(0),id_partida,fila.getString(2),turno,fila.getString(4),qamarillo,qrosa,qverde,qmarron,qazul,qnaranja,ganador));
            } while (fila.moveToNext());
        }

        db.close();

        return jugadores;
    }

    public void BorrarTodosJugadores(){
        SQLiteDatabase db = bDatos.getWritableDatabase();

        db.execSQL("delete from jugador");
        db.close();
    }

}
