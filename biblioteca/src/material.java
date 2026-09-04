public abstract class Material {

    private int Id;
    private String autor;
    private String nombre;
    private boolean isDisponible;

    private static int cantidadMateriales = 0;

    public Material(int Id, String autor, String nombre) {

        this.Id = Id;
        this.autor = autor;
        this.nombre = nombre;
        this.isDisponible = true;

        cantidadMateriales++;
    }

    public Material(int Id, String nombre) {

        this(Id, "Desconocido", nombre);
    }

    public int getId() {
        return Id;
    }

    public String getAutor() {
        return autor;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return isDisponible;
    }

    public void setDisponible(boolean isDisponible) {
        this.isDisponible = isDisponible;
    }

    public static int getCantidadMateriales() {
        return cantidadMateriales;
    }

    public abstract void mostarInfo();
}