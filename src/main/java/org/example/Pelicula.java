package org.example;
import java.time.Year;

public class Pelicula {
    // Atributos
    private String titulo;
    private String director;
    private int anioEstreno;
    private String genero;
    private int duracion;

    //Constructor
    public Pelicula(String titulo, String director, int anioEstreno, String genero, int duracion){
        this.titulo=titulo;
        this.director=director;
        this.anioEstreno=anioEstreno;
        this.genero=genero;
        this.duracion=duracion;
    }

    public String getInformacion(){
        return  "Titulo: " + titulo + " | Director: " + director +
                " | Año: " + anioEstreno + " | Genero: " + genero + " | Duracion: " + duracion + " min";
    }

    public boolean esClasica() {
        int anioActual = Year.now().getValue();
        return (anioActual - this.anioEstreno) > 25;
    }

    public String getTitulo() {
        return titulo;
    }

    public String toString(){
        return getInformacion();
    }
}
