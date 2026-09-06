public class LibroDigital extends Material implements Descargable {

    // Atributos propios del libro digital
    private String autor;
    private float tamanoArchivo;

    private int cantidadDescargas;

    // ==========================================
    // CONSTRUCTOR
    // ==========================================

    public LibroDigital(
            int id,
            String nombre,
            int Publicacion,
            String autor,
            float tamanoArchivo) {

        super(
                id,
                nombre,
                Publicacion
        );

        this.autor = autor;
        this.tamanoArchivo = tamanoArchivo;
        this.cantidadDescargas = 0;
    }

    // ==========================================
    // GETTERS Y SETTERS
    // ==========================================

    public String getAutor() {

        return autor;
    }

    public void setAutor(String autor) {

        this.autor = autor;
    }

    public float getTamanoArchivo() {

        return tamanoArchivo;
    }

    public void setTamanoArchivo(
            float tamanoArchivo) {

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
                "Título: " + getNombre()
        );

        if (autor.isEmpty()) {

            System.out.println(
                    "Autor: Pendiente"
            );

        } else {

            System.out.println(
                    "Autor: " + autor
            );
        }

        if (getPublicacion() == 0) {

            System.out.println(
                    "Año de publicación: Pendiente"
            );

        } else {

            System.out.println(
                    "Año de publicación: "
                    + getPublicacion()
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

