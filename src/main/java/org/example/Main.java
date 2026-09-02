package org.example;

public class Main {
    public static void main(String[] args) {
        Catalogo miCatalogo = new Catalogo();

        // 1. Crear al menos 3 objetos Película
        Pelicula p1 = new Pelicula("Titanic", "James Cameron", 1997, "Drama/Romance", 195);
        Pelicula p2 = new Pelicula("Matrix", "Lana y Lilly Wachowski", 1999, "Ciencia Ficción", 136);
        Pelicula p3 = new Pelicula("Interstellar", "Christopher Nolan", 2014, "Ciencia Ficción", 169);

        miCatalogo.agregarPelicula(p1);
        miCatalogo.agregarPelicula(p2);
        miCatalogo.agregarPelicula(p3);

        // 2. Mostrar la información del catálogo (ahora incluye si es clásica)
        System.out.println("=== CONTENIDO DEL CATÁLOGO ===");
        System.out.println(miCatalogo.getPeliculas());

        // Demostración explícita del método esClasica()
        System.out.println("=== COMPROBACIÓN DE CLÁSICAS ===");
        System.out.println(p1.getTitulo() + " -> ¿Es clásica?: " + p1.esClasica());
        System.out.println(p3.getTitulo() + " -> ¿Es clásica?: " + p3.esClasica());

        // Ejemplo: Cambiar el año de estreno
        System.out.println("\n=== MODIFICANDO AÑO DE ESTRENO DE INTERSTELLAR ===");
        p3.setAnioEstreno(1995); // Ahora tendría más de 25 años
        System.out.println("Nuevo estado: " + p3.getInformacion());

        // 3. Buscar una película por título
        System.out.println("\n=== BÚSQUEDA DE PELÍCULA ===");
        miCatalogo.buscarPeliculaPorTitulo("Matrix");
    }
}