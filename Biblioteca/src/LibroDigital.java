public class LibroDigital extends Material implements Descargable {

    private float tamanoArchivo;
    private int cantidadDescargado;

    public LibroDigital(int Id, String autor, String nombre,
                        float tamanoArchivo) {

        super(Id, autor, nombre);

        this.tamanoArchivo = tamanoArchivo;

        this.cantidadDescargado = 0;
    }

    public float getTamanoArchivo() {

        return tamanoArchivo;
    }

    public int getCantidadDescargado() {

        return cantidadDescargado;
    }

    @Override
    public void descargar() {

        cantidadDescargado++;

        System.out.println(
                "Libro digital descargado correctamente."
        );

        System.out.println(
                "Cantidad de descargas: " +
                cantidadDescargado
        );
    }

    @Override
    public void mostarInfo() {

        System.out.println("\n=== LIBRO DIGITAL ===");

        System.out.println("ID: " + getId());

        System.out.println("Nombre: " + getNombre());

        System.out.println("Autor: " + getAutor());

        System.out.println(
                "Tamaño del archivo: " +
                tamanoArchivo +
                " MB"
        );

        System.out.println(
                "Cantidad de descargas: " +
                cantidadDescargado
        );
    }
}