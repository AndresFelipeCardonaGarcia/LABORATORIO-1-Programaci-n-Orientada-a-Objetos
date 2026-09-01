public class Revista extends Material {

    int numeroEdicion;

    Revista(int id, String autor, String nombre,
            boolean prestable, boolean descargable,
            int numeroEdicion) {

        super(id, autor, nombre, prestable, descargable);

        this.numeroEdicion = numeroEdicion;
    }

    @Override
    void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Numero de edicion: " + numeroEdicion);
    }
}