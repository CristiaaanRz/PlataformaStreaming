package org.example;

public class Main {
    public static void main(String[] args) {
        Catalogo miCatalogo = new Catalogo();

        // 1. Crear al menos 3 objetos Película y añadirlos al catálogo
        Pelicula p1 = new Pelicula("Moana", "Ron Clements y John Musker.", 2016, "Aventura", 195);
        Pelicula p2 = new Pelicula("Cars", "John Lasseter y Joe Ranft", 2006, "Ciencia Ficción", 144);
        Pelicula p3 = new Pelicula("Sherk 2", "Andrew Adamson", 2004, "Animada", 169);

        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);

        // 2. Utilizar getPeliculas() para mostrar toda la información
        System.out.println("=== CATALOGO DE PELÍCULAS ===");
        System.out.println(miCatalogo.getPeliculas());

        // 3. Buscar una película por título utilizando buscarPeliculaPorTitulo()
        System.out.println("=== RESULTADO DE BÚSQUEDA ===");
        miCatalogo.buscarPeliculaPorTitulo("Matrix");
    }
}