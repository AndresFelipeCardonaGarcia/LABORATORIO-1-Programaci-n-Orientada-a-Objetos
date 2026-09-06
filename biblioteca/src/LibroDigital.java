public class LibroDigital extends Material implements Descargable {

    float tamañoArchivo;
    int numeroDescargas;

    // Constructor completo
    LibroDigital(int id, String autor, String nombre, float tamañoArchivo) {

        super(id, autor, nombre);

        this.tamañoArchivo = tamañoArchivo;
        this.numeroDescargas = 0;
    }

    // Constructor sin autor
    LibroDigital(int id, String nombre, float tamañoArchivo) {

        super(id, "", nombre);

        this.tamañoArchivo = tamañoArchivo;
        this.numeroDescargas = 0;
    }

    // Constructor sin tamaño de archivo
    LibroDigital(int id, String autor, String nombre) {

        super(id, autor, nombre);

        this.tamañoArchivo = 0;
        this.numeroDescargas = 0;
    }

    @Override
    void mostrarInfo() {

        super.mostrarInfo();

        System.out.println("Tamaño del archivo: " + tamañoArchivo + " MB");
        System.out.println("Numero de descargas: " + numeroDescargas);
    }

    @Override
    public void descargar() {

        numeroDescargas++;

        System.out.println("Descargando " + nombre + "...");
        System.out.println("Descarga completada.");
    }
}