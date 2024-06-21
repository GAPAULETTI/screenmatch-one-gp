package com.aluracursos.screenmatch.model;

public enum Categoria {
    ACCION ("Action", "Acción"),
    ROMANCE ("Romance", "Romance"),
    DRAMA("Drama", "Drama"),
    COMEDIA("Comedy", "Comedia"),
    CRIMEN("Crime", "Crimen");

    private String categoriaOmdb;
    private String categoriaEsp;

    Categoria (String categoriaOmdb, String categoriaEsp){
        this.categoriaOmdb = categoriaOmdb;
        this.categoriaEsp = categoriaEsp;
    }

    public static Categoria fromString(String text){
        for(Categoria categoria : Categoria.values()){
            if(categoria.categoriaOmdb.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("No se encontró la categoría: " + text);
    } public static Categoria fromEsp(String text){
        for(Categoria categoria : Categoria.values()){
            if(categoria.categoriaEsp.equalsIgnoreCase(text)){
                return categoria;
            }
        }
        throw new IllegalArgumentException("No se encontró la categoría: " + text);
    }
}
