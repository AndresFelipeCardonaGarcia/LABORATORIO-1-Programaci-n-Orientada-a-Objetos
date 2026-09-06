public class LibroDigital extends Material implements Descargable {

    private float tamanoArchivo;
    private int cantidadDescargas;

    // ==========================================
    // CONSTRUCTORES
    // ==========================================

    public LibroDigital(
            int id,
            String autor,
            String nombre,
            float tamanoArchivo) {

        super(id, autor, nombre);

        this.tamanoArchivo = tamanoArchivo;
        this.cantidadDescargas = 0;
    }

    // Constructor que permite omitir el autor
    public LibroDigital(
            int id,
            String nombre,
            float tamanoArchivo) {

        super(id, nombre);

        this.tamanoArchivo = tamanoArchivo;
        this.cantidadDescargas = 0;
    }

    // Constructor que permite omitir el tamaño
    public LibroDigital(
            int id,
            String autor,
            String nombre) {

        super(id, autor, nombre);

        this.tamanoArchivo = 0;
        this.cantidadDescargas = 0;
    }

    // ==========================================
    // GETTER Y SETTER
    // ==========================================

    public float getTamanoArchivo() {

        return tamanoArchivo;
    }

    public void setTamanoArchivo(float tamanoArchivo) {

        this.tamanoArchivo = tamanoArchivo;
    }

    // ==========================================
    // DESCARGAR
    // ==========================================

    @Override
    public void descargar() {

        cantidadDescargas++;

        System.out.println(
                "El libro digital se ha descargado correctamente."
        );

        System.out.println(
                "Cantidad de descargas: "
                + cantidadDescargas
        );
    }

    // ==========================================
    // MOSTRAR INFORMACIÓN
    // ==========================================

    @Override
    public void mostrarInfo() {

        System.out.println(
                "----------------------------------"
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

        if (getAutor().isEmpty()) {

            System.out.println(
                    "Autor: Pendiente"
            );

        } else {

            System.out.println(
                    "Autor: " + getAutor()
            );
        }

        if (tamanoArchivo == 0) {

            System.out.println(
                    "Tamaño del archivo: Pendiente"
            );

        } else {

            System.out.println(
                    "Tamaño del archivo: "
                    + tamanoArchivo
                    + " MB"
            );
        }

        System.out.println(
                "Cantidad de descargas: "
                + cantidadDescargas
        );
    }
}

