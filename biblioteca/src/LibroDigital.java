public class LibroDigital extends Material {
    private float tamanoArchivo;
    public LibroDigital(int id, String autor, String nombre,
                        boolean prestable, boolean descargable,
                        float tamanoArchivo) {
        super(id, autor, nombre, prestable, descargable);
        this.tamanoArchivo = tamanoArchivo;
    }
    public float getTamanoArchivo() {
        return tamanoArchivo;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("\n=== LIBRO DIGITAL ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Autor: " + getAutor());
        System.out.println(
                "Tamaño del archivo: "
                        + tamanoArchivo
                        + " MB"
        );
        System.out.println("Descargable: " + isDescargable());
    }
}