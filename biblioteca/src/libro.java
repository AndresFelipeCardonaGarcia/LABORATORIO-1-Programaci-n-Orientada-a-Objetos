public class Libro extends Material implements Prestable {

    private boolean prestado;

    public Libro(int id, String autor, String nombre) {
        super(id, autor, nombre);
        this.prestado = false;
    }

    // Constructor que permite omitir el autor
    public Libro(int id, String nombre) {
        super(id, nombre);
        this.prestado = false;
    }

    @Override
    public void prestar() {

        if (!prestado) {
            prestado = true;
            setDisponible(false);

            System.out.println("El libro ha sido prestado correctamente.");
        } else {
            System.out.println("El libro ya se encuentra prestado.");
        }
    }

    @Override
    public void devolver() {

        if (prestado) {
            prestado = false;
            setDisponible(true);

            System.out.println("El libro ha sido devuelto correctamente.");
        } else {
            System.out.println("El libro no se encuentra prestado.");
        }
    }

    @Override
    public void mostrarInfo() {

        System.out.println("----------------------------------");
        System.out.println("Tipo: Libro");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());

        if (getAutor().isEmpty()) {
            System.out.println("Autor: Pendiente");
        } else {
            System.out.println("Autor: " + getAutor());
        }

        if (isDisponible()) {
            System.out.println("Estado: Disponible");
        } else {
            System.out.println("Estado: Prestado");
        }
    }
}