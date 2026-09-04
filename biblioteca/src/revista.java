public class Revista extends Material implements prestable {

    private int numeroEdicion;
    private boolean prestada;

    public Revista(int Id, String autor, String nombre,
                   int numeroEdicion) {

        super(Id, autor, nombre);

        this.numeroEdicion = numeroEdicion;

        this.prestada = false;
    }

    public int getNumeroEdicion() {

        return numeroEdicion;
    }

    @Override
    public void prestar() {

        if (prestada) {

            System.out.println("La revista ya esta prestada.");

            return;
        }

        prestada = true;

        setDisponible(false);

        System.out.println("Revista prestada correctamente.");
    }

    @Override
    public void devolver() {

        if (!prestada) {

            System.out.println("La revista no estaba prestada.");

            return;
        }

        prestada = false;

        setDisponible(true);

        System.out.println("Revista devuelta correctamente.");
    }

    @Override
    public void mostarInfo() {

        System.out.println("\n=== REVISTA ===");

        System.out.println("ID: " + getId());

        System.out.println("Nombre: " + getNombre());

        System.out.println("Autor: " + getAutor());

        System.out.println("Numero de edicion: " +
                numeroEdicion);

        System.out.println("Estado: " +
                (prestada ? "Prestada" : "Disponible"));
    }
}