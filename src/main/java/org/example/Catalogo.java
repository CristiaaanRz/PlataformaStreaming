package org.example;

import java.util.ArrayList;

public class Catalogo {
    // Atributo
  private ArrayList<Pelicula> peliculas;

  //Constructor para lista vacia
  public Catalogo() {
      this.peliculas = new ArrayList<>();
  }
    // Añade una pelicula al catalogo
  public void agregarPelicula(Pelicula pelicula){
      this.peliculas.add(pelicula);
  }

  //Regresa una cadena con toda la informacion de las peliculas
  public String getPeliculas(){
      if (peliculas.isEmpty()){
          return "El catalogo esta vacio";
      }
      StringBuilder sb = new StringBuilder();
      for (Pelicula p : peliculas){
          sb.append(p.toString()).append("\n");
      }
      return sb.toString();
  }

    // Busca una pelicula por titulo y que muestre su informacion
    public void buscarPeliculaPorTitulo(String titulo){
      boolean existe = false;
      for (Pelicula p : peliculas){
          if (p.getTitulo().equalsIgnoreCase(titulo)){
              System.out.println("Pelicula encontrada: \n" + p.getInformacion());
              existe = true;
              break;
          }
      }
      if (!existe){
          System.out.println("Pelicula no encontrada");
      }
    }

    public String toString() {
        return "Catalogo (" + peliculas.size() + " peliculas):\n" + getPeliculas();
    }
}
