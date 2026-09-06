public abstract class Material {

    private int id;
    private String autor;
    private String nombre;
    private boolean disponible;

    // Contador total de materiales existentes
    private static int cantidadMateriales = 0;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public Material(int id, String autor, String nombre) {

        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.disponible = true;

        cantidadMateriales++;
    }

    // Constructor que permite omitir el autor
    public Material(int id, String nombre) {

        this(id, "", nombre);
    }

    // ==========================================
    // GETTERS
    // ==========================================

    public int getId() {

        return id;
    }

    public String getAutor() {

        return autor;
    }

    public String getNombre() {

        return nombre;
    }

    public boolean isDisponible() {

        return disponible;
    }

    // ==========================================
    // SETTERS
    // ==========================================

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public void setNombre(String nombre) {

        this.nombre = nombre;
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

    // Disminuye el contador cuando se elimina un material
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
