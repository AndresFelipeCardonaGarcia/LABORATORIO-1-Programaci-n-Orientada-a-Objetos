public class Revista extends Material implements Prestable {

    private int numeroEdicion;
    private boolean prestada;

    public Revista(
            int id,
            String nombre,
            int publicacion
    ) {

        super(id, nombre, publicacion);

        this.numeroEdicion = 0;
        this.prestada = false;
    }

    // =========================
    // GETTERS
    // =========================

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public boolean isPrestada() {
        return prestada;
    }

    // =========================
    // SETTERS
    // =========================

    public void setNumeroEdicion(int numeroEdicion) {
        this.numeroEdicion = numeroEdicion;
    }

    // =========================
    // PRESTAR
    // =========================

    @Override
    public void prestar() {

        if (!prestada) {

            prestada = true;

            setDisponible(false);

        } else {

            System.out.println(
                    "La revista ya se encuentra prestada."
            );
        }
    }

    // =========================
    // DEVOLVER
    // =========================

    @Override
    public void devolver() {

        if (prestada) {

            prestada = false;

            setDisponible(true);

        } else {

            System.out.println(
                    "La revista no se encuentra prestada."
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

        System.out.println("Tipo: Revista");

        System.out.println(
                "ID: " + getId()
        );

        System.out.println(
                "Nombre: " + getNombre()
        );

        System.out.println(
                "Número de edición: " +
                numeroEdicion
        );

        System.out.println(
                "Año de publicación: " +
                getPublicacion()
        );

        if (prestada) {

            System.out.println(
                    "Estado: Prestada"
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