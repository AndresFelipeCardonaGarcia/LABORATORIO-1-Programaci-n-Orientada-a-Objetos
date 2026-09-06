import java.util.Scanner;

public class Biblioteca {

    private Almacen almacen;
    private Scanner scanner;

    public Biblioteca(Scanner scanner) {

        this.scanner = scanner;
        this.almacen = new Almacen();

        cargarMaterialesIniciales();
    }

    // =====================================================
    // MATERIALES INICIALES
    // =====================================================

    private void cargarMaterialesIniciales() {

        // Libros
        Libro libro1 = new Libro(
                almacen.generarId(),
                "Cien años de soledad",
                1967
        );

        libro1.setAutor("Gabriel García Márquez");

        almacen.guardarLibro(libro1);


        Libro libro2 = new Libro(
                almacen.generarId(),
                "El principito",
                1943
        );

        libro2.setAutor("Antoine de Saint-Exupéry");

        almacen.guardarLibro(libro2);


        // Libros digitales
        LibroDigital digital1 = new LibroDigital(
                almacen.generarId(),
                "Clean Code",
                2008
        );

        digital1.setAutor("Robert C. Martin");
        digital1.setTamanoArchivo(5.5f);

        almacen.guardarLibroDigital(digital1);


        LibroDigital digital2 = new LibroDigital(
                almacen.generarId(),
                "Java Programming",
                2020
        );

        digital2.setAutor("James Gosling");
        digital2.setTamanoArchivo(8.2f);

        almacen.guardarLibroDigital(digital2);


        // Revistas
        Revista revista1 = new Revista(
                almacen.generarId(),
                "National Geographic",
                2024
        );

        revista1.setNumeroEdicion(150);

        almacen.guardarRevista(revista1);


        Revista revista2 = new Revista(
                almacen.generarId(),
                "Muy Interesante",
                2024
        );

        revista2.setNumeroEdicion(320);

        almacen.guardarRevista(revista2);
    }

    // =====================================================
    // REGISTRAR LIBRO
    // =====================================================

    public void registrarLibro() {

        System.out.println("\n========== REGISTRAR LIBRO ==========");

        int id = almacen.generarId();

        System.out.print("Nombre del libro: (Enter para omitir)");
        String nombre = scanner.nextLine();

        System.out.print(
                "Año de publicación (Enter para omitir): "
        );

        String entradaPublicacion = scanner.nextLine();

        int publicacion = 0;

        if (!entradaPublicacion.trim().isEmpty()) {

            try {

                publicacion =
                        Integer.parseInt(
                                entradaPublicacion
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. Se guardará como 0."
                );
            }
        }

        System.out.print(
                "Autor (Enter para omitir): "
        );

        String autor = scanner.nextLine();

        Libro libro = new Libro(
                id,
                nombre,
                publicacion
        );

        libro.setAutor(autor);

        almacen.guardarLibro(libro);

        System.out.println(
                "Libro registrado correctamente."
        );

        System.out.println(
                "ID asignado: " + id
        );
    }

    // =====================================================
    // REGISTRAR REVISTA
    // =====================================================

    public void registrarRevista() {

        System.out.println("\n========= REGISTRAR REVISTA =========");

        int id = almacen.generarId();

        System.out.print("Nombre de la revista (Enter para omitir): ");
        String nombre = scanner.nextLine();

        System.out.print(
                "Año de publicación (Enter para omitir): "
        );

        String entradaPublicacion = scanner.nextLine();

        int publicacion = 0;

        if (!entradaPublicacion.trim().isEmpty()) {

            try {

                publicacion =
                        Integer.parseInt(
                                entradaPublicacion
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. Se guardará como 0."
                );
            }
        }

        System.out.print(
                "Número de edición (Enter para omitir): "
        );

        String entradaEdicion = scanner.nextLine();

        int numeroEdicion = 0;

        if (!entradaEdicion.trim().isEmpty()) {

            try {

                numeroEdicion =
                        Integer.parseInt(
                                entradaEdicion
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Edición inválida. Se guardará como 0."
                );
            }
        }

        Revista revista = new Revista(
                id,
                nombre,
                publicacion
        );

        revista.setNumeroEdicion(numeroEdicion);

        almacen.guardarRevista(revista);

        System.out.println(
                "Revista registrada correctamente."
        );

        System.out.println(
                "ID asignado: " + id
        );
    }

    // =====================================================
    // REGISTRAR LIBRO DIGITAL
    // =====================================================

    public void registrarLibroDigital() {

        System.out.println(
                "\n======= REGISTRAR LIBRO DIGITAL ======="
        );

        int id = almacen.generarId();

        System.out.print("Nombre del libro digital (Enter para omitir): ");
        String nombre = scanner.nextLine();

        System.out.print(
                "Año de publicación (Enter para omitir): "
        );

        String entradaPublicacion = scanner.nextLine();

        int publicacion = 0;

        if (!entradaPublicacion.trim().isEmpty()) {

            try {

                publicacion =
                        Integer.parseInt(
                                entradaPublicacion
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. Se guardará como 0."
                );
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

        String entradaTamano = scanner.nextLine();

        float tamano = 0;

        if (!entradaTamano.trim().isEmpty()) {

            try {

                tamano =
                        Float.parseFloat(
                                entradaTamano
                        );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Tamaño inválido. Se guardará como 0."
                );
            }
        }

        LibroDigital libroDigital =
                new LibroDigital(
                        id,
                        nombre,
                        publicacion
                );

        libroDigital.setAutor(autor);
        libroDigital.setTamanoArchivo(tamano);

        almacen.guardarLibroDigital(
                libroDigital
        );

        System.out.println(
                "Libro digital registrado correctamente."
        );

        System.out.println(
                "ID asignado: " + id
        );
    }

    // =====================================================
    // MOSTRAR MATERIALES CREADOS
    // =====================================================

    public void mostrarCreados() {

        almacen.mostrarInfo();
    }

    // =====================================================
    // PRESTAR MATERIAL
    // =====================================================

    public void prestarMaterial() {

        System.out.println(
                "\n========== PRESTAR MATERIAL =========="
        );

        boolean hayDisponibles =
                almacen.mostrarDisponibles();

        if (!hayDisponibles) {
            return;
        }

        int id = leerEntero(
                "Ingrese el ID del material: "
        );

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
                    "El material ya se encuentra prestado."
            );

            return;
        }

        Prestable prestable =
                (Prestable) material;

        prestable.prestar();

        System.out.println(
                "Material prestado correctamente."
        );
    }

    // =====================================================
    // DEVOLVER MATERIAL
    // =====================================================

    public void devolverMaterial() {

        System.out.println(
                "\n========= DEVOLVER MATERIAL ========="
        );

        boolean hayPrestados =
                almacen.mostrarPrestados();

        if (!hayPrestados) {
            return;
        }

        int id = leerEntero(
                "Ingrese el ID del material: "
        );

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
                    "El material no se encuentra prestado."
            );

            return;
        }

        Prestable prestable =
                (Prestable) material;

        prestable.devolver();

        System.out.println(
                "Material devuelto correctamente."
        );
    }

    // =====================================================
    // DESCARGAR LIBRO DIGITAL
    // =====================================================

    public void descargarMaterial() {

        System.out.println(
                "\n========= DESCARGAR MATERIAL ========="
        );

        boolean hayDescargables =
                almacen.mostrarDescargable();

        if (!hayDescargables) {
            return;
        }

        int id = leerEntero(
                "Ingrese el ID del libro digital: "
        );

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
                    "Este material no se puede descargar."
            );

            return;
        }

        Descargable descargable =
                (Descargable) material;

        descargable.descargar();
    }

    // =====================================================
    // ELIMINAR MATERIAL
    // =====================================================

    public void eliminarMaterial() {

        System.out.println(
                "\n========= ELIMINAR MATERIAL ========="
        );

        almacen.mostrarInfo();

        int id = leerEntero(
                "Ingrese el ID del material a eliminar: "
        );

        almacen.eliminarMaterial(id);
    }

    // =====================================================
    // EDITAR MATERIAL
    // =====================================================

    public void editarMaterial() {

        System.out.println(
                "\n========== EDITAR MATERIAL =========="
        );

        almacen.mostrarInfo();

        int id = leerEntero(
                "Ingrese el ID del material a editar: "
        );

        Material material =
                almacen.buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material con ese ID."
            );

            return;
        }

        /*
         * IMPORTANTE:
         *
         * El ID nunca se modifica.
         *
         * Tampoco modificamos los contadores
         * de materiales, préstamos o descargas.
         */

        // -------------------------
        // NOMBRE
        // -------------------------

        System.out.println(
                "Nombre actual: " +
                material.getNombre()
        );

        System.out.print(
                "Nuevo nombre "
                + "(Enter para conservar): "
        );

        String nuevoNombre =
                scanner.nextLine();

        if (!nuevoNombre.trim().isEmpty()) {

            material.setNombre(nuevoNombre);
        }

        // -------------------------
        // PUBLICACIÓN
        // -------------------------

        System.out.println(
                "Año actual: " +
                material.getPublicacion()
        );

        System.out.print(
                "Nuevo año "
                + "(Enter para conservar): "
        );

        String nuevaPublicacion =
                scanner.nextLine();

        if (!nuevaPublicacion.trim().isEmpty()) {

            try {

                int publicacion =
                        Integer.parseInt(
                                nuevaPublicacion
                        );

                material.setPublicacion(
                        publicacion
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Año inválido. "
                        + "Se conservará el actual."
                );
            }
        }

        // =================================================
        // EDITAR LIBRO
        // =================================================

        if (material instanceof Libro) {

            Libro libro =
                    (Libro) material;

            System.out.println(
                    "Autor actual: " +
                    libro.getAutor()
            );

            System.out.print(
                    "Nuevo autor "
                    + "(Enter para conservar): "
            );

            String nuevoAutor =
                    scanner.nextLine();

            if (!nuevoAutor.trim().isEmpty()) {

                libro.setAutor(nuevoAutor);
            }
        }

        // =================================================
        // EDITAR REVISTA
        // =================================================

        else if (material instanceof Revista) {

            Revista revista =
                    (Revista) material;

            System.out.println(
                    "Edición actual: " +
                    revista.getNumeroEdicion()
            );

            System.out.print(
                    "Nueva edición "
                    + "(Enter para conservar): "
            );

            String nuevaEdicion =
                    scanner.nextLine();

            if (!nuevaEdicion.trim().isEmpty()) {

                try {

                    int edicion =
                            Integer.parseInt(
                                    nuevaEdicion
                            );

                    revista.setNumeroEdicion(
                            edicion
                    );

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Edición inválida. "
                            + "Se conservará la actual."
                    );
                }
            }
        }

        // =================================================
        // EDITAR LIBRO DIGITAL
        // =================================================

        else if (material instanceof LibroDigital) {

            LibroDigital libroDigital =
                    (LibroDigital) material;

            System.out.println(
                    "Autor actual: " +
                    libroDigital.getAutor()
            );

            System.out.print(
                    "Nuevo autor "
                    + "(Enter para conservar): "
            );

            String nuevoAutor =
                    scanner.nextLine();

            if (!nuevoAutor.trim().isEmpty()) {

                libroDigital.setAutor(
                        nuevoAutor
                );
            }

            System.out.println(
                    "Tamaño actual: " +
                    libroDigital.getTamanoArchivo()
            );

            System.out.print(
                    "Nuevo tamaño en MB "
                    + "(Enter para conservar): "
            );

            String nuevoTamano =
                    scanner.nextLine();

            if (!nuevoTamano.trim().isEmpty()) {

                try {

                    float tamano =
                            Float.parseFloat(
                                    nuevoTamano
                            );

                    libroDigital.setTamanoArchivo(
                            tamano
                    );

                } catch (NumberFormatException e) {

                    System.out.println(
                            "Tamaño inválido. "
                            + "Se conservará el actual."
                    );
                }
            }
        }

        System.out.println(
                "\nMaterial editado correctamente."
        );

        System.out.println(
                "El ID se mantuvo en: " +
                material.getId()
        );
    }

    // =====================================================
    // ESTADÍSTICAS
    // =====================================================

    public void mostrarEstadisticas(
            int materialesCreados) {

        int total =
                almacen.getMateriales().size();

        int disponibles = 0;
        int prestados = 0;

        int libros = 0;
        int revistas = 0;
        int librosDigitales = 0;

        int descargas = 0;

        for (Material material :
                almacen.getMateriales()) {

            // -------------------------
            // TIPOS
            // -------------------------

            if (material instanceof Libro) {

                libros++;
            }

            else if (material instanceof Revista) {

                revistas++;
            }

            else if (material instanceof LibroDigital) {

                librosDigitales++;

                LibroDigital digital =
                        (LibroDigital) material;

                descargas +=
                        digital.getCantidadDescargas();
            }

            // -------------------------
            // ESTADO
            // -------------------------

            if (material instanceof Prestable) {

                if (material.isDisponible()) {

                    disponibles++;

                } else {

                    prestados++;
                }
            }
        }

        System.out.println(
                "\n========== ESTADÍSTICAS =========="
        );

        System.out.println(
                "Materiales actuales: " +
                total
        );

        System.out.println(
                "Materiales registrados durante "
                + "la ejecución: " +
                materialesCreados
        );

        System.out.println(
                "Materiales disponibles: " +
                disponibles
        );

        System.out.println(
                "Materiales prestados: " +
                prestados
        );

        System.out.println(
                "Libros: " +
                libros
        );

        System.out.println(
                "Revistas: " +
                revistas
        );

        System.out.println(
                "Libros digitales: " +
                librosDigitales
        );

        System.out.println(
                "Descargas realizadas: " +
                descargas
        );

        System.out.println(
                "================================="
        );
    }

    // =====================================================
    // LEER ENTERO
    // =====================================================

    private int leerEntero(String mensaje) {

        while (true) {

            System.out.print(mensaje);

            String entrada =
                    scanner.nextLine();

            try {

                return Integer.parseInt(
                        entrada
                );

            } catch (NumberFormatException e) {

                System.out.println(
                        "Ingrese un número entero válido."
                );
            }
        }
    }
}