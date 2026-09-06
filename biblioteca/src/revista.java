public class Revista extends Material implements Prestable {

    private int numeroEdicion;
    private boolean prestada;

    // ==========================================
    // CONSTRUCTORES
    // ==========================================

    public Revista(
            int id,
            String autor,
            String nombre,
            int numeroEdicion) {

        super(id, autor, nombre);

        this.numeroEdicion = numeroEdicion;
        this.prestada = false;
    }

    // Constructor que permite omitir el autor
    public Revista(
            int id,
            String nombre,
            int numeroEdicion) {

        super(id, nombre);

        this.numeroEdicion = numeroEdicion;
        this.prestada = false;
    }

    // Constructor que permite omitir el número de edición
    public Revista(
            int id,
            String autor,
            String nombre) {

        super(id, autor, nombre);

        this.numeroEdicion = 0;
        this.prestada = false;
    }

    // ==========================================
    // GETTER Y SETTER
    // ==========================================

    public int getNumeroEdicion() {

        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {

        this.numeroEdicion = numeroEdicion;
    }

    // ==========================================
    // PRESTAR
    // ==========================================

    @Override
    public void prestar() {

        if (!prestada) {

            prestada = true;
            setDisponible(false);

            System.out.println(
                    "La revista ha sido prestada correctamente."
            );

        } else {

            System.out.println(
                    "La revista ya se encuentra prestada."
            );
        }
    }

    // ==========================================
    // DEVOLVER
    // ==========================================

    @Override
    public void devolver() {

        if (prestada) {

            prestada = false;
            setDisponible(true);

            System.out.println(
                    "La revista ha sido devuelta correctamente."
            );

        } else {

            System.out.println(
                    "La revista no se encuentra prestada."
            );
        }
    }

    // ==========================================
    // MOSTRAR INFORMACIÓN
    // ==========================================

    @Override
    public void mostrarInfo() {

        System.out.println(
                "----------------------------------"
        );

        System.out.println("Tipo: Revista");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());

        if (getAutor().isEmpty()) {

            System.out.println("Autor: Pendiente");

        } else {

            System.out.println(
                    "Autor: " + getAutor()
            );
        }

        if (numeroEdicion == 0) {

            System.out.println(
                    "Número de edición: Pendiente"
            );

        } else {

            System.out.println(
                    "Número de edición: "
                    + numeroEdicion
            );
        }

        if (isDisponible()) {

            System.out.println("Estado: Disponible");

        } else {

            System.out.println("Estado: Prestada");
        }
    }
}
