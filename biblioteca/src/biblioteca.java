import java.util.Scanner;

public class Biblioteca {

    private Almacen almacen;
    public Biblioteca() {
        almacen = new Almacen();
    }

    void registrarLibro() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR LIBRO ===");

        System.out.print("Nombre del libro: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        int id = almacen.generarId();

        Libro libro = new Libro(
                id,
                autor,
                nombre,
                true,
                false
        );

        almacen.guardarLibro(libro);

        System.out.println("Libro registrado correctamente.");
        System.out.println("ID asignado: " + id);
    }

    void registrarRevista() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR REVISTA ===");

        System.out.print("Nombre de la revista: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Numero de edicion: ");
        int numeroEdicion = scanner.nextInt();
        scanner.nextLine();

        int id = almacen.generarId();

        Revista revista = new Revista(
                id,
                autor,
                nombre,
                true,
                false,
                numeroEdicion
        );

        almacen.guardarRevista(revista);

        System.out.println("Revista registrada correctamente.");
        System.out.println("ID asignado: " + id);
    }

    void registrarDigital() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("\n=== REGISTRAR LIBRO DIGITAL ===");

        System.out.print("Nombre del libro digital: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Tamaño del archivo: ");
        float tamañoArchivo = scanner.nextFloat();
        scanner.nextLine();

        int id = almacen.generarId();

        LibroDigital digital = new LibroDigital(
                id,
                autor,
                nombre,
                false,
                true,
                tamañoArchivo
        );

        almacen.guardarLibroDigital(digital);

        System.out.println("Libro digital registrado correctamente.");
        System.out.println("ID asignado: " + id);
    }

    void mostrarCreados() {
        almacen.mostrarInfo();
    }
    public void prestarMaterial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Ingrese el ID del material: "
        );
        int id = scanner.nextInt();
        almacen.prestarMaterial(id);
    }
    public void devolverMaterial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print(
                "Ingrese el ID del material: "
        );
        int id = scanner.nextInt();
        almacen.devolverMaterial(id);
    }



}