public class LibroDigital extends Material {

    float tamañoArchivo;
    int numeroDescargas;

    LibroDigital(int id, String autor, String nombre,
                 boolean prestable, boolean descargable,
                 float tamañoArchivo) {

        super(id, autor, nombre, prestable, descargable);

        this.tamañoArchivo = tamañoArchivo;
        this.numeroDescargas = 0;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño del archivo: " + tamañoArchivo);
        System.out.println("Numero de descargas: " + numeroDescargas);
    }

    void descargar() {

        numeroDescargas++;

        System.out.println("Descargando " + nombre + "...");
        System.out.println("Descarga completada.");
    }
}
