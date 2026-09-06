import java.util.ArrayList;

public class Almacen {

    private ArrayList<Material> materiales;
    private int ultimoId;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Almacen() {
        materiales = new ArrayList<>();
        ultimoId = 0;
    }

    // ==========================================
    // GENERAR ID
    // ==========================================

    public int generarId() {

        ultimoId++;

        return ultimoId;
    }

    // ==========================================
    // GUARDAR LIBRO
    // ==========================================

    public void guardarLibro(Libro libro) {

        materiales.add(libro);
    }

    // ==========================================
    // GUARDAR REVISTA
    // ==========================================

    public void guardarRevista(Revista revista) {

        materiales.add(revista);
    }

    // ==========================================
    // GUARDAR LIBRO DIGITAL
    // ==========================================

    public void guardarLibroDigital(LibroDigital libroDigital) {

        materiales.add(libroDigital);
    }

    // ==========================================
    // BUSCAR MATERIAL
    // ==========================================

    public Material buscarMaterial(int id) {

        for (Material material : materiales) {

            if (material.getId() == id) {

                return material;
            }
        }

        return null;
    }

    // ==========================================
    // MOSTRAR TODOS LOS MATERIALES
    // ==========================================

    public void mostrarInfo() {

        if (materiales.isEmpty()) {

            System.out.println("No hay materiales registrados.");

            return;
        }

        System.out.println("\n========== MATERIALES ==========");

        for (Material material : materiales) {

            material.mostrarInfo();
        }

        System.out.println("----------------------------------");

        System.out.println(
                "Total de materiales: "
                + Material.getCantidadMateriales()
        );
    }

    // ==========================================
    // MOSTRAR MATERIALES DISPONIBLES
    // ==========================================

    public boolean mostrarDisponibles() {

        boolean hayDisponibles = false;

        System.out.println(
                "\n===== MATERIALES DISPONIBLES ====="
        );

        for (Material material : materiales) {

            if (material instanceof Prestable
                    && material.isDisponible()) {

                material.mostrarInfo();

                hayDisponibles = true;
            }
        }

        if (!hayDisponibles) {

            System.out.println(
                    "No hay materiales disponibles."
            );
        }

        return hayDisponibles;
    }

    // ==========================================
    // MOSTRAR MATERIALES PRESTADOS
    // ==========================================

    public void mostrarPrestados() {

        boolean hayPrestados = false;

        System.out.println(
                "\n===== MATERIALES PRESTADOS ====="
        );

        for (Material material : materiales) {

            if (material instanceof Prestable
                    && !material.isDisponible()) {

                material.mostrarInfo();

                hayPrestados = true;
            }
        }

        if (!hayPrestados) {

            System.out.println(
                    "No hay materiales prestados."
            );
        }
    }

    // ==========================================
    // MOSTRAR LIBROS DIGITALES
    // ==========================================

    public boolean mostrarDescargable() {

        boolean hayDescargables = false;

        System.out.println(
                "\n===== LIBROS DIGITALES ====="
        );

        for (Material material : materiales) {

            if (material instanceof Descargable) {

                material.mostrarInfo();

                hayDescargables = true;
            }
        }

        if (!hayDescargables) {

            System.out.println(
                    "No hay libros digitales."
            );
        }

        return hayDescargables;
    }

    // ==========================================
    // ELIMINAR MATERIAL
    // ==========================================

    public boolean eliminarMaterial(int id) {

        Material material = buscarMaterial(id);

        // Verificar que el material exista
        if (material == null) {

            return false;
        }

        // No se puede eliminar un material prestado
        if (!material.isDisponible()) {

            return false;
        }

        // Eliminar el material del almacén
        materiales.remove(material);

        // Disminuir la cantidad total de materiales
        Material.disminuirCantidadMateriales();

        return true;
    }
}