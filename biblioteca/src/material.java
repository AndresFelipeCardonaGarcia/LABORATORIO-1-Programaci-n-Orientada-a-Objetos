public abstract class Material {

    private int id;
    private String autor;
    private String nombre;
    private boolean prestable;
    private boolean descargable;
    private boolean disponible;

    private static int contadorMateriales = 0;

    public Material(int id, String autor, String nombre,
                    boolean prestable, boolean descargable) {

        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.prestable = prestable;
        this.descargable = descargable;
        this.disponible = true;

        contadorMateriales++;
    }

    // Sobrecarga de constructor
    public Material(int id, String nombre) {
        this(id, "Desconocido", nombre, false, false);
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

    public boolean isPrestable() {
        return prestable;
    }

    public boolean isDescargable() {
        return descargable;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public static int getContadorMateriales() {
        return contadorMateriales;
    }

    public abstract void mostrarInfo();
}