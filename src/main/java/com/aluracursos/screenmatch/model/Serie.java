package com.aluracursos.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;

import java.util.OptionalDouble;

public class Serie {

    private String titulo;
    private Integer totalTemporadas;
    private Double evaluacion;
    private String poster;
    private Categoria genero;
    private String actores;
    private String sinopsis;

    public Serie(DatosSerie datosSerie){
        this.titulo = datosSerie.titulo();
        this.totalTemporadas = datosSerie.totalTemporadas();
        this.evaluacion = OptionalDouble.of(Double.valueOf(datosSerie.evaluacion())).orElse(0);
        this.poster = datosSerie.poster();
        this.genero = Categoria.fromString(datosSerie.genero().split(",")[0]);
        this.actores = datosSerie.actores();
        this.sinopsis = datosSerie.sinopsis();
    }

    @Override
    public String toString() {
        return  "titulo='" + titulo + '\'' +
                ", totalTemporadas=" + totalTemporadas +
                ", evaluacion=" + evaluacion +
                ", poster='" + poster + '\'' +
                ", genero=" + genero +
                ", actores='" + actores + '\'' +
                ", sinopsis='" + sinopsis + '\'' ;
    }
}
