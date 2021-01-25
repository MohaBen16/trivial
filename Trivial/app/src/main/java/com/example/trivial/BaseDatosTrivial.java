package com.example.trivial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

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
       /* String PREGUNTAS = String.format("REFERENCES %s(%s) ON DELETE CASCADE",
                Tablas.CABECERA_PEDIDO, CabecerasPedido.ID_CABECERA_PEDIDO);
        String RESPUESTAS;

        String PARTIDAS;
        String JUGADORES;*/
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
