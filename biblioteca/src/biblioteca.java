import java.util.Scanner;

public class Biblioteca {

    private Almacen almacen;
    private Scanner scanner;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Biblioteca(Scanner scanner) {

        this.scanner = scanner;
        this.almacen = new Almacen();

        cargarMaterialesIniciales();
    }

    // ==========================================
    // CARGAR MATERIALES INICIALES
    // ==========================================

    private void cargarMaterialesIniciales() {

        // --------------------------------------
        // LIBROS
        // --------------------------------------

        Libro libro1 = new Libro(
                almacen.generarId(),
                "Gabriel García Márquez",
                "Cien años de soledad"
        );

        Libro libro2 = new Libro(
                almacen.generarId(),
                "J.K. Rowling",
                "Harry Potter"
        );

        // --------------------------------------
        // LIBROS DIGITALES
        // --------------------------------------

        LibroDigital digital1 = new LibroDigital(
                almacen.generarId(),
                "Yuval Noah Harari",
                "Sapiens",
                15.5f
        );

        LibroDigital digital2 = new LibroDigital(
                almacen.generarId(),
                "Robert C. Martin",
                "Clean Code",
                8.2f
        );

        // --------------------------------------
        // REVISTAS
        // --------------------------------------

        Revista revista1 = new Revista(
                almacen.generarId(),
                "National Geographic",
                "Historia de la humanidad",
                125
        );

        Revista revista2 = new Revista(
                almacen.generarId(),
                "Muy Interesante",
                "Ciencia y tecnología",
                87
        );

        // --------------------------------------
        // GUARDAR EN EL ALMACÉN
        // --------------------------------------

        almacen.guardarLibro(libro1);
        almacen.guardarLibro(libro2);

        almacen.guardarLibroDigital(digital1);
        almacen.guardarLibroDigital(digital2);

        almacen.guardarRevista(revista1);
        almacen.guardarRevista(revista2);
    }

    // ==========================================
    // REGISTRAR LIBRO
    // ==========================================

    public void registrarLibro() {

        System.out.println(
                "\n========== REGISTRAR LIBRO =========="
        );

        System.out.print(
                "Nombre del libro (Enter para omitir): "
        );

        String nombre = scanner.nextLine();

        System.out.print(
                "Autor (Enter para omitir): "
        );

        String autor = scanner.nextLine();

        int id = almacen.generarId();

        Libro libro = new Libro(
                id,
                autor,
                nombre
        );

        almacen.guardarLibro(libro);

        System.out.println(
                "\nLibro registrado correctamente."
        );

        System.out.println(
                "ID asignado: " + id
        );
    }

    // ==========================================
    // REGISTRAR REVISTA
    // ==========================================

    public void registrarRevista() {

        System.out.println(
                "\n========== REGISTRAR REVISTA =========="
        );

        System.out.print(
                "Nombre de la revista (Enter para omitir): "
        );

        String nombre = scanner.nextLine();

        System.out.print(
                "Autor (Enter para omitir): "
        );

        String autor = scanner.nextLine();

        System.out.print(
                "Número de edición (Enter para omitir): "
        );

        String entradaEdicion = scanner.nextLine();

        int numeroEdicion = 0;

        if (!entradaEdicion.isEmpty()) {

            try {

                numeroEdicion =
                        Integer.parseInt(entradaEdicion);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Número de edición inválido. "
                        + "Se dejará como pendiente."
                );

                numeroEdicion = 0;
            }
        }

        int id = almacen.generarId();

        Revista revista;

        if (entradaEdicion.isEmpty()) {

            revista = new Revista(
                    id,
                    autor,
                    nombre
            );

        } else {

            revista = new Revista(
                    id,
                    autor,
                    nombre,
                    numeroEdicion
            );
        }

        almacen.guardarRevista(revista);

        System.out.println(
                "\nRevista registrada correctamente."
        );

        System.out.println(
                "ID asignado: " + id
        );
    }

    // ==========================================
    // REGISTRAR LIBRO DIGITAL
    // ==========================================

    public void registrarLibroDigital() {

        System.out.println(
                "\n========== REGISTRAR LIBRO DIGITAL =========="
        );

        System.out.print(
                "Nombre del libro (Enter para omitir): "
        );

        String nombre = scanner.nextLine();

        System.out.print(
                "Autor (Enter para omitir): "
        );

        String autor = scanner.nextLine();

        System.out.print(
                "Tamaño del archivo en MB (Enter para omitir): "
        );

        String entradaTamano = scanner.nextLine();

        float tamano = 0;

        if (!entradaTamano.isEmpty()) {

            try {

                tamano =
                        Float.parseFloat(entradaTamano);

            } catch (NumberFormatException e) {

                System.out.println(
                        "Tamaño inválido. "
                        + "Se dejará como pendiente."
                );

                tamano = 0;
            }
        }

        int id = almacen.generarId();

        LibroDigital libroDigital;

        if (entradaTamano.isEmpty()) {

            libroDigital = new LibroDigital(
                    id,
                    autor,
                    nombre
            );

        } else {

            libroDigital = new LibroDigital(
                    id,
                    autor,
                    nombre,
                    tamano
            );
        }

        almacen.guardarLibroDigital(libroDigital);

        System.out.println(
                "\nLibro digital registrado correctamente."
        );

        System.out.println(
                "ID asignado: " + id
        );
    }

    // ==========================================
    // MOSTRAR MATERIALES
    // ==========================================

    public void mostrarCreados() {

        almacen.mostrarInfo();
    }

    // ==========================================
    // PRESTAR MATERIAL
    // ==========================================

    public void prestarMaterial() {

        boolean hayDisponibles =
                almacen.mostrarDisponibles();

        if (!hayDisponibles) {

            return;
        }

        System.out.print(
                "\nIngrese el ID del material que desea prestar: "
        );

        String entrada = scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(entrada);

        } catch (NumberFormatException e) {

            System.out.println("ID inválido.");

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material con ese ID."
            );

            return;
        }

        if (!(material instanceof Prestable)) {

            System.out.println(
                    "Este material no se puede prestar."
            );

            return;
        }

        if (!material.isDisponible()) {

            System.out.println(
                    "Este material ya se encuentra prestado."
            );

            return;
        }

        Prestable prestable =
                (Prestable) material;

        prestable.prestar();
    }

    // ==========================================
    // DEVOLVER MATERIAL
    // ==========================================

    public void devolverMaterial() {

        almacen.mostrarPrestados();

        System.out.print(
                "\nIngrese el ID del material que desea devolver: "
        );

        String entrada = scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(entrada);

        } catch (NumberFormatException e) {

            System.out.println("ID inválido.");

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material con ese ID."
            );

            return;
        }

        if (!(material instanceof Prestable)) {

            System.out.println(
                    "Este material no se puede devolver."
            );

            return;
        }

        if (material.isDisponible()) {

            System.out.println(
                    "Este material no se encuentra prestado."
            );

            return;
        }

        Prestable prestable =
                (Prestable) material;

        prestable.devolver();
    }

    // ==========================================
    // DESCARGAR MATERIAL DIGITAL
    // ==========================================

    public void descargarMaterial() {

        boolean hayDescargables =
                almacen.mostrarDescargable();

        if (!hayDescargables) {

            return;
        }

        System.out.print(
                "\nIngrese el ID del libro digital: "
        );

        String entrada = scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(entrada);

        } catch (NumberFormatException e) {

            System.out.println("ID inválido.");

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material con ese ID."
            );

            return;
        }

        if (!(material instanceof Descargable)) {

            System.out.println(
                    "Este material no es descargable."
            );

            return;
        }

        Descargable descargable =
                (Descargable) material;

        descargable.descargar();
    }

    // ==========================================
    // ELIMINAR MATERIAL
    // ==========================================

    public void eliminarMaterial() {

        System.out.println(
                "\n========== ELIMINAR MATERIAL =========="
        );

        /*
         * Mostramos los materiales que pueden
         * ser eliminados.
         *
         * Los libros y revistas disponibles
         * aparecen mediante mostrarDisponibles().
         *
         * Los libros digitales aparecen mediante
         * mostrarDescargable().
         */

        boolean hayDisponibles =
                almacen.mostrarDisponibles();

        boolean hayDescargables =
                almacen.mostrarDescargable();

        /*
         * Si no hay ningún material disponible
         * ni ningún libro digital, no hay nada
         * que eliminar.
         */
        if (!hayDisponibles && !hayDescargables) {

            return;
        }

        System.out.print(
                "\nIngrese el ID del material que desea eliminar: "
        );

        String entrada = scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(entrada);

        } catch (NumberFormatException e) {

            System.out.println("ID inválido.");

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "Material no encontrado."
            );

            return;
        }

        /*
         * Un material prestado no puede eliminarse.
         */
        if (!material.isDisponible()) {

            System.out.println(
                    "No se puede eliminar un material "
                    + "que está prestado."
            );

            return;
        }

        if (almacen.eliminarMaterial(id)) {

            System.out.println(
                    "Material eliminado correctamente."
            );

        } else {

            System.out.println(
                    "No se pudo eliminar el material."
            );
        }
    }
}