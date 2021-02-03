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

    public void SetPartida(boolean terminada) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        Cursor fila = db.rawQuery("Select id from partida",null);

        int id = 1;
        if (fila.moveToFirst()) {
            do {
                id++;
            } while (fila.moveToNext());
        }

        ContentValues registro = new ContentValues();
        registro.put("id",id);
        registro.put("bterminada", terminada);

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

    public void SetJugador(int id_partida,String poscion,boolean qamarillo, boolean qrosa, boolean qverde, boolean qmarron, boolean qazul, boolean qnaranja, boolean ganador) {
        SQLiteDatabase db = bDatos.getWritableDatabase();

        //PASAR BOLEAN A INT

        Cursor fila = db.rawQuery("Select id from jugador",null);

        int id = 1;
        if (fila.moveToFirst()) {
            do {
                id++;
            } while (fila.moveToNext());
        }

        ContentValues registro = new ContentValues();
        registro.put("id",id);
        registro.put("poscion",poscion);
        registro.put("id_partida", id_partida);
        registro.put("bqamarillo", qamarillo);
        registro.put("bqrosa", qrosa);
        registro.put("bqverde", qverde);
        registro.put("bqmarron", qmarron);
        registro.put("bqazul", qazul);
        registro.put("bqnaranja", qnaranja);
        registro.put("bganador", ganador);

        db.insert("jugador", null, registro);
        db.close();
    }

}
