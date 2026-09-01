public class LibroDigital extends Material implements Descargable {

    float tamañoArchivo;
    int numeroDescargas;

    LibroDigital(int id, String autor, String nombre,
                 float tamañoArchivo) {
        super(id, autor, nombre);

        this.tamañoArchivo = tamañoArchivo;
        this.numeroDescargas = 0;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Tamaño del archivo: " + tamañoArchivo);
        System.out.println("Numero de descargas: " + numeroDescargas);
    }

    @Override
    public void descargar() {

        numeroDescargas++;

        System.out.println("Descargando " + nombre + "...");
        System.out.println("Descarga completada.");
    }
}