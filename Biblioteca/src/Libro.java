public class Libro extends Material implements prestable {

    private boolean prestado;

    public Libro(int Id, String autor, String nombre) {

        super(Id, autor, nombre);

        this.prestado = false;
    }

    @Override
    public void prestar() {

        if (prestado) {

            System.out.println("El libro ya esta prestado.");

            return;
        }

        prestado = true;

        setDisponible(false);

        System.out.println("Libro prestado correctamente.");
    }

    @Override
    public void devolver() {

        if (!prestado) {

            System.out.println("El libro no estaba prestado.");

            return;
        }

        prestado = false;

        setDisponible(true);

        System.out.println("Libro devuelto correctamente.");
    }

    @Override
    public void mostarInfo() {

        System.out.println("\n=== LIBRO ===");

        System.out.println("ID: " + getId());

        System.out.println("Nombre: " + getNombre());

        System.out.println("Autor: " + getAutor());

        System.out.println("Estado: " +
                (prestado ? "Prestado" : "Disponible"));
    }
}