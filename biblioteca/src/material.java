public abstract class Material {

    private int id;
    private String nombre;
    private int publicacion;
    private boolean disponible;

    // Cuenta la cantidad de materiales que existen actualmente
    private static int cantidadMateriales = 0;

    public Material(int id, String nombre, int publicacion) {

        this.id = id;
        this.nombre = nombre;
        this.publicacion = publicacion;

        // Todo material nuevo comienza disponible
        this.disponible = true;

        cantidadMateriales++;
    }

    // =========================
    // GETTERS
    // =========================

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPublicacion() {
        return publicacion;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public static int getCantidadMateriales() {
        return cantidadMateriales;
    }

    // =========================
    // SETTERS
    // =========================

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    // =========================
    // CONTADOR
    // =========================

    /*
     * Se utiliza cuando un material es eliminado
     * del almacén.
     */
    public static void disminuirCantidadMateriales() {

        if (cantidadMateriales > 0) {
            cantidadMateriales--;
        }
    }

    // =========================
    // MÉTODO ABSTRACTO
    // =========================

    public abstract void mostrarInfo();
}