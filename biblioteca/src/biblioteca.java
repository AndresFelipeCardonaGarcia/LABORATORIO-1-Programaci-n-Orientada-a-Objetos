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
                "Cien años de soledad",
                1967,
                "Gabriel García Márquez"
        );

        Libro libro2 = new Libro(
                almacen.generarId(),
                "Harry Potter",
                1997,
                "J.K. Rowling"
        );

        // --------------------------------------
        // LIBROS DIGITALES
        // --------------------------------------

        LibroDigital digital1 = new LibroDigital(
                almacen.generarId(),
                "Sapiens",
                2011,
                "Yuval Noah Harari",
                15.5f
        );

        LibroDigital digital2 = new LibroDigital(
                almacen.generarId(),
                "Clean Code",
                2008,
                "Robert C. Martin",
                8.2f
        );

        // --------------------------------------
        // REVISTAS
        // --------------------------------------

        Revista revista1 = new Revista(
                almacen.generarId(),
                "Historia de la humanidad",
                2020,
                125
        );

        Revista revista2 = new Revista(
                almacen.generarId(),
                "Ciencia y tecnología",
                2021,
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
                "Título del libro (Enter para omitir): "
        );

        String nombre = scanner.nextLine();

        System.out.print(
                "Año de publicación (Enter para omitir): "
        );

        String entradaAnio =
                scanner.nextLine();

        int anio = 0;

        if (!entradaAnio.isEmpty()) {

            try {

                anio = Integer.parseInt(
                        entradaAnio
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. "
                        + "Se dejará como pendiente."
                );

                anio = 0;
            }
        }

        System.out.print(
                "Autor (Enter para omitir): "
        );

        String autor = scanner.nextLine();

        int id = almacen.generarId();

        Libro libro = new Libro(
                id,
                nombre,
                anio,
                autor
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
                "Título de la revista (Enter para omitir): "
        );

        String nombre = scanner.nextLine();

        System.out.print(
                "Año de publicación (Enter para omitir): "
        );

        String entradaAnio =
                scanner.nextLine();

        int anio = 0;

        if (!entradaAnio.isEmpty()) {

            try {

                anio = Integer.parseInt(
                        entradaAnio
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. "
                        + "Se dejará como pendiente."
                );

                anio = 0;
            }
        }

        System.out.print(
                "Número de edición (Enter para omitir): "
        );

        String entradaEdicion =
                scanner.nextLine();

        int numeroEdicion = 0;

        if (!entradaEdicion.isEmpty()) {

            try {

                numeroEdicion =
                        Integer.parseInt(
                                entradaEdicion
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Número de edición inválido. "
                        + "Se dejará como pendiente."
                );

                numeroEdicion = 0;
            }
        }

        int id = almacen.generarId();

        Revista revista = new Revista(
                id,
                nombre,
                anio,
                numeroEdicion
        );

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
                "Título del libro (Enter para omitir): "
        );

        String nombre = scanner.nextLine();

        System.out.print(
                "Año de publicación (Enter para omitir): "
        );

        String entradaAnio =
                scanner.nextLine();

        int anio = 0;

        if (!entradaAnio.isEmpty()) {

            try {

                anio = Integer.parseInt(
                        entradaAnio
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. "
                        + "Se dejará como pendiente."
                );

                anio = 0;
            }
        }

        System.out.print(
                "Autor (Enter para omitir): "
        );

        String autor = scanner.nextLine();

        System.out.print(
                "Tamaño del archivo en MB "
                + "(Enter para omitir): "
        );

        String entradaTamano =
                scanner.nextLine();

        float tamano = 0;

        if (!entradaTamano.isEmpty()) {

            try {

                tamano =
                        Float.parseFloat(
                                entradaTamano
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Tamaño inválido. "
                        + "Se dejará como pendiente."
                );

                tamano = 0;
            }
        }

        int id = almacen.generarId();

        LibroDigital libroDigital =
                new LibroDigital(
                        id,
                        nombre,
                        anio,
                        autor,
                        tamano
                );

        almacen.guardarLibroDigital(
                libroDigital
        );

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
    // EDITAR MATERIAL
    // ==========================================

    public void editarMaterial() {

        System.out.println(
                "\n========== EDITAR MATERIAL =========="
        );

        almacen.mostrarInfo();

        System.out.print(
                "\nIngrese el ID del material "
                + "que desea editar: "
        );

        String entradaId =
                scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(
                    entradaId
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "ID inválido."
            );

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material "
                    + "con ese ID."
            );

            return;
        }

        System.out.println(
                "\nMaterial encontrado:"
        );

        material.mostrarInfo();

        System.out.println(
                "\nPresione Enter para "
                + "conservar el dato actual."
        );

        // ==========================================
        // EDITAR TÍTULO
        // ==========================================

        System.out.print(
                "\nTítulo actual: "
                + material.getNombre()
                + "\nNuevo título: "
        );

        String nuevoNombre =
                scanner.nextLine();

        if (!nuevoNombre.isEmpty()) {

            material.setNombre(
                    nuevoNombre
            );
        }

        // ==========================================
        // EDITAR AÑO
        // ==========================================

        System.out.print(
                "\nAño actual: "
                + (material.getPublicacion() == 0
                        ? "Pendiente"
                        : material.getPublicacion())
                + "\nNuevo año: "
        );

        String nuevoAnio =
                scanner.nextLine();

        if (!nuevoAnio.isEmpty()) {

            try {

                int anio =
                        Integer.parseInt(
                                nuevoAnio
                        );

                if (anio >= 0) {

                    material.setPublicacion(
                            anio
                    );

                } else {

                    System.out.println(
                            "El año no puede ser negativo."
                    );
                }

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. "
                        + "Se conservará el anterior."
                );
            }
        }

        // ==========================================
        // EDITAR LIBRO
        // ==========================================

        if (material instanceof Libro) {

            Libro libro =
                    (Libro) material;

            System.out.print(
                    "\nAutor actual: "
                    + (libro.getAutor().isEmpty()
                            ? "Pendiente"
                            : libro.getAutor())
                    + "\nNuevo autor: "
            );

            String nuevoAutor =
                    scanner.nextLine();

            if (!nuevoAutor.isEmpty()) {

                libro.setAutor(
                        nuevoAutor
                );
            }
        }

        // ==========================================
        // EDITAR REVISTA
        // ==========================================

        if (material instanceof Revista) {

            Revista revista =
                    (Revista) material;

            System.out.print(
                    "\nNúmero de edición actual: "
                    + (revista.getNumeroEdicion() == 0
                            ? "Pendiente"
                            : revista.getNumeroEdicion())
                    + "\nNuevo número de edición: "
            );

            String nuevaEdicion =
                    scanner.nextLine();

            if (!nuevaEdicion.isEmpty()) {

                try {

                    int numeroEdicion =
                            Integer.parseInt(
                                    nuevaEdicion
                            );

                    if (numeroEdicion >= 0) {

                        revista.setNumeroEdicion(
                                numeroEdicion
                        );

                    } else {

                        System.out.println(
                                "El número de edición "
                                + "no puede ser negativo."
                        );
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Número de edición inválido. "
                            + "Se conservará el anterior."
                    );
                }
            }
        }

        // ==========================================
        // EDITAR LIBRO DIGITAL
        // ==========================================

        if (material instanceof LibroDigital) {

            LibroDigital libroDigital =
                    (LibroDigital) material;

            System.out.print(
                    "\nAutor actual: "
                    + (libroDigital.getAutor().isEmpty()
                            ? "Pendiente"
                            : libroDigital.getAutor())
                    + "\nNuevo autor: "
            );

            String nuevoAutor =
                    scanner.nextLine();

            if (!nuevoAutor.isEmpty()) {

                libroDigital.setAutor(
                        nuevoAutor
                );
            }

            System.out.print(
                    "\nTamaño actual: "
                    + (libroDigital.getTamanoArchivo() == 0
                            ? "Pendiente"
                            : libroDigital.getTamanoArchivo()
                                    + " MB")
                    + "\nNuevo tamaño en MB: "
            );

            String nuevoTamano =
                    scanner.nextLine();

            if (!nuevoTamano.isEmpty()) {

                try {

                    float tamano =
                            Float.parseFloat(
                                    nuevoTamano
                            );

                    if (tamano >= 0) {

                        libroDigital.setTamanoArchivo(
                                tamano
                        );

                    } else {

                        System.out.println(
                                "El tamaño no puede ser negativo."
                        );
                    }

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Tamaño inválido. "
                            + "Se conservará el anterior."
                    );
                }
            }
        }

        System.out.println(
                "\nMaterial editado correctamente."
        );

        System.out.println(
                "\nInformación actualizada:"
        );

        material.mostrarInfo();
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
                "\nIngrese el ID del material "
                + "que desea prestar: "
        );

        String entrada =
                scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(
                    entrada
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "ID inválido."
            );

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material "
                    + "con ese ID."
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
                "\nIngrese el ID del material "
                + "que desea devolver: "
        );

        String entrada =
                scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(
                    entrada
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "ID inválido."
            );

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material "
                    + "con ese ID."
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

        String entrada =
                scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(
                    entrada
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "ID inválido."
            );

            return;
        }

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material "
                    + "con ese ID."
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

        boolean hayDisponibles =
                almacen.mostrarDisponibles();

        boolean hayDescargables =
                almacen.mostrarDescargable();

        if (!hayDisponibles
                && !hayDescargables) {

            return;
        }

        System.out.print(
                "\nIngrese el ID del material "
                + "que desea eliminar: "
        );

        String entrada =
                scanner.nextLine();

        int id;

        try {

            id = Integer.parseInt(
                    entrada
            );

        } catch (NumberFormatException e) {

            System.out.println(
                    "ID inválido."
            );

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

