package com.example.trivial;

import android.content.Context;

public final class OperacionesBaseDatos {

    private static BaseDatos bDatos;

    private static OperacionesBaseDatos instancia = new OperacionesBaseDatos();

    private OperacionesBaseDatos(){

    }

     public static OperacionesBaseDatos obtenerInstancia(Context contexto){
        if(bDatos == null){
            bDatos = new BaseDatos(contexto);
        }
        return instancia;
     }
}
