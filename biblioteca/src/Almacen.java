import java.util.ArrayList;

public class Almacen {

    private ArrayList<Libro> libros;
    private ArrayList<Revista> revistas;
    private ArrayList<LibroDigital> librosDigitales;


    private int cantidadLibros;
    private int cantidadRevistas;
    private int cantidadDigitales;
    private int cantidadMateriales;
    private int ultimoId;

    public Almacen() {

        libros = new ArrayList<>();
        revistas = new ArrayList<>();
        librosDigitales = new ArrayList<>();
        cantidadLibros = 0;
        cantidadRevistas = 0;
        cantidadDigitales = 0;
        cantidadMateriales = 0;
        ultimoId = 0;
    }

    public int generarId() {

        ultimoId++;

        return ultimoId;
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
    public void prestarMaterial(int id) {

        for (Libro libro : libros) {

            if (libro.getId() == id) {

                libro.prestar();

                return;
            }
        }

        for (Revista revista : revistas) {

            if (revista.getId() == id) {

                revista.prestar();

                return;
            }
        }

        for (LibroDigital digital : librosDigitales) {

            if (digital.getId() == id) {

                System.out.println(
                        "El libro digital no se puede prestar."
                );

                return;
            }
        }

        System.out.println(
                "Material no encontrado."
        );
    }

    public void devolverMaterial(int id) {

        for (Libro libro : libros) {

            if (libro.getId() == id) {

                libro.devolver();

                return;
            }
        }

        for (Revista revista : revistas) {

            if (revista.getId() == id) {

                revista.devolver();

                return;
            }
        }

        System.out.println(
                "Material no encontrado."
        );
    }

}