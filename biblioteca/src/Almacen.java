import java.util.ArrayList;

public class Almacen {

    private ArrayList<Material> materiales;
    private int ultimoId;

    public Almacen() {

        materiales = new ArrayList<>();
        ultimoId = 0;
    }

    // =========================
    // GENERAR ID
    // =========================

    public int generarId() {

        ultimoId++;

        return ultimoId;
    }

    // =========================
    // GUARDAR MATERIALES
    // =========================

    public void guardarLibro(Libro libro) {

        materiales.add(libro);
    }

    public void guardarRevista(Revista revista) {

        materiales.add(revista);
    }

    public void guardarLibroDigital(
            LibroDigital libroDigital) {

        materiales.add(libroDigital);
    }

    // =========================
    // OBTENER MATERIALES
    // =========================

    public ArrayList<Material> getMateriales() {

        return materiales;
    }

    // =========================
    // BUSCAR MATERIAL
    // =========================

    public Material buscarMaterial(int id) {

        for (Material material : materiales) {

            if (material.getId() == id) {

                return material;
            }
        }

        return null;
    }

    // =========================
    // MOSTRAR TODOS
    // =========================

    public void mostrarInfo() {

        if (materiales.isEmpty()) {

            System.out.println(
                    "No hay materiales registrados."
            );

            return;
        }

        System.out.println(
                "\n========== MATERIALES =========="
        );

        for (Material material : materiales) {

            material.mostrarInfo();
        }

        System.out.println(
                "Total de materiales: " +
                Material.getCantidadMateriales()
        );
    }

    // =========================
    // MOSTRAR DISPONIBLES
    // =========================

    public boolean mostrarDisponibles() {

        boolean hayDisponibles = false;

        System.out.println(
                "\n======= MATERIALES DISPONIBLES ======="
        );

        for (Material material : materiales) {

            /*
             * Solamente los materiales que se pueden
             * prestar aparecen como disponibles.
             *
             * Los libros digitales se manejan mediante
             * descarga y no mediante préstamo.
             */
            if (material instanceof Prestable &&
                    material.isDisponible()) {

                material.mostrarInfo();

                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {

            System.out.println(
                    "No hay materiales disponibles para prestar."
            );
        }

        return hayDisponibles;
    }

    // =========================
    // MOSTRAR PRESTADOS
    // =========================

    public boolean mostrarPrestados() {

        boolean hayPrestados = false;

        System.out.println(
                "\n========= MATERIALES PRESTADOS ========="
        );

        for (Material material : materiales) {

            if (material instanceof Prestable &&
                    !material.isDisponible()) {

                material.mostrarInfo();

                hayPrestados = true;
            }
        }

        if (!hayPrestados) {

            System.out.println(
                    "No hay materiales prestados."
            );
        }

        return hayPrestados;
    }

    // =========================
    // MOSTRAR DESCARGABLES
    // =========================

    public boolean mostrarDescargable() {

        boolean hayDescargables = false;

        System.out.println(
                "\n======= LIBROS DIGITALES ======="
        );

        for (Material material : materiales) {

            if (material instanceof Descargable) {

                material.mostrarInfo();

                hayDescargables = true;
            }
        }

        if (!hayDescargables) {

            System.out.println(
                    "No hay libros digitales registrados."
            );
        }

        return hayDescargables;
    }

    // =========================
    // ELIMINAR MATERIAL
    // =========================

    public boolean eliminarMaterial(int id) {

        Material material = buscarMaterial(id);

        if (material == null) {

            System.out.println(
                    "No existe un material con ese ID."
            );

            return false;
        }

        /*
         * No se puede eliminar un libro o revista
         * mientras esté prestado.
         */
        if (material instanceof Prestable &&
                !material.isDisponible()) {

            System.out.println(
                    "No se puede eliminar un material "
                    + "que se encuentra prestado."
            );

            return false;
        }

        materiales.remove(material);

        /*
         * Al eliminar el objeto del almacén también
         * disminuimos el contador global de materiales.
         */
        Material.disminuirCantidadMateriales();

        System.out.println(
                "Material eliminado correctamente."
        );

        return true;
    }
}