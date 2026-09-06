import java.util.Scanner;

public class Biblioteca {

    Almacen almacen;
    private static int contadorMateriales = 0;

    Biblioteca() {
        almacen = new Almacen();
    }

    private static void incrementarContador() {
        contadorMateriales++;
    }

    public static void mostrarContador() {
        System.out.println("Total de materiales creados: " + contadorMateriales);
    }

    void registrarLibro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR LIBRO ===");

        System.out.print("Nombre del libro (Enter para omitir): ");
        String nombre = scanner.nextLine();

        System.out.print("Autor (Enter para omitir): ");
        String autor = scanner.nextLine();

        int id = almacen.generarId();

        // El nombre y el autor pueden estar vacíos.
        Libro libro = new Libro(id, autor, nombre);

        almacen.guardarLibro(libro);
        incrementarContador();

        System.out.println("Libro registrado correctamente.");
        System.out.println("ID asignado: " + id);

        mostrarContador();
    }

    void registrarRevista() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR REVISTA ===");

        System.out.print("Nombre de la revista (Enter para omitir): ");
        String nombre = scanner.nextLine();

        System.out.print("Autor (Enter para omitir): ");
        String autor = scanner.nextLine();

        System.out.print("Numero de edicion (Enter para omitir): ");
        String entradaEdicion = scanner.nextLine();

        int numeroEdicion = 0;

        if (!entradaEdicion.isEmpty()) {
            numeroEdicion = Integer.parseInt(entradaEdicion);
        }

        int id = almacen.generarId();

        Revista revista = new Revista(
                id,
                autor,
                nombre,
                numeroEdicion
        );

        almacen.guardarRevista(revista);
        incrementarContador();

        System.out.println("Revista registrada correctamente.");
        System.out.println("ID asignado: " + id);

        if (entradaEdicion.isEmpty()) {
            System.out.println("Numero de edicion: Pendiente");
        } else {
            System.out.println("Numero de edicion: " + numeroEdicion);
        }

        mostrarContador();
    }

    void registrarDigital() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR LIBRO DIGITAL ===");

        System.out.print("Nombre del libro digital (Enter para omitir): ");
        String nombre = scanner.nextLine();

        System.out.print("Autor (Enter para omitir): ");
        String autor = scanner.nextLine();

        System.out.print("Tamaño del archivo en MB (Enter para omitir): ");
        String entradaTamaño = scanner.nextLine();

        float tamañoArchivo = 0;

        if (!entradaTamaño.isEmpty()) {
            tamañoArchivo = Float.parseFloat(entradaTamaño);
        }

        int id = almacen.generarId();

        LibroDigital digital = new LibroDigital(
                id,
                autor,
                nombre,
                tamañoArchivo
        );

        almacen.guardarLibroDigital(digital);
        incrementarContador();

        System.out.println("Libro digital registrado correctamente.");
        System.out.println("ID asignado: " + id);

        if (entradaTamaño.isEmpty()) {
            System.out.println("Tamaño del archivo: Pendiente");
        } else {
            System.out.printf(
                    "Tamaño del archivo: %.2f MB%n",
                    tamañoArchivo
            );
        }

        mostrarContador();
    }

    void mostrarCreados() {

        almacen.mostrarInfo();

        mostrarContador();
    }

    void descargarMaterial() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== MATERIALES DESCARGABLES ===");

        if (almacen.librosDigitales.isEmpty()) {

            System.out.println("No hay materiales descargables.");

            return;
        }

        almacen.mostrarLibrosDigitales();

        System.out.print("Ingrese el ID del libro digital: ");
        int id = scanner.nextInt();

        LibroDigital libroDigital =
                almacen.buscarLibroDigital(id);

        if (libroDigital != null) {

            Descargable descargable = libroDigital;

            descargable.descargar();

        } else {

            System.out.println(
                    "No se encontró un libro digital con ese ID."
            );
        }
    }
}
