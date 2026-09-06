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

        System.out.println("\nALMACEN ");

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

        System.out.println("TOTAL DE MATERIALES: " + cantidadMateriales);
    }
    void mostrarDisponibles() {

        System.out.println("\n=== MATERIALES DISPONIBLES ===");

        boolean hayDisponibles = false;

        for (Libro libro : libros) {

            if (libro.isDisponible) {

                System.out.println(
                        "ID: " + libro.id + " Libro: " + libro.nombre
                );

                hayDisponibles = true;
            }
        }

        for (Revista revista : revistas) {

            if (revista.isDisponible) {

                System.out.println(
                        "ID: " + revista.id
                                + " Revista: " + revista.nombre
                );

                hayDisponibles = true;
            }
        }

        for (LibroDigital libroDigital : librosDigitales) {

            if (libroDigital.isDisponible) {

                System.out.println(
                        "ID: " + libroDigital.id
                                + " Libro digital: " + libroDigital.nombre
                );

                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {

            System.out.println("No hay materiales disponibles.");
        }
    }
    void mostrarLibrosDigitales() {

        if (librosDigitales.isEmpty()) {

            System.out.println("No hay materiales descargables.");

        } else {

            for (LibroDigital libroDigital : librosDigitales) {

                System.out.printf(
                        "ID: %d | Nombre: %s | Tamaño: %.2f MB%n",
                        libroDigital.id,
                        libroDigital.nombre,
                        libroDigital.tamañoArchivo
                );
            }
        }
    }

    LibroDigital buscarLibroDigital(int id) {

        for (LibroDigital libroDigital : librosDigitales) {

            if (libroDigital.id == id) {
                return libroDigital;
            }
        }

        return null;
    }
}