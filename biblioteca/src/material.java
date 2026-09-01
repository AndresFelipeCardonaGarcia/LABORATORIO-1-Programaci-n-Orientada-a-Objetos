public class Material {

    int id;
    String autor;
    String nombre;
    boolean isDisponible;

    Material(int id, String autor, String nombre) {

        this.id = id;
        this.autor = autor;
        this.nombre = nombre;
        this.isDisponible = true;
    }

    void mostrarInfo() {
        System.out.println("ID: " + id);
        System.out.println("Autor: " + autor);
        System.out.println("Nombre: " + nombre);
        System.out.println("Disponible: " + isDisponible);
    }
}