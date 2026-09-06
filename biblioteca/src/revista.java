public class Revista extends Material implements Prestable {

    String numeroEdicion;

    // Constructor completo
    Revista(int id, String autor, String nombre, int numeroEdicion) {

        super(id, autor, nombre);

        this.numeroEdicion = String.valueOf(numeroEdicion);
    }

    // Constructor sin autor
    Revista(int id, String nombre, int numeroEdicion) {

        super(id, "", nombre);

        this.numeroEdicion = String.valueOf(numeroEdicion);
    }

    // Constructor sin número de edición
    Revista(int id, String autor, String nombre) {

        super(id, autor, nombre);

        this.numeroEdicion = "Pendiente";
    }

    @Override
    void mostrarInfo() {

        super.mostrarInfo();

        System.out.println("Numero de edicion: " + numeroEdicion);
    }

    @Override
    public void prestar() {

        if (isDisponible) {

            isDisponible = false;

            System.out.println("La revista fue prestada.");

        } else {

            System.out.println("La revista no está disponible.");
        }
    }

    @Override
    public void devolver() {

        isDisponible = true;

        System.out.println("La revista fue devuelta.");
    }
}