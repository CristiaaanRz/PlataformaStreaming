package org.example;

import java.time.Year;

public class Pelicula {
    private String titulo;
    private String director;
    private int anioEstreno;
    private String genero;
    private int duracion;

    public Pelicula(String titulo, String director, int anioEstreno, String genero, int duracion) {
        this.titulo = titulo;
        this.director = director;
        this.anioEstreno = anioEstreno;
        this.genero = genero;
        this.duracion = duracion;
    }

    public boolean esClasica() {
        int anioActual = Year.now().getValue();
        return (anioActual - this.anioEstreno) > 25;
    }

    public String getInformacion() {
        return "Título: " + titulo +
                " | Director: " + director +
                " | Año: " + anioEstreno +
                " | Género: " + genero +
                " | Duración: " + duracion + " min" +
                " | ¿Es clásica?: " + (esClasica() ? "Sí" : "No");
    }

    public String getTitulo() {
        return titulo;
    }

    public void setAnioEstreno(int anioEstreno) {
        this.anioEstreno = anioEstreno;
    }

    @Override
    public String toString() {
        return getInformacion();
    }
}