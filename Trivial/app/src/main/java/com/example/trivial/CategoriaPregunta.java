package com.example.trivial;

public enum CategoriaPregunta {
    geografia(0),historia(1),arte(2),deportes(3),ciencia(4),lengua(5);

    private int idcategoria;

    CategoriaPregunta(int idcategoria) {
        this.idcategoria = idcategoria;
    }

    public int getIdcategoria() {
        return idcategoria;
    }

    public void setIdcategoria(int idcategoria) {
        this.idcategoria = idcategoria;
    }

}
