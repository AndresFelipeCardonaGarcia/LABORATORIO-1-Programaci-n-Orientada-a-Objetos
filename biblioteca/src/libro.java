public class Libro extends Material implements Prestable {

    private String autor;
    private boolean prestado;

    public Libro(int id, String nombre, int publicacion) {

        super(id, nombre, publicacion);

        this.autor = "";
        this.prestado = false;
    }

    // =========================
    // GETTERS
    // =========================

    public String getAutor() {
        return autor;
    }

    public boolean isPrestado() {
        return prestado;
    }

    // =========================
    // SETTERS
    // =========================

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // =========================
    // PRESTAR
    // =========================

    @Override
    public void prestar() {

        if (!prestado) {

            prestado = true;

            setDisponible(false);

        } else {

            System.out.println(
                    "El libro ya se encuentra prestado."
            );
        }
    }

    // =========================
    // DEVOLVER
    // =========================

    @Override
    public void devolver() {

        if (prestado) {

            prestado = false;

            setDisponible(true);

        } else {

            System.out.println(
                    "El libro no se encuentra prestado."
            );
        }
    }

    // =========================
    // MOSTRAR INFORMACIÓN
    // =========================

    @Override
    public void mostrarInfo() {

        System.out.println(
                "-----------------------------------"
        );

        System.out.println("Tipo: Libro");

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

        if (prestado) {

            System.out.println(
                    "Estado: Prestado"
            );

        } else {

            System.out.println(
                    "Estado: Disponible"
            );
        }

        System.out.println(
                "-----------------------------------"
        );
    }
}