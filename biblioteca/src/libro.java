public class Libro extends Material implements prestable {
    private boolean prestado;
    public Libro(int id, String autor, String nombre,
                 boolean prestable, boolean descargable) {
        super(id, autor, nombre, prestable, descargable);
        this.prestado = false;
    }
    @Override
    public void prestar() {
        if (!isPrestable()) {
            System.out.println("Este libro no se puede prestar.");
            return;
        }
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
    public boolean estaPrestado() {
        return prestado;
    }
    @Override
    public void mostrarInfo() {
        System.out.println("\n=== LIBRO ===");
        System.out.println("ID: " + getId());
        System.out.println("Nombre: " + getNombre());
        System.out.println("Autor: " + getAutor());
        System.out.println("Prestable: " + isPrestable());
        System.out.println("Estado: " +
                (prestado ? "Prestado" : "Disponible"));
    }
}