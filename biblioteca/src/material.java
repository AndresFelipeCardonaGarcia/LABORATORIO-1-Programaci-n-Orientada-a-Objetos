public abstract class Material {

    private int id;
    private String autor;
    private String nombre;
    private boolean disponible;

    // Contador total de materiales existentes
    private static int cantidadMateriales = 0;

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

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getCantidadMateriales() {
        return cantidadMateriales;
    }

    public abstract void mostrarInfo();
}