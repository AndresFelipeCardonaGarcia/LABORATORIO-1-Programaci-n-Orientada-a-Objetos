public class LibroDigital
        extends Material
        implements Descargable {

    private String autor;
    private float tamanoArchivo;
    private int cantidadDescargas;

    public LibroDigital(
            int id,
            String nombre,
            int publicacion
    ) {

        super(id, nombre, publicacion);

        this.autor = "";
        this.tamanoArchivo = 0;
        this.cantidadDescargas = 0;
    }

    // =========================
    // GETTERS
    // =========================

    public String getAutor() {
        return autor;
    }

    public float getTamanoArchivo() {
        return tamanoArchivo;
    }

    public int getCantidadDescargas() {
        return cantidadDescargas;
    }

    // =========================
    // SETTERS
    // =========================

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setTamanoArchivo(float tamanoArchivo) {
        this.tamanoArchivo = tamanoArchivo;
    }

    // =========================
    // DESCARGAR
    // =========================

    @Override
    public void descargar() {

        cantidadDescargas++;

        System.out.println(
                "Descarga realizada correctamente."
        );

        System.out.println(
                "Cantidad de descargas: " +
                cantidadDescargas
        );
    }

    // =========================
    // MOSTRAR INFORMACIÓN
    // =========================

    @Override
    public void mostrarInfo() {

        System.out.println(
                "-----------------------------------"
        );

        System.out.println(
                "Tipo: Libro digital"
        );

        System.out.println(
                "ID: " + getId()
        );

        System.out.println(
                "Nombre: " + getNombre()
        );

        System.out.println(
                "Autor: " + autor
        );

        System.out.println(
                "Año de publicación: " +
                getPublicacion()
        );

        System.out.println(
                "Tamaño del archivo: " +
                tamanoArchivo
        );

        System.out.println(
                "Cantidad de descargas: " +
                cantidadDescargas
        );

        System.out.println(
                "Estado: Disponible"
        );

        System.out.println(
                "-----------------------------------"
        );
    }
}   