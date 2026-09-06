public abstract class Material {

    private int id;
    private String nombre;
    private int Publicacion;
    private boolean disponible;

    // Contador total de materiales existentes
    private static int cantidadMateriales = 0;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Material(
            int id,
            String nombre,
            int Publicacion) {

        this.id = id;
        this.nombre = nombre;
        this.Publicacion = Publicacion;
        this.disponible = true;

        cantidadMateriales++;
    }

    // ==========================================
    // GETTERS
    // ==========================================

    public int getId() {

        return id;
    }

    public String getNombre() {

        return nombre;
    }

    public int getPublicacion() {

        return Publicacion;
    }

    public boolean isDisponible() {

        return disponible;
    }

    // ==========================================
    // SETTERS
    // ==========================================

    public void setNombre(String nombre) {

        this.nombre = nombre;
    }

    public void setPublicacion(int anioPublicacion) {

        this.Publicacion = anioPublicacion;
    }

    public void setDisponible(boolean disponible) {

        this.disponible = disponible;
    }

    // ==========================================
    // CONTADOR
    // ==========================================

    public static int getCantidadMateriales() {

        return cantidadMateriales;
    }

    // Disminuye el contador cuando se elimina
    // un material
    public static void disminuirCantidadMateriales() {

        if (cantidadMateriales > 0) {

            cantidadMateriales--;
        }
    }

    // ==========================================
    // MOSTRAR INFORMACIÓN
    // ==========================================

    public abstract void mostrarInfo();
}
