public class Libro extends Material implements Prestable {

    Libro(int id, String autor, String nombre) {

        super(id, autor, nombre);
    }

    @Override
    public void prestar() {

        if (isDisponible) {
            isDisponible = false;
            System.out.println("El libro fue prestado.");
        } else {
            System.out.println("El libro no está disponible.");
        }
    }

    @Override
    public void devolver() {

        isDisponible = true;
        System.out.println("El libro fue devuelto.");
    }
}