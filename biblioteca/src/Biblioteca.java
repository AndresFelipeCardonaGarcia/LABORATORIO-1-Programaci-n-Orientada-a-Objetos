import java.util.Scanner;

public class Biblioteca {

    private Almacen almacen;
    private Scanner scanner;

    public Biblioteca(Scanner scanner) {

        almacen = new Almacen();
        this.scanner = scanner;


        // ==================================================
        // desde aqui se modifico el codigo
        // ==================================================

        // ==========================
        // LIBROS DE PRUEBA
        // ==========================

        Libro libro1 = new Libro(
                almacen.generarID(),
                "Gabriel García Márquez",
                "Cien años de soledad"
        );

        Libro libro2 = new Libro(
                almacen.generarID(),
                "J. K. Rowling",
                "Harry Potter"
        );

        almacen.guardadLibro(libro1);
        almacen.guardadLibro(libro2);


        // ==========================
        // LIBROS DIGITALES DE PRUEBA
        // ==========================

        LibroDigital digital1 = new LibroDigital(
                almacen.generarID(),
                "Yuval Noah Harari",
                "Sapiens",
                15.5f
        );

        LibroDigital digital2 = new LibroDigital(
                almacen.generarID(),
                "Robert C. Martin",
                "Clean Code",
                8.2f
        );

        almacen.guardarLibroDigital(digital1);
        almacen.guardarLibroDigital(digital2);


        // ==========================
        // REVISTAS DE PRUEBA
        // ==========================

        Revista revista1 = new Revista(
                almacen.generarID(),
                "National Geographic",
                "Historia de la humanidad",
                125
        );

        Revista revista2 = new Revista(
                almacen.generarID(),
                "Muy Interesante",
                "Ciencia y tecnología",
                87
        );

        almacen.guardarRevista(revista1);
        almacen.guardarRevista(revista2);


        // ==================================================
        // hasta aqui se modifico el codigo
        // ==================================================

    }


    public void Registrar_libro() {

        System.out.println("\n=== REGISTRAR LIBRO ===");

        System.out.print("Nombre del libro: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        int ID = almacen.generarID();

        Libro libro = new Libro(
                ID,
                autor,
                nombre
        );

        almacen.guardadLibro(libro);

        System.out.println("Libro registrado correctamente.");
        System.out.println("ID asignado: " + ID);
    }


    public void Registrar_revista() {

        System.out.println("\n=== REGISTRAR REVISTA ===");

        System.out.print("Nombre de la revista: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Numero de edicion: ");
        int numeroEdicion = scanner.nextInt();

        scanner.nextLine();

        int ID = almacen.generarID();

        Revista revista = new Revista(
                ID,
                autor,
                nombre,
                numeroEdicion
        );

        almacen.guardarRevista(revista);

        System.out.println("Revista registrada correctamente.");
        System.out.println("ID asignado: " + ID);
    }


    public void Registrar_digital() {

        System.out.println("\n=== REGISTRAR LIBRO DIGITAL ===");

        System.out.print("Nombre del libro digital: ");
        String nombre = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Tamaño del archivo: ");
        float tamanoArchivo = scanner.nextFloat();

        scanner.nextLine();

        int ID = almacen.generarID();

        LibroDigital digital = new LibroDigital(
                ID,
                autor,
                nombre,
                tamanoArchivo
        );

        almacen.guardarLibroDigital(digital);

        System.out.println(
                "Libro digital registrado correctamente."
        );

        System.out.println("ID asignado: " + ID);
    }


    public void Mostrar_creados() {

        almacen.mostrarInfo();
    }


    // ==================================================
    // desde aqui se modifico el codigo
    // ==================================================

    public void prestarMaterial() {

        System.out.println(
                "\n=== MATERIALES DISPONIBLES PARA PRESTAR ==="
        );

        for (int i = 1; i <= Material.getCantidadMateriales(); i++) {

            Material material = almacen.buscarMaterial(i);

            if (material != null &&
                material.isDisponible() &&
                material instanceof prestable) {

                material.mostarInfo();
            }
        }

        System.out.println("\n--------------------------------");

        System.out.print("Ingrese el ID del material: ");
        int ID = scanner.nextInt();

        Material material = almacen.buscarMaterial(ID);

        if (material == null) {

            System.out.println("Material no encontrado.");
            return;
        }

        if (material instanceof prestable) {

            prestable materialPrestable =
                    (prestable) material;

            materialPrestable.prestar();

        } else {

            System.out.println(
                    "Este material no se puede prestar."
            );
        }
    }


    public void devolverMaterial() {

        System.out.println("\n=== MATERIALES PRESTADOS ===");

        for (int i = 1; i <= Material.getCantidadMateriales(); i++) {

            Material material = almacen.buscarMaterial(i);

            if (material != null &&
                !material.isDisponible() &&
                material instanceof prestable) {

                material.mostarInfo();
            }
        }

        System.out.println("\n--------------------------------");

        System.out.print("Ingrese el ID del material: ");
        int ID = scanner.nextInt();

        Material material = almacen.buscarMaterial(ID);

        if (material == null) {

            System.out.println("Material no encontrado.");
            return;
        }

        if (material instanceof prestable) {

            prestable materialPrestable =
                    (prestable) material;

            materialPrestable.devolver();

        } else {

            System.out.println(
                    "Este material no se puede devolver."
            );
        }
    }


    public void descargarMaterial() {

        System.out.println(
                "\n=== LIBROS DIGITALES DISPONIBLES PARA DESCARGAR ==="
        );

        for (int i = 1; i <= Material.getCantidadMateriales(); i++) {

            Material material = almacen.buscarMaterial(i);

            if (material != null &&
                material instanceof Descargable) {

                material.mostarInfo();
            }
        }

        System.out.println("\n--------------------------------");

        System.out.print("Ingrese el ID del material: ");
        int ID = scanner.nextInt();

        Material material = almacen.buscarMaterial(ID);

        if (material == null) {

            System.out.println("Material no encontrado.");
            return;
        }

        if (material instanceof Descargable) {

            Descargable materialDescargable =
                    (Descargable) material;

            materialDescargable.descargar();

        } else {

            System.out.println(
                    "Este material no se puede descargar."
            );
        }
    }

    // ==================================================
    // hasta aqui se modifico el codigo
    // ==================================================

}  