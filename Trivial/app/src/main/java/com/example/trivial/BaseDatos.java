package com.example.trivial;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.Build;

import androidx.annotation.Nullable;

public class BaseDatos extends SQLiteOpenHelper {

    private static final String NOMBRE_BASE_DATOS = "trivialbd";

    private static final int VERSION_ACTUAL = 1;

    private final Context contexto;

    public BaseDatos(Context contexto) {
        super(contexto, NOMBRE_BASE_DATOS, null, VERSION_ACTUAL);
        this.contexto = contexto;
    }

    //Para hacer efectiva las referencias de integridad de las llaves foráneas en SQLite
    //Para el soporte, puedes habilitar manualmente a través de la sentencia PRAGMA foreign_keys=ON
    @Override
    public void onOpen(SQLiteDatabase db) {
        super.onOpen(db);
        if (!db.isReadOnly()) {
            //Este método va desde Android Jelly Bean en adelante
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.JELLY_BEAN) {
                db.setForeignKeyConstraintsEnabled(true);
            } else {
                db.execSQL("PRAGMA foreign_keys=ON");
            }
        }
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL("create table if not exists pregunta(" +
                "id integer primary key AUTOINCREMENT," +
                "categoria text not null," +
                "textopregunta text not null)"
        );

        db.execSQL("create table if not exists respuesta(" +
                "id integer primary key AUTOINCREMENT," +
                "id_pregunta integer," +
                "textorespuesta text not null,"+
                "correcta boolean,"+
                "    FOREIGN KEY (id_pregunta)" +
                "        REFERENCES pregunta(id)" +
                "        ON DELETE CASCADE)"
        );

        db.execSQL("create table if not exists partida(" +
                "id integer primary key AUTOINCREMENT," +
                "boolean terminada)"
        );

        db.execSQL("create table if not exists jugador(" +
                "id integer primary key AUTOINCREMENT," +
                "id_partida integer," +
                "qamarillo boolean,"+
                "qrosa boolean,"+
                "qverde boolean,"+
                "qmarron boolean,"+
                "qazul boolean,"+
                "qnaranja boolean,"+
                "ganador boolean,"+
                "    FOREIGN KEY (id_partida)" +
                "        REFERENCES partida(id)" +
                "        ON DELETE CASCADE)"
        );
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        onCreate(db);
    }

}
