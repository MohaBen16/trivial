package com.example.trivial;

import android.app.ActionBar;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import com.example.trivial.Estructurabd.CabecerasPregunta;
import com.example.trivial.Estructurabd.CabecerasRespuesta;
import com.example.trivial.Estructurabd.CabecerasPartida;
import com.example.trivial.Estructurabd.CabecerasJugador;

import androidx.annotation.Nullable;

public class BaseDatosTrivial  extends SQLiteOpenHelper {

    private static final String NOMBRE_BASE_DATOS = "trivialbd.db";

    private static final int VERSION_ACTUAL = 1;

    interface Tablas {
        String PREGUNTAS = "preguntas";
        String RESPUESTAS = "respuestas";

        String PARTIDAS = "partidas";
        String JUGADORES = "jugadores";
    }

    interface Referencias {
       String PREGUNTAS = String.format("REFERENCES %s(%s) ON DELETE CASCADE", Tablas.PREGUNTAS, CabecerasPregunta.ID);
        String RESPUESTAS = String.format("REFERENCES %s(%s)", Tablas.RESPUESTAS, CabecerasRespuesta.ID);

        String PARTIDAS = String.format("REFERENCES %s(%s) ON DELETE CASCADE", Tablas.PARTIDAS, CabecerasPartida.ID);
        String JUGADORES = String.format("REFERENCES %s(%s)", Tablas.JUGADORES, CabecerasJugador.ID);
    }

    public BaseDatosTrivial(@Nullable Context context, @Nullable String name, @Nullable SQLiteDatabase.CursorFactory factory, int version) {
        super(context, name, factory, version);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}
