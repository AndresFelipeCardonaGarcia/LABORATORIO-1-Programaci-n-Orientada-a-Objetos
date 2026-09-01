import java.util.ArrayList;

public class Almacen {

    ArrayList<Libro> libros;
    ArrayList<Revista> revistas;
    ArrayList<LibroDigital> librosDigitales;

    int cantidadLibros;
    int cantidadRevistas;
    int cantidadDigitales;
    int cantidadMateriales;
    int siguienteId;

    Almacen() {

        libros = new ArrayList<>();
        revistas = new ArrayList<>();
        librosDigitales = new ArrayList<>();
        cantidadLibros = 0;
        cantidadRevistas = 0;
        cantidadDigitales = 0;
        cantidadMateriales = 0;
        siguienteId = 0;
    }

    int generarId() {

        int id = siguienteId;
        siguienteId++;
        return id;
    }

    void guardarLibro(Libro libro) {

        libros.add(libro);
        cantidadLibros++;
        cantidadMateriales++;
    }

    void guardarRevista(Revista revista) {

        revistas.add(revista);
        cantidadRevistas++;
        cantidadMateriales++;
    }

    void guardarLibroDigital(LibroDigital libroDigital) {

        librosDigitales.add(libroDigital);
        cantidadDigitales++;
        cantidadMateriales++;
    }

    void mostrarInfo() {

        System.out.println("\n========== ALMACEN ==========");
        System.out.println("\nLIBROS:");
        System.out.println("Cantidad de libros: " + cantidadLibros);

        for (Libro libro : libros) {
            System.out.println("----------------------");
            libro.mostrarInfo();
        }

        System.out.println("\nREVISTAS:");
        System.out.println("Cantidad de revistas: " + cantidadRevistas);

        for (Revista revista : revistas) {
            System.out.println("----------------------");
            revista.mostrarInfo();
        }

        System.out.println("\nLIBROS DIGITALES:");
        System.out.println("Cantidad de libros digitales: " + cantidadDigitales);

        for (LibroDigital libroDigital : librosDigitales) {
            System.out.println("----------------------");
            libroDigital.mostrarInfo();
        }

        System.out.println("\n==============================");
        System.out.println("TOTAL DE MATERIALES: " + cantidadMateriales);
        System.out.println("==============================");
    }
}